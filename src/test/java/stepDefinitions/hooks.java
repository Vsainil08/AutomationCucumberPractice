package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netbankingSetup()
	{
		System.out.println("******Net********");
		System.out.println("NetBanking Page");
		
	}
	@Before("@Mortgage")
	public void mortgageSteup()
	{
		System.out.println("Mortgage Page");
	}
	
	@After
	public void teardown()
	{
		System.out.println("*******After********");
	}

}
