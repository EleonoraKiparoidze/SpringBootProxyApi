package com.eleonora.test.controller.service;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;

import com.eleonora.test.model.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.hash.Hashing;

@Controller
public class ReadJsonService {

	public List<Transaction> callURL(String url) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Transaction[] transactions = mapper.readValue(new URL(url), Transaction[].class);
			return Arrays.asList(transactions).parallelStream()
					.peek(transaction -> transaction.setHash(getHash(transaction))).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getHash(Transaction transaction) {
		return Hashing.sha256().hashString(getJSON(transaction), StandardCharsets.UTF_8).toString();
	}

	/*
	 * public static void main(String[] args) {
	 * List<Transaction> transactions = callURL(
	 * "http://api.spending.gov.ua/api/v2/api/transactions/?recipt_edrpous=00013480&startdate=2018-10-01&enddate=2018-11-01"
	 * );
	 * System.out.println(transactions);
	 * }
	 */

	public String getJSON(Transaction transaction) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonInString = mapper.writeValueAsString(transaction);
			return jsonInString;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
