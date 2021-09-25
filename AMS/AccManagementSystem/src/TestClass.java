import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	
	@Test
	public void DepositTest()
	{
		SavingAccount S = new SavingAccount();
		S.DepositCash(2500);
		double temp = S.getBalance();
		assertEquals(temp,2500, 0.1);
	}
	
	@Test 
	public void DepositTest1()
	{
		SavingAccount S = new SavingAccount();
		S.DepositCash(2500);
		double temp =0;
				temp = S.getBalance();
		assertNotEquals(temp,2505, 0.1);
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
		assertNotEquals(result, temp, 0.1);
		
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
	
	
}
