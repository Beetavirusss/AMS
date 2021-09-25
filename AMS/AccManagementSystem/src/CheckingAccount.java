

public class CheckingAccount {

	int Accnum =0;
	String Name = new String();
	String Address = new String();
	double phNum=0;
	double balance =0;
    double Tax=0;
	
	
	
	public CheckingAccount(int acc, String name, String add, double phone, double bal  )
	{
		Accnum= acc;
		Name=name;
		Address= add;
		phNum= phone;
		balance= bal;
	    Tax= 1.2;

	}
	
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}


	public int getAccountNum()
	{
		return Accnum;
	}
	
	public String getName()
	{
		return Name;
		
	}
	
	public String getAddress()
	{
		return  Address;
		
	}
	
	public double getphNum()
	{
		return phNum;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	
	// Function to Deposit Cash 
	public void DepositCash(double cash)
	{
		balance = balance + cash;
		
	}
	
	//Function to check balance in the account 
	public void CheckBalance(double cash)
	{
		System.out.print("Name: " + Name + "Balance: " + balance);
	
	}
	
	// Function to withdraw Cash
	public void WithdrawCash(int cash)
	{
		if (balance >= cash)
		{
		   balance=-cash;	
		}
		
		else if (cash-balance > 5000)
		{
			System.out.print("You dont have sufficient Balance in your account");
		}
		else 
		{
		   balance=-cash;	
		}
		
	}
	
	//The transfer method transfers the amount from one bank account to the bank account selected by the user.
	public boolean TransferCash( CheckingAccount account2, int cash)
    
    {
 	   if (cash > balance)
 	   {
 		   return false;

 	   }
 	   
 	   else 
 	   {
 		   this.WithdrawCash(cash);
            account2.DepositCash(cash);
            return true;
 	   }
    }
	
	//Display deductions in account i.e TAX
	public void DisplayAllDeductions()
	{
		System.out.print(" BALANCE " + balance +"\n");
		System.out.print("Tax Deduction " + Tax + "\n");
		balance=-Tax;
		System.out.print("Remaining Balnace= " + balance);
		

	}
	
	// Information of the User 
	public void PrintStatements()
	{
	   System.out.print("Name:  " + Name);
  	   System.out.print("Address:  " + Address);
  	   System.out.print("Phone Num:  " + phNum);
  	   System.out.print("Account Number:  " + Accnum);
  	   System.out.print("Current Balance:  " + balance);
	}
	
	
}
