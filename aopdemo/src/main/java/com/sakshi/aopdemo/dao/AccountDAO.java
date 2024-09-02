package com.sakshi.aopdemo.dao;

import com.sakshi.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount,boolean vipFlag);

    boolean doWork();

}
