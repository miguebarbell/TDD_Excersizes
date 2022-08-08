package com.quintrix.banking.accounts;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

import com.quintrix.banking.DataModel;
import com.quintrix.banking.company.Branch;
import com.quintrix.banking.transactions.Transaction;

public class Account extends DataModel {
	
	public Set<Transaction> transactions;
	public AccountType type;
	public String ownerName;
	public Date opened;
	public Date closed;
	public Branch homeBranch;
	// Balance after most recent batch
	public double currentBalance;

		
}
