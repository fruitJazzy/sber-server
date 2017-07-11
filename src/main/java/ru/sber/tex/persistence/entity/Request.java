package ru.sber.tex.persistence.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by fruitjazzy on 07.07.17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request {
	private Create create;
	private Integer account_number;
	private Integer operations;
	private Transactions transaction;

	public Integer getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}

	public Integer getOperations() {
		return operations;
	}

	public void setOperations(Integer operations) {
		this.operations = operations;
	}

	public Transactions getTransaction() {
		return transaction;
	}

	public void setTransaction(Transactions transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	static class Create {
		private Integer number;
		private Double amount;
		private String name;
		private String lastName;

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
}
