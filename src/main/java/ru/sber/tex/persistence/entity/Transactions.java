package ru.sber.tex.persistence.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.Timestamp;

/**
 * Created by fruitjazzy on 10.07.17.
 */
public class Transactions {
	private Integer numberFrom;
	private Integer numberTo;
	private Double amount;
	private Timestamp transaction_time;

	public Integer getNumberFrom() {
		return numberFrom;
	}

	public void setNumberFrom(Integer numberFrom) {
		this.numberFrom = numberFrom;
	}

	public Integer getNumberTo() {
		return numberTo;
	}

	public void setNumberTo(Integer numberTo) {
		this.numberTo = numberTo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Timestamp getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(Timestamp transaction_time) {
		this.transaction_time = transaction_time;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
