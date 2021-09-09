package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3
{
	//Test Case 1
	@Test(groups ={"smoke"})
	public void WebLoginHomeLoan() 
     {
		
       System.out.println("WebLoginHome");
     }
	
    //Test Case 2
	@Test 
	public void MobileLoginHomeLoan() 
	{
	   System.out.println("MobileLoginHome");
    }
	
	@BeforeTest
	public void bfttest()
	{
		System.out.println("I will excute first");
	}
	//Test Case 3
	@Test 
	public void APILoginHomeLoan() 
	{
	   System.out.println("APILoginHome");
	  
        }
	
	@AfterTest
	public void afttest()
	{
		System.out.println("I will excute Last");
	} 
	
	
 }


