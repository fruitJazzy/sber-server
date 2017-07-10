package ru.sber.tex.persistence;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by fruitjazzy on 10.07.17.
 */
public class AccountMapperTest extends BaseTest {
	@Autowired
	private AccountMapper mapper;



	@Test
	public void store() throws Exception {
		Account account = new Account();
		account.setNumber(1234);
		account.setAmount(12.3);
		account.setLast_name("Ivanov");
		account.setName("Ivan");
		int i = mapper.store(account);
		assertEquals(1, i);
	}
}