package com.quintrix.banking.accounts;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import com.quintrix.banking.company.Branch;
import com.quintrix.banking.transactions.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class Account {
	public Set<Transaction> transactions;
	public AccountType type;
	public boolean isActive;

	public String getOwnerName() {
		return ownerName;
	}

	public String ownerName;
	public Date opened;
	public Date closed;
	public Branch homeBranch;
	public double currentBalance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long id;


	public Account(String ownerName) {
	}
	public Account() {

	}
}
