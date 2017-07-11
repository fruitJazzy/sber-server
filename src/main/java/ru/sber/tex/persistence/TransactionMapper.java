package ru.sber.tex.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import ru.sber.tex.persistence.entity.Transactions;

/**
 * Created by Tpaktop on 7/10/2017.
 */
@Mapper
public interface TransactionMapper {

    @Insert("INSERT INTO transactions (number_from, number_to, transaction_timestamp, amount) " +
            "VALUES (#{number_from}, #{number_to}, #{transaction_timestamp}, #{amount})")
    int store(Transactions transaction);

}
