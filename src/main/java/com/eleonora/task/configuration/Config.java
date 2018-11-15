package com.eleonora.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eleonora.task.feign.ITransaction;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Configuration
public class Config {
	@Value("${feign.transaction.url}")
	String iTransactionURL;

	@Bean
	ITransaction transaction() {
		return Feign.builder().encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder()).logger(new Logger.ErrorLogger()).logLevel(Logger.Level.FULL)
				.target(ITransaction.class, iTransactionURL);
	}
}
