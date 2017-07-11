package ru.sber.tex.persistence.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
	private Account account;
	private List<Transactions> transactions;
	private Boolean transfer;
	private Error error;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public Boolean getTransfer() {
		return transfer;
	}

	public void setTransfer(Boolean transfer) {
		this.transfer = transfer;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
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
