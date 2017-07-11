package ru.sber.tex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.tex.persistence.TransactionMapper;
import ru.sber.tex.persistence.entity.Request;
import ru.sber.tex.persistence.entity.Response;
import ru.sber.tex.persistence.AccountMapper;
import ru.sber.tex.persistence.entity.Error;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@RestController
@RequestMapping(value = "/api")
public class OfficeController {

	@Autowired
	private AccountMapper accountMapper;

	@Autowired
	private TransactionMapper transactionMapper;

	@RequestMapping(
			value = "/create",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response create(@RequestBody Request req) {

		return null;
	}


	@RequestMapping(
			value = "/account",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response accountInfo(@RequestBody Request req) {
		Response resp = new Response();
		if (req.getAccount_number() == null) {
			resp.setError(new Error("not correct number"));
			return resp;
		}
		resp.setAccount(accountMapper.find(req.getAccount_number()));
		return resp;
	}

	@RequestMapping(
			value = "/transactions",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response showOperations(@RequestBody Request req) {
		Response resp = new Response();
		if (req.getTransaction() == null) {
			resp.setError(new Error("not correct number"));
			return resp;
		}
		transactionMapper.getAll();
		return null;
	}

	@RequestMapping(
			value = "/transfer",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response transaction(@RequestBody Request req) {

		return null;
	}
}
