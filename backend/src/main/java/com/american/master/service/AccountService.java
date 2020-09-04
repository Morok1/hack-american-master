package com.american.master.service;

import com.american.master.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {
    private final AccountDao dao;
    @Autowired
    public AccountService(AccountDao dao) {
        this.dao = dao;
    }

}
