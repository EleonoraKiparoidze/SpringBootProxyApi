package com.eleonora.task.feign;

import java.util.List;

import com.eleonora.task.model.Transaction;

import feign.Param;
import feign.RequestLine;

public interface ITransaction {

	@RequestLine("GET /?recipt_edrpous={recipt_edrpous}&startdate={startdate}&enddate={enddate}")
	List<Transaction> getTransactions(@Param("recipt_edrpous") String recipt_edrpous,
			@Param("startdate") String startdate, @Param("enddate") String enddate);

}
