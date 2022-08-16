package com.quintrix.banking.transactions;

import com.quintrix.banking.accounts.Account;
import com.quintrix.banking.accounts.AccountsRepository;
import com.quintrix.banking.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
@Controller
public class TransactionsRepository /* extends CrudRepository<Transaction, Long> */ {
	@Autowired
	AccountsRepository accountsDb;

//	public Set<Transaction> getAllPendingTransactions(Date date);
	List<Transaction> transactions = new ArrayList<>();

	public boolean submitNewTransaction(Transaction transactionToSubmit) throws Exception {
		Account sourceAccount = accountsDb.findAccountById(transactionToSubmit.sourceAccountId);
		Account destinationAccount = accountsDb.findAccountById(transactionToSubmit.destinationAccountId);
		System.out.println("transactionToSubmit.sourceAccountId = " + transactionToSubmit.sourceAccountId);
		if (transactionToSubmit.amount > sourceAccount.currentBalance) {
			throw new Exception("not enough money");
//			return false;
		} else {
			// this should be live in batch processing
			System.out.println("you have money for the transaction");
			System.out.println(sourceAccount.ownerName + " before = " + sourceAccount.currentBalance);
			sourceAccount.currentBalance -= transactionToSubmit.amount;
			System.out.println(sourceAccount.ownerName + " after = " + sourceAccount.currentBalance);
			System.out.println(destinationAccount.ownerName + " before = " + destinationAccount.currentBalance);
			destinationAccount.currentBalance += transactionToSubmit.amount;
			System.out.println(destinationAccount.ownerName + " after = " + destinationAccount.currentBalance);
			transactions.add(transactionToSubmit);
			return true;
		}
	}
	public void startBatchProcessing(){
		// make a method where holds all transactions until this is executed
		// a for loop where execute all the transactions, and put the state of transferred to the transaction
		System.out.println("batching!!!!");

	}
	
}
