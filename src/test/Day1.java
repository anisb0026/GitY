package test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 
{
	    
	  //Test Case0 
	  @Test
	  public void Demo0()
	   {
		  System.out.println("aaaaaa"); 
		  Assert.assertTrue(false); //just I fail the test to see the result 
       }
	
	 	@BeforeClass 
		public void bfrclass() {
			System.out.println("I will excute before any tests in class Day1");
		}
		@AfterClass 
		public void aftrclass() {
			System.out.println("I will excute after all tests in class Day1");
		}
		
		@BeforeMethod
		public void bfrMethhod(){
			System.out.println("I will excute before every test case in class Day1");
		}
		
		@AfterMethod
		public void aftrMethod(){
			System.out.println("I will excute after every test case in class Day1");
		}
	
	  //Test Case 1
	  @Parameters({"URL"})//Remainder:if you define it here, that means this is applicable to this particular test method only.
	  @Test
	  public void Demo1(String urlname)
	   {
		  System.out.println(urlname); // Selenium : driver.get("http:facebook.com").
          System.out.println("Heloo Slim");
       }
	
	  //Test Case 2
	  @Test(groups ={"smoke"}) 
	  public void Demo2(){
		System.out.println("Heloo Slim");
      }
	 	
}
