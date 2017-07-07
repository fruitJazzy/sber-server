package ru.sber.tex.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sber.tex.entity.Request;
import ru.sber.tex.entity.Response;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@RestController
@RequestMapping(value = "/api")
public class OfficeController {

	@RequestMapping(
			value = "/account",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response accountInfo(@RequestBody Request request) {
		
		return null;
	}

	@RequestMapping(
			value = "/transactions",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response showOperations(@RequestBody Request request) {
		return null;
	}

	@RequestMapping(
			value = "/transfer",
			method = RequestMethod.POST,
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
	)
	public Response transaction(@RequestBody Request request) {

		return null;
	}
}
