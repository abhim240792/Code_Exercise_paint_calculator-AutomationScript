package Dais_Technologies.Code_Exercise_paint_calculator_AutomationScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class ResultTest extends Initialize {
	
	 //GoogleChrome driver is started in this method and browser get the Local Host URL to test the application.
	 @BeforeMethod
	 public void Intialization()	{
		    startup();
			DimensionTest();
	    	

	    	   }
	   //Testing the value of "Amount of Feet to Paint" by providing multiple set of data from getdata() method
	   //Providing 3 sets of different data from getdata() method and asserting the value of "Amount of Feet to Paint" field. 
	    @Test(dataProvider="getdata")
	    public void AmountofFeettoPaint(String Length, String width,String height)
	   	{
	      driver.findElement(By.name("length-0")).sendKeys(Length);
	      driver.findElement(By.name("width-0")).sendKeys(width);
	      driver.findElement(By.name("height-0")).sendKeys(height);
	      driver.findElement(By.xpath("/html/body/div/form/input")).click();
	      multiply= Integer.parseInt(Length)*Integer.parseInt(width)*Integer.parseInt(height);
	      Calculatedvalue=Integer.parseInt(driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]")).getText());
          AssertJUnit.assertEquals(Calculatedvalue,multiply);
	     
	     	}
	        
	     //Testing the value of "Gallons Required" by providing multiple set of data from getdata() method
		//Providing 3 sets of different data from getdata() method and asserting the value of "Gallons required" field.     
	   @Test(dataProvider="getdata")
	   public void GallonsReuired(String Length, String width,String height)
   	{
	     driver.findElement(By.name("length-0")).sendKeys(Length);
	     driver.findElement(By.name("width-0")).sendKeys(width);
	     driver.findElement(By.name("height-0")).sendKeys(height);
	     driver.findElement(By.xpath("/html/body/div/form/input")).click();
         gallons=(int) Math.floor(Integer.parseInt(Length)*Integer.parseInt(width)*Integer.parseInt(height)/400);
         System.out.println("division value is "+gallons);
         calculatedGallons=Integer.parseInt(driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[3]")).getText());
         AssertJUnit.assertEquals(calculatedGallons,gallons);

     
     	}
	   
	   //check the URL when click on Home button.
	   @Test
	   public void Redirect()
	   {
		PassValueToTextboxes();
		String expectedURL="http://127.0.0.1:5000/?";
	    WebElement element = driver.findElement(By.xpath("/html/body/div/div/form/input"));
	    element.click();
	    String redirectURL=driver.getCurrentUrl(); 
	    AssertJUnit.assertEquals(redirectURL,expectedURL);
	   }
	   
	  
	    //Checking here Element is present on the page.
    	@Test
	    public void isElementPresent()throws Exception
	{
	  
	
	    
    		AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/h1")).isDisplayed());
            AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[1]")).isDisplayed());
            AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[2]/code")).isDisplayed());
            AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[3]")).isDisplayed());

	    }
	   
	  //Providing sets of data to methods. 
	 @DataProvider
	 public Object[][] getdata()
	 {
	 
	 Object [][] data =new Object[][] {{"35","30","20"},{"10","25","60"},{"20","25","30"}};
	 return data;
	 }

	   @AfterMethod 
	   public void quit() { 
	   driver.quit(); 
	   
	   } 

}
	   
	



