package ru.sber.tex.persistence;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sber.tex.persistence.entity.Account;

import static org.junit.Assert.assertEquals;

/**
 * Created by fruitjazzy on 10.07.17.
 */
public class AccountMapperTest extends BaseTest {
	@Autowired
	private AccountMapper mapper;

	@Before
	public void clear() {
		mapper.clear();
	}

	@Test
	public void store() throws Exception {
		Account account = new Account();
		account.setNumber(1234);
		account.setAmount(12.3);
		account.setLast_name("Ivanov");
		account.setFirst_name("Ivan");
		int i = mapper.store(account);
		assertEquals(1, i);
	}

	@Test
	public void getAll() {
		Account account = new Account();
		account.setNumber(1234);
		account.setAmount(12.3);
		account.setLast_name("Ivanov");
		account.setFirst_name("Ivan");
		mapper.store(account);

		account.setNumber(1235);
		account.setAmount(13.3);
		account.setLast_name("Semenov");
		account.setFirst_name("Semen");
		mapper.store(account);
		assertEquals(2, mapper.getAll().size());
	}
}