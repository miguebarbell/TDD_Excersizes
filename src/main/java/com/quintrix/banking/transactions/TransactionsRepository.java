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
	public boolean submitNewTransaction(Transaction transactionToSubmit) {
		// the Account must have the enough money
		Account sourceAccount = accountsDb.findAccountById(transactionToSubmit.sourceAccountId);
		if (transactionToSubmit.amount > sourceAccount.currentBalance) return false;
		transactions.add(transactionToSubmit);
//		else throw new Exception("nopeee");
		return true;
	}
	public void startBatchProcessing(){

	};
	
}
