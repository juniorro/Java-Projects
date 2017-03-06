package com.main.interfaces;
import org.springframework.data.domain.Page;
import com.main.entities.Account;
import com.main.entities.Transaction;

public interface BankInterface {
	
	public Account checkAccount(String accountcode);
	public void makeDeposit(String accountcode, double theAmount);
	public void makeWithdraw(String accountcode, double theAmount);
	public void Transfer(String accountcode1, String accountcode2, double theAmount);
	public Page<Transaction> TransactionsList(String accountcode, int page, int pagesize);

}
