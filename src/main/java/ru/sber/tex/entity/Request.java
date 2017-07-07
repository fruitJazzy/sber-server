package ru.sber.tex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by fruitjazzy on 07.07.17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request {
	private String account_number;
	private String operations;
	private String transaction;

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Request{" +
				"account_number='" + account_number + '\'' +
				", operations='" + operations + '\'' +
				", transaction='" + transaction + '\'' +
				'}';
	}
}
