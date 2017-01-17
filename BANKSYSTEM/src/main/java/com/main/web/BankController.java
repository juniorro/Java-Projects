package com.main.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.entities.*;
import com.main.interfaces.*;

@Controller
public class BankController {
	
	@Autowired
	private InterfaceImplementation interfaceImplementation;
	
	@RequestMapping("/home")
	public String index(){
		return "homepage";
	}
	
	@RequestMapping("/accounts")
	public String Account(Model model, String accountcode){
		model.addAttribute("accountcode", accountcode);
		try{
			Account acc = interfaceImplementation.checkAccount(accountcode);
			Page<Transaction> pageTransactions = interfaceImplementation.TransactionsList(accountcode, 0, 5);
			model.addAttribute("transactionsList", pageTransactions.getContent());
			model.addAttribute("account", acc);
		}catch(Exception e){
			model.addAttribute("accountException", e);			
		}
		
		return "homepage";
	}
	
	@RequestMapping(value="/transactions", method=RequestMethod.POST)
	public String Transactions(Model model, String operationType, String accountcode, double amount, String accountcode2){
		try{
			if(operationType.equals("deposit")){
			interfaceImplementation.makeDeposit(accountcode, amount);
		}
		
		else if(operationType.equals("withdraw")){
			interfaceImplementation.makeWithdraw(accountcode, amount);
		}
		
		else if(operationType.equals("transfer")){
			interfaceImplementation.Transfer(accountcode, accountcode2, amount);
		}
		}catch(Exception e){
			model.addAttribute("operationException", e);
			return "redirect:/accounts?accountcode="+accountcode+"&operationException="+e.getMessage();
		}
		
		return "redirect:/accounts?accountcode="+accountcode;
	}

}
