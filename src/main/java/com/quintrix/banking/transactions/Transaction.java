package com.quintrix.banking.transactions;

import java.util.Date;

import com.quintrix.banking.DataModel;

public class Transaction extends DataModel {

	public long sourceAccountId;
	public long destinationAccountId;
	public Batch batch;
	public double amount;
	public Date date;
	public String comments;
	public TransactionType type;
	
	public boolean isPendingTransaction() {
		return batch == null || !batch.isFinal();
	}
}
