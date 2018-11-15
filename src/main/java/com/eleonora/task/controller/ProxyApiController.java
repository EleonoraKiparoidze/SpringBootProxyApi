package com.eleonora.task.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eleonora.task.feign.ITransaction;
import com.eleonora.task.model.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.hash.Hashing;

@Controller
public class ProxyApiController {

	@Autowired
	ITransaction iTransaction;

	@RequestMapping(value = "/transactions", params = { "recipt_edrpous", "startdate",
			"enddate" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Transaction> getTransactions(@RequestParam("recipt_edrpous") String recipt_edrpous,
			@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate) throws IOException {
		List<Transaction> transactions = iTransaction.getTransactions(recipt_edrpous, startDate, endDate);
		return transactions.parallelStream()
				.peek(transaction -> transaction.setHash(createHash(createJSON(transaction))))
				.collect(Collectors.toList());
	}

	private String createJSON(Transaction transaction) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(transaction);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
		return jsonInString;
	}

	private String createHash(String jsonString) {
		return Hashing.sha256().hashString(jsonString, StandardCharsets.UTF_8).toString();
	}
}
