package com.eleonora.task.model;

import com.eleonora.task.controller.service.TransactionDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = TransactionDeserializer.class)
public class Transaction {

	private final long id;
	private final String docVob;
	private final String docVobName;
	private final String docNumber;
	private final String docDate;
	private final String docVDate;
	private final String transDate;
	private final double amount;
	private final int amountCop;
	private final String currency;
	private final String payerEdrpou;
	private final String payerName;
	private final String payerAccount;
	private final String payerMfo;
	private final String payerBank;
	private final String reciptEdrpou;
	private final String reciptName;
	private final String reciptAccount;
	private final String reciptBank;
	private final String reciptMfo;
	private final String paymentDetails;
	private final String docAddAttr;
	private final int regionId;
	private final String paymentType;
	private final String paymentData;
	private final int sourceId;
	private final String sourceName;
	private final String hash;

	public Transaction(long id, String docVob, String docVobName, String docNumber, String docDate, String docVDate,
			String transDate, double amount, int amountCop, String currency, String payerEdrpou, String payerName,
			String payerAccount, String payerMfo, String payerBank, String reciptEdrpou, String reciptName,
			String reciptAccount, String reciptBank, String reciptMfo, String paymentDetails, String docAddAttr,
			int regionId, String paymentType, String paymentData, int sourceId, String sourceName, String hash) {
		this.id = id;
		this.docVob = docVob;
		this.docVobName = docVobName;
		this.docNumber = docNumber;
		this.docDate = docDate;
		this.docVDate = docVDate;
		this.transDate = transDate;
		this.amount = amount;
		this.amountCop = amountCop;
		this.currency = currency;
		this.payerEdrpou = payerEdrpou;
		this.payerName = payerName;
		this.payerAccount = payerAccount;
		this.payerMfo = payerMfo;
		this.payerBank = payerBank;
		this.reciptEdrpou = reciptEdrpou;
		this.reciptName = reciptName;
		this.reciptAccount = reciptAccount;
		this.reciptBank = reciptBank;
		this.reciptMfo = reciptMfo;
		this.paymentDetails = paymentDetails;
		this.docAddAttr = docAddAttr;
		this.regionId = regionId;
		this.paymentType = paymentType;
		this.paymentData = paymentData;
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.hash = hash;
	}

	public long getId() {
		return this.id;
	}

	public String getDocVob() {
		return this.docVob;
	}

	public String getDocVobName() {
		return this.docVobName;
	}

	public String getDocNumber() {
		return this.docNumber;
	}

	public String getDocDate() {
		return this.docDate;
	}

	public String getDocVDate() {
		return this.docVDate;
	}

	public String getTransDate() {
		return this.transDate;
	}

	public double getAmount() {
		return this.amount;
	}

	public int getAmountCop() {
		return this.amountCop;
	}

	public String getCurrency() {
		return this.currency;
	}

	public String getPayerEdrpou() {
		return this.payerEdrpou;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}

	public String getPayerMfo() {
		return this.payerMfo;
	}

	public String getPayerBank() {
		return this.payerBank;
	}

	public String getReciptEdrpou() {
		return this.reciptEdrpou;
	}

	public String getReciptName() {
		return this.reciptName;
	}

	public String getReciptAccount() {
		return this.reciptAccount;
	}

	public String getReciptBank() {
		return this.reciptBank;
	}

	public String getReciptMfo() {
		return this.reciptMfo;
	}

	public String getPaymentDetails() {
		return this.paymentDetails;
	}

	public String getDocAddAttr() {
		return this.docAddAttr;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public String getPaymentData() {
		return this.paymentData;
	}

	public int getSourceId() {
		return this.sourceId;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public String getHash() {
		return this.hash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.id ^ (this.id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass() != obj.getClass() )
			return false;
		Transaction other = (Transaction) obj;
		if ( this.id != other.id )
			return false;
		return true;
	}

}
