package com.quintrix.banking.transactions;

import java.util.Date;

public class Transaction {

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
