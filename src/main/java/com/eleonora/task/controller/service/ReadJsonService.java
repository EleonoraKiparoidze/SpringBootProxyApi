package com.eleonora.task.controller.service;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.eleonora.task.model.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ReadJsonService {

	public List<Transaction> getTransactions(String url) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Transaction[] transactions = mapper.readValue(new URL(url), Transaction[].class);
			return Arrays.asList(transactions);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
