package ru.sber.tex.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by fruitjazzy on 10.07.17.
 */
@Mapper
public interface AccountMapper {

	@Insert("INSERT INTO account (number, name, last_name, amount) " +
			"VALUES (#{number}, #{name}, #{last_name}, #{amount})")
	int store(Account account);


}
