package ru.sber.tex.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sber.tex.persistence.AccountMapper;
import ru.sber.tex.BaseTest;
import ru.sber.tex.persistence.entity.Account;
import ru.sber.tex.persistence.entity.Request;
import ru.sber.tex.persistence.entity.Response;

import static org.junit.Assert.*;

/**
 * Created by Tpaktop on 7/10/2017.
 */
public class OfficeControllerTest extends BaseTest{

    @Autowired
    private OfficeController controller;

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void accountInfo() throws Exception {
        Account account = new Account();
        account.setNumber(1234);
        account.setAmount(44.33);
        account.setLast_name("ivanov");
        account.setFirst_name("ivan");
        accountMapper.store(account);

        Request req = new Request();
        req.setAccount_number(account.getNumber());
        Response response = controller.accountInfo(req);
        Account resAcc = response.getAccount();
        assertEquals(account.getFirst_name(), resAcc.getFirst_name());
        assertEquals(account.getLast_name(), resAcc.getLast_name());
        assertEquals(account.getAmount(), resAcc.getAmount());
        assertEquals(account.getNumber(), resAcc.getNumber());
    }
}