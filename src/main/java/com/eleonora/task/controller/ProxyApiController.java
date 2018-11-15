package com.eleonora.task.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eleonora.task.controller.service.ReadJsonService;
import com.eleonora.task.model.Transaction;

@RestController
public class ProxyApiController {
	private static final String URL =
			"http://api.spending.gov.ua/api/v2/api/transactions/?recipt_edrpous=%s&startdate=%s&enddate=%s";

	@Autowired
	ReadJsonService readJsonService;

	@RequestMapping(value = "/transactions", params = { "recipt_edrpous", "startdate",
			"enddate" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Transaction> getTransactions(@RequestParam("recipt_edrpous") String recipt_edrpous,
			@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate) throws IOException {
		return readJsonService.getTransactions(String.format(URL, recipt_edrpous, startDate, endDate));
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Transaction> test() throws IOException {
		return readJsonService.getTransactions(
				"http://api.spending.gov.ua/api/v2/api/transactions/?recipt_edrpous=00013480&startdate=2018-10-01&enddate=2018-11-01");
	}
}
