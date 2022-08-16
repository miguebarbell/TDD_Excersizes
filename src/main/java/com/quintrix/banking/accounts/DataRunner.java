package com.quintrix.banking.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {
	@Autowired
	AccountsRepository accountRepository;
	@Override
	public void run(String... args) throws Exception {
		Account newAccount1 = new Account("Thing 1");
		Account newAccount2 = new Account("Thing 2");
		newAccount1.currentBalance = 50.0;
		newAccount2.currentBalance = 0.0;
		accountRepository.addAccount(newAccount1);
		accountRepository.addAccount(newAccount2);
	}
}
