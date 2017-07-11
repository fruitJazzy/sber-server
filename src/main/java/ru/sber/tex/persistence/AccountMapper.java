package ru.sber.tex.persistence;

import org.apache.ibatis.annotations.*;
import ru.sber.tex.persistence.entity.Account;

import java.util.List;

/**
 * Created by fruitjazzy on 10.07.17.
 */
@Mapper
public interface AccountMapper {

	@Insert("INSERT INTO account (number, first_name, last_name, amount) " +
			"VALUES (#{number}, #{first_name}, #{last_name}, #{amount})")
	int store(Account account);

	@Select("SELECT * FROM account " +
			"WHERE number=#{number}")
	Account find(@Param("number") Integer number);

	@Select("SELECT * FROM account")
	List<Account> getAll();

	@Delete("DELETE FROM account")
	void clear();
}