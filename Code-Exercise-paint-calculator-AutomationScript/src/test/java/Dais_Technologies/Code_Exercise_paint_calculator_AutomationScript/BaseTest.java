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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Initialize{
	
	//GoogleChrome driver is started in this method and browser get the Local Host URL to test the application.
	@BeforeMethod
	public void Initialization()	
	{
		startup();
       
		
     }
	
	//Inserting different values into the Enter the Rooms TextBox
	//Insert "000" into Enter the Rooms TextBox and click on submit button and compare the validation message.
	@Test
	public void TextboxVerify_Zero()throws Exception
	{
    	room();
		element.sendKeys("000");
        message =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",message);
        //driver.close();
        
     }
	
     //Decimal Value	
	//Insert "1.99" into Enter the Rooms TextBox and click on submit button and compare the validation message.
	@Test
    public void TextboxVerify_Decimal()throws Exception
	{
		room();
		element.sendKeys("1.999");
    	message=element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please enter a valid value. The two nearest valid values are 1 and 2.",message);
               
     }
   
	//Negative
	//Insert "-111" into Enter the Rooms TextBox and click on submit button and compare the validation message.
    @Test
    public void TextboxVerify_Negative()throws Exception
	{
    	room();
    	element.sendKeys("-111");
    	message =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",message);
       
    }
    
    // Null value
    //Insert " " into Enter the Rooms TextBox and click on submit button and compare the validation message.
    @Test
    public void TextboxVerify_null()throws Exception
	{
    	room();
    	element.sendKeys(" ");
    	message =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please fill out this field.",message);
       
    }
    //Internal Server Error case
    //Insert "1.0" into Enter the Rooms TextBox and click on submit button.Its givinf a Internal Server Error.
    @Test
    public void InternalServerErrorCase()throws Exception
    {
    	room();
    	element.sendKeys("1.0");
       	driver.findElement(By.xpath("/html/body/div/form/input[2]")).click();
        AssertJUnit.assertFalse(driver.findElement(By.xpath("/html/body/h1")).isDisplayed());
        System.out.println("Error message on the page is "+driver.findElement(By.xpath("/html/body/h1")).getText());

    }
    
    //Check the Length of the Enter the Rooms TextBox
    @Test   
    public void TextboxLength()
   	
   	{
   		
    	maxLengthDefined =driver.findElement(By.name("rooms")).getAttribute("maxlength");
   		if (maxLengthDefined == null) {
   			System.out.println("No limit is set. There should be text limit on 'Enter the Room' textbox");
   		}

   		else {
   			
   				System.out.println("Limit of the length textbox is "+ maxLengthDefined);
   			}
   			
   	}
    
    //Checking here Element is present on the page.
    @Test
    public void isElementpresent()throws Exception
    {
        AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/h1")).isDisplayed());//calculating
        AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/p")).isDisplayed());//enter the number of rooms
        AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[1]")).isDisplayed());//1 gallons of
        AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[2]/code")).isDisplayed());//formula
        AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[3]")).isDisplayed());//gallons required


    }
    
    //check the URL when click on Submit button.
    @Test
    public void Redirect()
 {
 	 room();
 	 element.sendKeys("1");
 	 driver.findElement(By.xpath("/html/body/div/form/input[2]")).click();
 	 String expectedURL="http://127.0.0.1:5000/dimensions?rooms=1";
     String redirectURL=driver.getCurrentUrl(); 
     AssertJUnit.assertEquals(redirectURL,expectedURL);
 }
  
    
    //Closing the WebBrowser.
    @ AfterMethod
    public void quit() { 
    driver.quit(); 
    } 
    
  
    
}





