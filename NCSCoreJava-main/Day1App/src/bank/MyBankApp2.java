package bank;

import java.util.Scanner;

public class MyBankApp2 {

	Scanner sc = new Scanner(System.in);
	Scanner stringScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MyBankApp2 app = new MyBankApp2();
		
		// --------------------------------
		/*admin user*/
		Account a1 = new Account();
		app.createAccount(a1);
		
		/*normal client*/
		app.depositAmount(a1);
		app.checkBalance(a1);
		
		
		// ---------------------------------------
		/*admin user*/
		Account a2 = new Account();
		app.createAccount(a2);
		
		/*normal client*/
		app.depositAmount(a2);
		app.checkBalance(a2);
		
		
		
	}//end main
	
							// need to access account 
	public void depositAmount(Account a)
	{
		System.out.println("Enter the Amount to deposit :-  ");
		int amountToDeposit = sc.nextInt(); // UI layer
		
		
		
		// fetch original balance 
		int balance = a.getBalance(); // from Database
		
		// add the new amount 
		int newBalance = balance + amountToDeposit; // critial business operation
		a.setBalance(newBalance);
		
	}
	
	public void checkBalance(Account a)
	{
		System.out.println(" Account Balance :- "+a.getBalance());
		System.out.println("\n-------------------------------------------------\n");
	}
	
	public void createAccount(Account a)
	{
		
		System.out.println("Enter the Account Holder Name ");
		String name = stringScanner.nextLine();
		
		System.out.println("Enter the Account Number ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the Account Initial Balance ");
		int balance = sc.nextInt();
		
		
		a.setAccountNumber(accNumber);
		a.setBalance(balance);
		a.setName(name);
		
		System.out.println(" Account Created !!");
		
	} // end of method create Acc
	
}//end class
