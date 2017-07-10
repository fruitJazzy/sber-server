package ru.sber.tex.persistence;

import java.sql.Timestamp;

/**
 * Created by fruitjazzy on 10.07.17.
 */
public class Transactions {
	private long numberFrom;
	private long numberTo;
	private double amount;
	private Timestamp transaction_time;

	public long getNumberFrom() {
		return numberFrom;
	}

	public void setNumberFrom(long numberFrom) {
		this.numberFrom = numberFrom;
	}

	public long getNumberTo() {
		return numberTo;
	}

	public void setNumberTo(long numberTo) {
		this.numberTo = numberTo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(Timestamp transaction_time) {
		this.transaction_time = transaction_time;
	}
}
