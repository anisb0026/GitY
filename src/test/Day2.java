package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 
{
	@Test(dataProvider ="getData") //Go and find the dataProvider called getData 
	
	public void Demo1( String username , int password) // for each time (for one single test), getData() Methods is sending 
	                                                   //2 values username and Password
	{
	   System.out.println(username); // value 1
       System.out.println(password); // value 2
	}
	
	
	@DataProvider
	public Object[][] getData() // Method getData() return type of Method getData() is Object[][]
	{ 
	    //define a multidimensional object array 
		Object[][] data = new Object [3] [2] ; //3 rows and 2 Colnumn 
		
		 //Rows    : How many times your Test case should run -------> 3 Times
		 //column  : How many value for each time.---------> 2 Values.

		//first Time
		data[0][0]= "anis@gmail.com";
		data[0][1]= "azert";
				
		//Second Time
		data[1][0]= "anis@outlook.com";
		data[1][1]= "qsdfgh";
				
		//Third Time
		data[2][0]= "anis@yahoo.com";
		data[2][1]= "wxcvb";
		
		return data;			
    }
	
}
