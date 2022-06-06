package bank;

/*bean class , which reusable component */
public class Account {

	private int accountNumber;
	private String name ; // account holder name
	private int balance;
	private int id;
	private String phoneNumber;
	
	/* not the part of Java bean class standard*/
	public Account(String name) {
		this.name = name;
	}
	
	/*must have default constructor*/
	public Account() {
		this.name = "No Name";
	}
	
	public Account(int num, String accName, int accBalance, int identity, String pNumber) {
		accountNumber = num;
		name = accName;
		balance = accBalance;
		phoneNumber = pNumber;
	}

	/* java will not 
	 * create default constructor*/
		
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getId() {
		return id;
	}

	public void setId(int identity) {
		id = identity;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String pNumber) {
		phoneNumber = pNumber;
	}

	public void setAccountNumber(int accNum) {
		accountNumber = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String accHolderName) {
		name = accHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setInitialBalance(int initialBalance) {
		if(initialBalance < 2500)
		{
			System.out.println("Inital Deposit cannot be less than $2500");
		}
		else
		{
			balance = initialBalance;
		}
		
	}
	
	public void setBalance(int newBalance)
	{
		balance = newBalance;
	}
	
	public String showAccountDetails()
	{
		return "Account: "+accountNumber+" \nName: "+name+" \nBalance: $"+balance+" \nID: "+id+" \nPhone Number: "+phoneNumber;
	}
	
}//end of laptop class
