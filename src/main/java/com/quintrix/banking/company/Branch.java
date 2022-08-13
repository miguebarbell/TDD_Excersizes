package com.quintrix.banking.company;

import java.util.Set;

import javax.persistence.Entity;

import com.quintrix.banking.DataModel;
import com.quintrix.banking.accounts.Account;

public class Branch {

	public String location;
	public Set<Account> accounts;
	
}
