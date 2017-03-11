package bank;

public class Application {

	public static void main(String[] args) {
		
		Account account1 = new Account(500);
		
		Account account2 = new Account(1000);
		
		Account account3 = new Account(700);
		
		System.out.println(account1.toString());
		System.out.println();
		
		System.out.println(account2.toString());
		
		System.out.println();
		System.out.println(account3.toString());
		
		//----------------------------------------------------
		
		System.out.println();
		System.out.println("First Account Pin: "+account1.getPin());
		System.out.println();
		System.out.println("Second Account Pin: "+account2.getPin());
		System.out.println();
		System.out.println("Third Account Pin: "+account3.getPin());
		
		account1.deposit(500);
		System.out.println();
		System.out.println("Account 1 balance after deposit: "+account1.getBalance());
		
		account1.withdraw(400);
		System.out.println("\nAccount 1 balance after withdraw: "+account1.getBalance());

	}

}
