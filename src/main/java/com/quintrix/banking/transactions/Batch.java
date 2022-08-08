package com.quintrix.banking.transactions;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

import com.quintrix.banking.DataModel;

public class Batch extends DataModel  {

	public boolean finalized;
	public Set<Transaction> transactions;
	public Date date;
	
	public boolean isFinal() {
		return finalized;
	}
}
