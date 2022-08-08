package com.quintrix.banking.transactions;

import java.util.Date;
import java.util.Set;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface TransactionsRepository /* extends CrudRepository<Transaction, Long> */ {
	
	public Set<Transaction> getAllPendingTransactions(Date date);
	public boolean submitNewTransaction(Transaction transactionToSubmit);
	public Batch startBatchProcessing();
	
}
