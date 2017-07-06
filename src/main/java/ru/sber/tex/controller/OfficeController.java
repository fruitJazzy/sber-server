package ru.sber.tex.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.tex.data.Response;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@RestController
public class OfficeController {

	@RequestMapping(value = "/account", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public Response findAccount(
			@RequestParam(value = "account_number") String accountNumber
	) {

		return null;
	}
}