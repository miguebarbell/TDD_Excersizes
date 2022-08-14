package com.quintrix.banking.accounts;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class AccountsRepository /* extends CrudRepository<Account, Long> */ {
	public List<Account> accounts = new ArrayList<>();

	public Account findAccountById(long id) {
		System.out.println("find account by id = " + id);
		Account returnAccount = null;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getId() == id) {
				return accounts.get(i);
			}
		}
		return returnAccount;
	}

	public void addAccount(Account newAccount) {
		newAccount.setId(accounts.size() + 1);
		accounts.add(newAccount);
	}

	public Account findAccountByOwnerName(String ownername) {
		String[] posibilities = ownername.split("\\W*\\s+");
		Account posible = new Account("test");
		for (String s : posibilities) {
			posible = accounts.stream()
			                          .filter(account -> account.getOwnerName().toLowerCase().contains(s.toLowerCase()))
																.findFirst().orElse(posible);
		}
		return posible;
	}

	public void updateAccount(Account account) {
	}

	public void closeAccount(Account testAccount) {
		testAccount.closed = new Date();
	}
	public long getNextId() {
		return accounts.size() + 1;
	}
}
