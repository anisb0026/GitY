package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 
 {
	@BeforeSuite
	public void bfrsuite() 
    {
	    System.out.println("i'm number 1");
    }
	
	//Test Case 1
	@Parameters({"URL","username"})
	@Test
    public void WebLoginCarLoan(String urlname, String user) // mutliple parameter.
    {
		System.out.println(urlname);
		System.out.println(user);
		System.out.println("WebLoginCar");
		
    }
	
	//Test Case 2		
	@Test(groups ={"smoke"})
	public void MobileLoginCarLoan() 
	{
		System.out.println("MobileLoginCar");
	}
	//Test Case 3		
	@Test 
	public void APILoginCarLoan() 
	{
				
        System.out.println("APILoginCar");
	}
	@AfterSuite
	public void aftrsuite() 
    {
	    System.out.println("i'm last one");
    }
}



