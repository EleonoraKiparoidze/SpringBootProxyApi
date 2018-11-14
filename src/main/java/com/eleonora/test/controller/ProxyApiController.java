package com.eleonora.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eleonora.test.controller.service.ReadJsonService;
import com.eleonora.test.model.Transaction;

@RestController
public class ProxyApiController {
	private static final String URL =
			"http://api.spending.gov.ua/api/v2/api/transactions/?recipt_edrpous=%s&startdate=%s&enddate=%s";

	@Autowired
	ReadJsonService readJsonService;

	@RequestMapping(value = "/recipt_edrpous={recipt_edrpous}/startdate={startdate2}/enddate={enddate2}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Transaction> welcome(@PathVariable("recipt_edrpous") String recipt_edrpous,
			@PathVariable("startdate2") String startDate, @PathVariable("enddate2") String endDate) {
		return readJsonService.callURL(String.format(URL, recipt_edrpous, startDate, endDate));
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Transaction> welcome() {
		return readJsonService.callURL(
				"http://api.spending.gov.ua/api/v2/api/transactions/?recipt_edrpous=00013480&startdate=2018-10-01&enddate=2018-11-01");
	}
}
