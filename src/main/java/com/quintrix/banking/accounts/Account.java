package com.quintrix.banking.accounts;

import java.time.LocalDate;
import java.util.Set;

import com.quintrix.banking.company.Branch;
import com.quintrix.banking.transactions.Transaction;

public class Account {
	public static int idCount = 0;
	public Set<Transaction> transactions;
	public AccountType type;
	public boolean isActive;
	public String ownerName;
	public LocalDate opened;
	public LocalDate closed;
	public Branch homeBranch;
	// Balance after most recent batch
	public double currentBalance;

	public long getId() {
		return id;
	}

	public long id;


	public Account(String ownerName) {
		this.ownerName = ownerName;
		this.isActive = true;
		this.opened = LocalDate.now();
		this.id = idCount + 1;
		idCount++;
	}
}
