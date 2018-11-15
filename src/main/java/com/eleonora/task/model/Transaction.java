package com.eleonora.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

	private long id;
	@JsonProperty("doc_vob")
	private String docVob;
	@JsonProperty("doc_vob_name")
	private String docVobName;
	@JsonProperty("doc_number")
	private String docNumber;
	@JsonProperty("doc_date")
	private String docDate;
	@JsonProperty("doc_v_date")
	private String docVDate;
	@JsonProperty("trans_date")
	private String transDate;
	@JsonProperty("amount")
	private double amount;
	@JsonProperty("amount_cop")
	private long amountCop;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("payer_edrpou")
	private String payerEdrpou;
	@JsonProperty("payer_name")
	private String payerName;
	@JsonProperty("payer_account")
	private String payerAccount;
	@JsonProperty("payer_mfo")
	private String payerMfo;
	@JsonProperty("payer_bank")
	private String payerBank;
	@JsonProperty("recipt_edrpou")
	private String reciptEdrpou;
	@JsonProperty("recipt_name")
	private String reciptName;
	@JsonProperty("recipt_account")
	private String reciptAccount;
	@JsonProperty("recipt_bank")
	private String reciptBank;
	@JsonProperty("recipt_mfo")
	private String reciptMfo;
	@JsonProperty("payment_details")
	private String paymentDetails;
	@JsonProperty("doc_add_attr")
	private String docAddAttr;
	@JsonProperty("region_id")
	private int regionId;
	@JsonProperty("payment_type")
	private String paymentType;
	@JsonProperty("payment_data")
	private String paymentData;
	@JsonProperty("source_id")
	private int sourceId;
	@JsonProperty("source_name")
	private String sourceName;
	@JsonProperty("hash")
	private String hash;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocVob() {
		return this.docVob;
	}

	public void setDocVob(String docVob) {
		this.docVob = docVob;
	}

	public String getDocVobName() {
		return this.docVobName;
	}

	public void setDocVobName(String docVobName) {
		this.docVobName = docVobName;
	}

	public String getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getDocDate() {
		return this.docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getDocVDate() {
		return this.docVDate;
	}

	public void setDocVDate(String docVDate) {
		this.docVDate = docVDate;
	}

	public String getTransDate() {
		return this.transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getAmountCop() {
		return this.amountCop;
	}

	public void setAmountCop(long amountCop) {
		this.amountCop = amountCop;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayerEdrpou() {
		return this.payerEdrpou;
	}

	public void setPayerEdrpou(String payerEdrpou) {
		this.payerEdrpou = payerEdrpou;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerMfo() {
		return this.payerMfo;
	}

	public void setPayerMfo(String payerMfo) {
		this.payerMfo = payerMfo;
	}

	public String getPayerBank() {
		return this.payerBank;
	}

	public void setPayerBank(String payerBank) {
		this.payerBank = payerBank;
	}

	public String getReciptEdrpou() {
		return this.reciptEdrpou;
	}

	public void setReciptEdrpou(String reciptEdrpou) {
		this.reciptEdrpou = reciptEdrpou;
	}

	public String getReciptName() {
		return this.reciptName;
	}

	public void setReciptName(String reciptName) {
		this.reciptName = reciptName;
	}

	public String getReciptAccount() {
		return this.reciptAccount;
	}

	public void setReciptAccount(String reciptAccount) {
		this.reciptAccount = reciptAccount;
	}

	public String getReciptBank() {
		return this.reciptBank;
	}

	public void setReciptBank(String reciptBank) {
		this.reciptBank = reciptBank;
	}

	public String getReciptMfo() {
		return this.reciptMfo;
	}

	public void setReciptMfo(String reciptMfo) {
		this.reciptMfo = reciptMfo;
	}

	public String getPaymentDetails() {
		return this.paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getDocAddAttr() {
		return this.docAddAttr;
	}

	public void setDocAddAttr(String docAddAttr) {
		this.docAddAttr = docAddAttr;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentData() {
		return this.paymentData;
	}

	public void setPaymentData(String paymentData) {
		this.paymentData = paymentData;
	}

	public int getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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
