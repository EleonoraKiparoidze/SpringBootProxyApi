package com.eleonora.test.model;

public class Transaction {
	private long id;
	private String doc_vob;
	private String doc_vob_name;
	private String doc_number;
	private String doc_date;
	private String doc_v_date;
	private String trans_date;
	private double amount;
	private long amount_cop;
	private String currency;
	private String payer_edrpou;
	private String payer_name;
	private String payer_account;
	private String payer_mfo;
	private String payer_bank;
	private String recipt_edrpou;
	private String recipt_name;
	private String recipt_account;
	private String recipt_bank;
	private String recipt_mfo;
	private String payment_details;
	private String doc_add_attr;
	private long region_id;
	private String payment_type;
	private String payment_data;
	private long source_id;
	private String source_name;
	private String hash;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoc_vob() {
		return this.doc_vob;
	}

	public void setDoc_vob(String doc_vob) {
		this.doc_vob = doc_vob;
	}

	public String getDoc_vob_name() {
		return this.doc_vob_name;
	}

	public void setDoc_vob_name(String doc_vob_name) {
		this.doc_vob_name = doc_vob_name;
	}

	public String getDoc_number() {
		return this.doc_number;
	}

	public void setDoc_number(String doc_number) {
		this.doc_number = doc_number;
	}

	public String getDoc_date() {
		return this.doc_date;
	}

	public void setDoc_date(String doc_date) {
		this.doc_date = doc_date;
	}

	public String getDoc_v_date() {
		return this.doc_v_date;
	}

	public void setDoc_v_date(String doc_v_date) {
		this.doc_v_date = doc_v_date;
	}

	public String getTrans_date() {
		return this.trans_date;
	}

	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getAmount_cop() {
		return this.amount_cop;
	}

	public void setAmount_cop(long amount_cop) {
		this.amount_cop = amount_cop;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayer_edrpou() {
		return this.payer_edrpou;
	}

	public void setPayer_edrpou(String payer_edrpou) {
		this.payer_edrpou = payer_edrpou;
	}

	public String getPayer_name() {
		return this.payer_name;
	}

	public void setPayer_name(String payer_name) {
		this.payer_name = payer_name;
	}

	public String getPayer_account() {
		return this.payer_account;
	}

	public void setPayer_account(String payer_account) {
		this.payer_account = payer_account;
	}

	public String getPayer_mfo() {
		return this.payer_mfo;
	}

	public void setPayer_mfo(String payer_mfo) {
		this.payer_mfo = payer_mfo;
	}

	public String getPayer_bank() {
		return this.payer_bank;
	}

	public void setPayer_bank(String payer_bank) {
		this.payer_bank = payer_bank;
	}

	public String getRecipt_edrpou() {
		return this.recipt_edrpou;
	}

	public void setRecipt_edrpou(String recipt_edrpou) {
		this.recipt_edrpou = recipt_edrpou;
	}

	public String getRecipt_name() {
		return this.recipt_name;
	}

	public void setRecipt_name(String recipt_name) {
		this.recipt_name = recipt_name;
	}

	public String getRecipt_account() {
		return this.recipt_account;
	}

	public void setRecipt_account(String recipt_account) {
		this.recipt_account = recipt_account;
	}

	public String getRecipt_bank() {
		return this.recipt_bank;
	}

	public void setRecipt_bank(String recipt_bank) {
		this.recipt_bank = recipt_bank;
	}

	public String getRecipt_mfo() {
		return this.recipt_mfo;
	}

	public void setRecipt_mfo(String recipt_mfo) {
		this.recipt_mfo = recipt_mfo;
	}

	public String getPayment_details() {
		return this.payment_details;
	}

	public void setPayment_details(String payment_details) {
		this.payment_details = payment_details;
	}

	public String getDoc_add_attr() {
		return this.doc_add_attr;
	}

	public void setDoc_add_attr(String doc_add_attr) {
		this.doc_add_attr = doc_add_attr;
	}

	public long getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(long region_id) {
		this.region_id = region_id;
	}

	public String getPayment_type() {
		return this.payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayment_data() {
		return this.payment_data;
	}

	public void setPayment_data(String payment_data) {
		this.payment_data = payment_data;
	}

	public long getSource_id() {
		return this.source_id;
	}

	public void setSource_id(long source_id) {
		this.source_id = source_id;
	}

	public String getSource_name() {
		return this.source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + this.id + ", doc_vob=" + this.doc_vob + ", doc_vob_name=" + this.doc_vob_name
				+ ", doc_number=" + this.doc_number + ", doc_date=" + this.doc_date + ", doc_v_date=" + this.doc_v_date
				+ ", trans_date=" + this.trans_date + ", amount=" + this.amount + ", amount_cop=" + this.amount_cop
				+ ", currency=" + this.currency + ", payer_edrpou=" + this.payer_edrpou + ", payer_name="
				+ this.payer_name + ", payer_account=" + this.payer_account + ", payer_mfo=" + this.payer_mfo
				+ ", payer_bank=" + this.payer_bank + ", recipt_edrpou=" + this.recipt_edrpou + ", recipt_name="
				+ this.recipt_name + ", recipt_account=" + this.recipt_account + ", recipt_bank=" + this.recipt_bank
				+ ", recipt_mfo=" + this.recipt_mfo + ", payment_details=" + this.payment_details + ", doc_add_attr="
				+ this.doc_add_attr + ", region_id=" + this.region_id + ", payment_type=" + this.payment_type
				+ ", payment_data=" + this.payment_data + ", source_id=" + this.source_id + ", source_name="
				+ this.source_name + ", hash=" + this.hash + "]";
	}
}
