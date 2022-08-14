package com.quintrix.banking.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountsRepository /* extends CrudRepository<Account, Long> */ {
	public List<Account> accounts = new ArrayList<>();

	public Account findAccountById(long i) {

		System.out.println("find account by id = " + i);
		return accounts.stream().filter(account -> account.getId() == i).findFirst().get();
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
			if (posible != null) {
				return posible;
			}
		}
		return posible;
	}

	public void updateAccount(Account account) {


	}

	public void closeAccount(Account testAccount) {
//		accounts.remove(testAccount);
		testAccount.closed = LocalDate.now();
	}
	public long getNextId() {
		return accounts.size() + 1;
	}

//
//	public Account findAccountByOwnerName(String location) {
//
//	}
//	public Account findAccountById(long id);
//	public Account addAccount(Account accountToAdd);
//	public boolean closeAccount(Account accountToClose);
//	public boolean updateAccount(Account updatedAccount);
	
}
