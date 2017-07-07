package ru.sber.tex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
	private Account account;
	private List<Transaction> transactions;
	private TransferResult transfer;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public static void main(String[] args) {
		Response re = new Response();
		List<Transaction> list = new ArrayList<>();
		Transaction t = new Transaction();
		t.setAmount(123);
		t.setFrom("from");
		t.setTo("to");
		list.add(t);
		Transaction t1 = new Transaction();
		t.setAmount(122);
		t.setFrom("from");
		t.setTo("to1");
		list.add(t1);

		re.setTransactions(list);

		System.out.println(re);
	}
}
