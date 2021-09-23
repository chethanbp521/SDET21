package contactTest;

import org.testng.annotations.Test;

public class CreateContactTest 
{
	@Test(groups= "SmokeTest")
	public void createContactTest()
	{
		System.out.println("Execute Create Contact Test");
	}
	
	@Test(groups= "RegressionTest")
	public void createContactwithOrg()
	{
		System.out.println("Execute Create Contact with Org");
	}
	
	@Test(groups= "RegressionTest")
	public void deleteContact()
	{
		System.out.println("Execute Delete Contact");
	}

}
