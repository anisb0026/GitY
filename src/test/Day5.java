package test;
import org.testng.annotations.Test;

public class Day5
 {
	
	@Test
	public void WebLoginHomeLoan() 
     {
		
       System.out.println("WebLoginHome");
     }
	
	
	@Test 
	public void MobileLoginHomeLoan() 
	{
	   System.out.println("MobileLoginHome");
    }
	
	
	@Test(dependsOnMethods={"WebLoginHomeLoan"}) 
	public void APILoginHomeLoan() 
	{
	   System.out.println("APILoginHome");
	  
    }
	
	
 }


