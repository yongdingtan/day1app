package arrays;

import bank.Account;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// int arr[] = new int[5];
		Account arr[] = new Account[3];
		
		ArrayDemo2 app = new ArrayDemo2();
		app.insertAccounts(arr);
		System.out.println("----------------------");
		app.displayAccounts(arr);
		System.out.println("----------------------");
		app.getAllAccountByBalance(8000, arr);
		System.out.println("----------------------");
		Account a = app.getAccountById(111, arr);
		if(a!=null)
		System.out.println(a.showAccountDetails());
		else
			System.out.println("Wrong ID ");
		
	}
	public void insertAccounts(Account arr[])
	{
	}
	
	public void displayAccounts(Account arr[])
	{
		for (Account account : arr) {
			System.out.println(account.showAccountDetails());
		}
	}
	
	public void getAllAccountByBalance(int criteria,Account arr[])
	{
		for (Account account : arr) {
			if(account.getBalance() < criteria)
			{
				System.out.println(account.showAccountDetails());
			}
		}
	}
	
	public Account getAccountById(int searchId,Account arr[])
	{
		for (Account account : arr) {
			if(account.getAccountNumber() == searchId)
			{
				return account;
			}
		}
		return null;
	}

}
