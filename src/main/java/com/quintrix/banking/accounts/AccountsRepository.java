package com.quintrix.banking.accounts;

public interface AccountsRepository /* extends CrudRepository<Account, Long> */ {

	public Account findAccountByOwnerName(String location);
	public Account findAccountById(long id);
	public Account addAccount(Account accountToAdd);
	public boolean closeAccount(Account accountToClose);
	public boolean updateAccount(Account updatedAccount);
	
}
