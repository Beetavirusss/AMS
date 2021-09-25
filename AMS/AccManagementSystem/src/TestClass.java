import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	
	@Test
	public void DepositTest()
	{
		SavingAccount S = new SavingAccount();
		S.DepositCash(2500);
		double temp = S.getBalance();
		assertEquals(temp,2500);
	}
	
	@Test 
	public void DepositTest1()
	{
		SavingAccount S = new SavingAccount();
		S.DepositCash(2500);
		double temp =0;
				temp = S.getBalance();
		assertNotEquals(temp,2505);
	}
	
	@Test
	public void DepositTest2()
	{
		CheckingAccount C = new CheckingAccount();
		C.DepositCash(5000);
		double temp = C.getbalance();
		assertEquals(temp, 5000);
	}
	
	@Test
	public void DepositTest3()
	{
		CheckingAccount C = new CheckingAccount();
		C.DepositCash(200);
		double temp = C.getbalance();
		assertNotEquals(temp, 5000);
	}
	
	@Test
	public void ZakatTest()
	{
		SavingAccount S = new SavingAccount();
		double temp=0;
		S.DepositCash(25560);
		temp=S.Zakat();
		double result=0;
		result = S.getBalance()*(2.5/100);
		assertEquals(result, temp, 0.1);
		
	}
	
	@Test
	public void ZakatTest1()
	{
		SavingAccount S = new SavingAccount();
		double temp=0;
		S.DepositCash(2550);
		temp=S.Zakat();
		double result=0;
		result = S.getBalance()*(2.5/100);
		assertNotEquals(result, temp);
		
	}
	
	
	@Test
	public void setInteresttest() 
	{
      SavingAccount S = new SavingAccount();
      double temp=0;
      temp= S.setInterestRate(2.5);
       assertEquals(temp, 2.5, 0.3);
       
	}
	@Test
	public void setInterestTest2()
	{
		SavingAccount S = new SavingAccount();
		double temp=0;
		temp=S.setInterestRate(1.50);
		assertNotEquals(temp, 2.5, 0.3);
		
	}
	
	@Test 
	public void TransferTest1()
	{
		SavingAccount S1 = new SavingAccount();
		SavingAccount S2 = new SavingAccount();
		boolean temp;
		S1.DepositCash(270000);
		temp=S1.TransferCash(S2, 3000);
		assertEquals(true, temp);
	}
	
	@Test 
	public void TransferTest2()
	{
		SavingAccount S1 = new SavingAccount();
		SavingAccount S2 = new SavingAccount();
		boolean temp;
		S1.DepositCash(200);
		temp=S1.TransferCash(S2, 3000);
		assertNotEquals(true, temp);	
	}
	
	@Test
	public void TransferTest3()
	{
		CheckingAccount C1 = new CheckingAccount();
		CheckingAccount C2 = new CheckingAccount();
		boolean temp;
		C1.DepositCash(25000);
		temp=C1.TransferCash(C2, 200);
		assertEquals(true, temp);
		
		
	}
	
	@Test 
	public void Transfertest4()
	{

		CheckingAccount C1 = new CheckingAccount();
		CheckingAccount C2 = new CheckingAccount();
		boolean temp;
		C1.DepositCash(5000);
		temp=C1.TransferCash(C2, 1200);
		assertEquals(true, temp);
	}
	
	
	
	
	
}
