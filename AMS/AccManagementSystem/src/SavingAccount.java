public class SavingAccount
{
    	int Accnum =0;
	    String Name = new String();
	    String Address = new String();
	    double phNum=0;
	    double balance =0;
        double InterestRate=0;

        
       public SavingAccount(int an, String n, String add, double num, double bal, double interest)
       {
    	   Accnum= an;
    	   Name=n;
    	   Address=add;
    	   phNum=num;
    	   balance= bal;
    	   InterestRate=interest;
       }
       
    
	public SavingAccount() {
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
    	  return Address;   
       }
       
       public double getPhoneNumber()
       {
    	   return phNum;
       }
       
       public double getBalance()
       {
    	   return balance;
       }
       
       public double setInterestRate(double ir)
       {
    	   InterestRate=ir;
    	   return InterestRate;
    	  
       }
       public void PrintStatement()
       {
    	   System.out.print("Name:  " + Name +"\n");
    	   System.out.print("Address:  " + Address+"\n");
    	   System.out.print("Phone Num:  " + phNum+"\n");
    	   System.out.print("Account Number:  " + Accnum+"\n");
    	   System.out.print("Current Balance:  " + balance+"\n");
       }
       public void CheckBalance()
       {
    	   System.out.print("Name: " + Name); 
    	   System.out.print("Balance: " + balance);
       }
       
       public void WithdrawCash(int cash)
       {
    	   if (balance >= cash)      
    	   {
    		  balance=- cash;   
    	   }
    	   
    	   else 
    	   {
    		   System.out.print("You donot have sufficient amount in your account");
    		   
    	   }
       }
       
       public void DepositCash(int cash)
       {
    	   balance =+ cash;
       }
        
       public double Zakat()
       {
    	  double z=0;
    	  if (balance >= 20000)
    	  {
    		  z=(balance*2.5)/100;
    		  return z;
    	  }
    	  
    	  else return 0;
       }
       
       public boolean TransferCash( SavingAccount account2, int cash)
       
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
       
       public double AddingInterest()
       {
    	 return balance*InterestRate;   
       }
       
      
       public SavingAccount login(double accno2)
       {
    	
    	   if(Accnum==accno2)
    	   {
    		  return this;    
    	   }
    	   
    	   else 
    		   return null;
       }


	
}
