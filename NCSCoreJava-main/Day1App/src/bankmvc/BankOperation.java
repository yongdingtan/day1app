package bankmvc;

import java.util.Iterator;

import bank.Account;

public class BankOperation {
	
	Account arr[] = new Account[1000];
	int count = 0;
	
	
	public Account createAccount(Account a)
	{
		
		
		if(a.getAccountNumber() != 0)
		{
			// save account Database
			arr[count++] = a;
			return a;
		}
		else
		{
			return null;
		}
	
	}
	
	public String changeId(int searchAccountNumber, int id)
	{
		String responseMsg = "error!";
		
		for(int i=0; i<count; i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{
				int oldID = arr[i].getId();
				arr[i].setId(id);
				responseMsg = "ID changed from "+oldID+" to "+id;
				break;
			}
		}
		
		return responseMsg;
	}
	
	public String changeNumber(int searchAccountNumber, String phoneNumber)
	{
		String responseMsg = "error!!";
		
		for(int i=0; i<count; i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{	
				String oldNumber = arr[i].getPhoneNumber();
				arr[i].setPhoneNumber(phoneNumber);
				responseMsg = "Phone number changed from "+oldNumber+" to "+phoneNumber;
				break;
			}
		}
		
		return responseMsg;
	}
	
	public String doDeposit(int searchAccountNumber,int amount)
	{
		String responseMsg = "error!!";
		
		for(int i = 0;i<count;i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{
				arr[i].setInitialBalance(arr[i].getBalance()+amount);
				responseMsg = amount+" added , New Balance is "+arr[i].getBalance();
				break;
			}
		}
		
		return responseMsg;
	}
	
	public String doWithdraw(int searchAccountNumber, int amount)
	{
		String responseMsg = "error!!";
		
		for(int i = 0;i<count;i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{	
				if(amount > arr[i].getBalance())
				{
					responseMsg = "Withdraw amount cannot be greater than balance";
					break;
				}
				arr[i].setBalance(arr[i].getBalance()-amount);
				responseMsg = amount+" withdrawn , New Balance is "+arr[i].getBalance();
				break;
			}
		}
		
		return responseMsg;
	}
	
	public String showDetails(int searchAccountNumber)
	{
		String responseMsg = "error!";
		
		for(int i=0; i<count;i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{
				responseMsg = arr[i].showAccountDetails();
				break;
			}
		}
		
		return responseMsg;
	}
	
	public Account[] getAllAccount()
	{
		return arr;
	}
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAccountBalance(int searchAccountNumber)
	{
		for(int i = 0;i<count;i++)
		{
			if(arr[i].getAccountNumber() == searchAccountNumber)
			{
				return arr[i].getBalance();
			}
		}
		return 0;
	}
	
	public void displayAccountBasedOnRange(int lowestAmount, int highestAmount)
	{
		for(int i=0; i<count; i++)
		{
			if((highestAmount > arr[i].getBalance()) && (arr[i].getBalance() > lowestAmount))
			{
				System.out.println(arr[i].showAccountDetails());
			}
			
		}
	}

}
