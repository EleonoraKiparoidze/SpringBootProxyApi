package com.eleonora.task.controller.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.eleonora.task.model.Transaction;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;
import com.google.common.hash.Hashing;

public class TransactionDeserializer extends StdDeserializer<Transaction> {

	private static final long serialVersionUID = -6653960374625138600L;

	public TransactionDeserializer() {
		this(null);
	}

	public TransactionDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Transaction deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		if ( node == null ) {
			return null;
		}

		long id = node.get("id").asLong();
		String docVob = node.get("doc_vob").asText();
		String docVobName = node.get("doc_vob_name").asText();
		String docNumber = node.get("doc_number").asText();
		String docDate = node.get("doc_date").asText();
		String docVDate = node.get("doc_v_date").asText();
		String transDate = node.get("trans_date").asText();
		double amount = node.get("amount").asDouble();
		int amountCop = node.get("amount_cop").asInt();
		String currency = node.get("currency").asText();
		String payerEdrpou = node.get("payer_edrpou").asText();
		String payerName = node.get("payer_name").asText();
		String payerAccount = node.get("payer_account").asText();
		String payerMfo = node.get("payer_mfo").asText();
		String payerBank = node.get("payer_bank").asText();
		String reciptEdrpou = node.get("recipt_edrpou").asText();
		String reciptName = node.get("recipt_name").asText();
		String reciptAccount = node.get("recipt_account").asText();
		String reciptBank = node.get("recipt_bank").asText();
		String reciptMfo = node.get("recipt_mfo").asText();
		String paymentDetails = node.get("payment_details").asText();
		String docAddAttr = node.get("doc_add_attr").asText();
		int regionId = (Integer) ((IntNode) node.get("region_id")).numberValue();
		String paymentType = node.get("payment_type").asText();
		String paymentData = node.get("payment_data").asText();
		int sourceId = node.get("source_id").asInt();
		String sourceName = node.get("source_name").asText();
		String hash = createHash(node.toString());

		return new Transaction(id, docVob, docVobName, docNumber, docDate, docVDate, transDate, amount, amountCop,
				currency, payerEdrpou, payerName, payerAccount, payerMfo, payerBank, reciptEdrpou, reciptName,
				reciptAccount, reciptBank, reciptMfo, paymentDetails, docAddAttr, regionId, paymentType, paymentData,
				sourceId, sourceName, hash);
	}

	private String createHash(String jsonString) {
		return Hashing.sha256().hashString(jsonString, StandardCharsets.UTF_8).toString();
	}
}