package bank;

import java.util.Scanner;

public class MyBankApp {
	
	Scanner sc = new Scanner(System.in);
	Account a = new Account(); // default , class scope account 
	
	public static void main(String[] args) {
		
		MyBankApp app = new MyBankApp();
		
		app.createAccount(); // admin
		app.depositAmount(); // user insert some amount
		app.checkBalance();  // user check balance
		
		
		
	}
	// called by the bank admin
	public void createAccount()
	{
		
		System.out.println("Enter the Account Holder Name ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Account Number ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the Account Initial Balance ");
		int balance = sc.nextInt();
		
		//Account a = new Account(); // local to the method
		   /* bcoz account declared in class scope */
		a.setAccountNumber(accNumber);
		a.setBalance(balance);
		a.setName(name);
		
		System.out.println(a.showAccountDetails());
		
	} // end of method create Acc
	
	/* banking user call this use case*/
	public void depositAmount()
	{
		System.out.println("Enter the Amount to deposit :-  ");
		int amountToDeposit = sc.nextInt();
		
		// need to access account 
		
		// fetch original balance 
		int balance = a.getBalance();
		
		// add the new amount 
		int newBalance = balance + amountToDeposit;
		a.setBalance(newBalance);
		
	}
	
	
	
	public void checkBalance()
	{
		System.out.println(" Account Balance :- "+a.getBalance());
	}
	public void fundTransfer()
	{
		
	}
	
	
}
