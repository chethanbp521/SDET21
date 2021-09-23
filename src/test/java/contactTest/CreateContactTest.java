package contactTest;

import org.testng.annotations.Test;

public class CreateContactTest 
{
	@Test(groups= "SmokeTest")
	public void createContactTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
				
		System.out.println("Execute Create Contact Test");
		System.out.println("-------------------"+BROWSER);
		System.out.println("---------------"+URL);
		
	}
	
	@Test(groups= "RegressionTest")
	public void createContactwithOrg()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println("Execute Create Contact with Org");
		
		System.out.println("-------------------"+BROWSER);
		System.out.println("---------------"+URL);
	}
	
	@Test(groups= "RegressionTest")
	public void deleteContact()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println("Execute Delete Contact");

		System.out.println("-------------------"+BROWSER);
		System.out.println("---------------"+URL);
	}
	
	@Test(groups= "RegressionTest")
	public void modifyContact()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println("Execute Modify Contact");
		
		System.out.println("-------------------"+BROWSER);
		System.out.println("---------------"+URL);
	}

}
