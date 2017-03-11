package bank;

public class Account {
	
	private int pin;
	private float balance;
	private static int accountNumber;
	
	
	public Account(float bal){
		
		++accountNumber;
		
		pin = accountNumber;
		
		balance = bal; 
	}
	
	public void withdraw(float amount){
		
		balance = balance - amount;
	}
	
	public void deposit(float amount){
		
		balance = balance + amount;
	}
	
	
	public String toString(){
		
		return ("Account code: "+pin+ "\nBalance: "+ balance);
	}

	public int getPin() {
		return pin;
	}

	public float getBalance() {
		return balance;
	}

	public static int getAccountNumber() {
		return accountNumber;
	}
	
	
	

}
