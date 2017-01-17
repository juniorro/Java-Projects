package com.main;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.main.entities.Account;
import com.main.entities.Checking;
import com.main.entities.Client;
import com.main.entities.Deposit;
import com.main.entities.Savings;
import com.main.entities.Withdraw;
import com.main.interfaces.*;
import com.main.repositories.AccountRepository;
import com.main.repositories.ClientRepository;
import com.main.repositories.TransactionRepository;

@SpringBootApplication
public class BanksystemApplication implements CommandLineRunner {	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private InterfaceImplementation interfaceImplementation;
	
	public static void main(String[] args) {
		SpringApplication.run(BanksystemApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
//		Client c1 = clientRepository.save(new Client("Morgan Freeman", "freeman@morgan.com"));
//		Client c2 = clientRepository.save(new Client("Jackson Samuel", "samuel@jackson.com"));
//		Client c3 = clientRepository.save(new Client("Denzel Washington", "denzel@washington.com"));
//		Client c4 = clientRepository.save(new Client("Kevin Hart", "hevin@hart.com"));
//		Client c5 = clientRepository.save(new Client("Micheal White", "micheal@white.com"));
//	
//		//---------------------------------------------------
//		
//		Account ac1 = accountRepository.save(new Checking("CA", new Date(), 1000, c1, 500));
//		Account ac2 = accountRepository.save(new Savings("SA", new Date(), 10000, c1, 2.5));
//		
//		//---------------------------------------------------
//		
//		transactionRepository.save(new Deposit(new Date(), 2000.00, ac1));
//		transactionRepository.save(new Deposit(new Date(), 6000.00, ac1));
//		
//		
//		
//		transactionRepository.save(new Withdraw(new Date(), 400.00, ac1));
//		transactionRepository.save(new Withdraw(new Date(), 600.00, ac1));
//		
//		//---------------------------------------------------		
//		
//		transactionRepository.save(new Deposit(new Date(), 100.00, ac2));
//		transactionRepository.save(new Deposit(new Date(), 600.00, ac2));
//		
//		transactionRepository.save(new Withdraw(new Date(), 400.00, ac2));
//		transactionRepository.save(new Withdraw(new Date(), 600.00, ac2));
//		
//		
//		//---------------------------------------------------
//		
//		interfaceImplementation.makeDeposit("CA", 400.00);
//		interfaceImplementation.makeDeposit("CA", 500.00);
//		interfaceImplementation.makeDeposit("CA", 300.00);
//		interfaceImplementation.makeDeposit("CA", 200.00);
//		interfaceImplementation.makeDeposit("CA", 100.00);
//		interfaceImplementation.makeDeposit("CA", 800.00);
		
		
	}
	
	
}
















