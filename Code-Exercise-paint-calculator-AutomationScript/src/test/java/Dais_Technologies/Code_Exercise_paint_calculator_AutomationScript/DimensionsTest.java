package Dais_Technologies.Code_Exercise_paint_calculator_AutomationScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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


public class DimensionsTest extends Initialize{
	
	//GoogleChrome driver is started in this method and browser get the Local Host URL to test the application.
    @BeforeMethod
	public void Initialization(){
		
		startup();
		DimensionTest();
		
	}
	
	
     //Inserting different values into the Length TextBox
  	//Insert "000" into Length TextBox and click on submit button and compare the validation message.    
    @Test
   	public void LengthTextboxVerify_Zero()throws Exception
   	
   	{
   		length();
   	    element.sendKeys("00");
   	    String mesaage =element.getAttribute("validationMessage");		
   	    AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
   	     
   		}
   
     //Null Value
  	//Insert " " into Length TextBox and click on submit button and compare the validation message.    

    @Test
    public void LengthTextboxVerify_null()throws Exception
   	{
    	length();
    	element.sendKeys(" ");
       	String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please fill out this field.",mesaage);
        
         }
  	
     //Decimal Value
    //Insert "1.999" into Length TextBox and click on submit button and compare the validation message.    
    @Test
    public void LengthTextboxVerify_decimal()throws Exception
   	{
    	length();
    	element.sendKeys("1.999");
        String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please enter a valid value. The two nearest valid values are 1 and 2.",mesaage);
        
         }
  	
    // Decimal Value
    //Insert "000" into Length TextBox and click on submit button and compare the validation message.    
    @Test
    public void LengthTextboxVerify_negative()throws Exception
   	{
    	length();
    	element.sendKeys("-111");
        String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
        
         }
    
    
  	 
    //Insert "000" into Width TextBox and click on submit button and compare the validation message.    
    @Test
   	public void WidthTextboxVerify_Zero()throws Exception
   	{
        width();
        element.sendKeys("000");
        String mesaage =element.getAttribute("validationMessage");		
        System.out.println(mesaage);
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
           
           
        }
     //Null value  
    //Insert " " into Width TextBox and click on submit button and compare the validation message.    
    @Test
    public void WidthTextboxVerify_null()throws Exception
   	{
    	width();
    	element.sendKeys(" ");
       	String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please fill out this field.",mesaage);
        
         }

     //Decimal
    //Insert "1.99" into Width TextBox and click on submit button and compare the validation message.    
    @Test
    public void WidthTextboxVerify_decimal()throws Exception
   	{
    	width();
    	element.sendKeys("1.999");
        String mesaage =element.getAttribute("validationMessage");		
        System.out.println(mesaage);
        AssertJUnit.assertEquals("Please enter a valid value. The two nearest valid values are 1 and 2.",mesaage);
        
         }
  	
     //Negative    
    //Insert "-111" into Width TextBox and click on submit button and compare the validation message.    
    @Test
    public void WidthTextboxVerify_negative()throws Exception
   	{
    	width();
    	element.sendKeys("-111");
       	String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
        
         }
    
    //Insert "000" into Height TextBox and click on submit button and compare the validation message.    
    @Test
   	public void HeightTextboxVerify_Zero()throws Exception
   	{
        height();
    	element.sendKeys("000");
       	String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
        
           
       }
     
    //Null Value
    //Insert " " into Height TextBox and click on submit button and compare the validation message.    
    @Test
    public void HeightTextboxVerify_null()throws Exception
   	{
    	height();
    	element.sendKeys(" ");
        String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please fill out this field.",mesaage);
        
         }
  	
    //Decimal Value
    //Insert "1.99" into Height TextBox and click on submit button and compare the validation message.    
    @Test
    public void HeightTextboxVerify_decimal()throws Exception
   	{
    	height();
    	element.sendKeys("1.999");
        String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Please enter a valid value. The two nearest valid values are 1 and 2.",mesaage);
        
         }
  	
    //Negative Value
    //Insert "-111" into Height TextBox and click on submit button and compare the validation message.    
    @Test
    public void HeightTextboxVerify_negative()throws Exception
   	{
    	height();
    	element.sendKeys("-111");
        String mesaage =element.getAttribute("validationMessage");		
        AssertJUnit.assertEquals("Value must be greater than or equal to 1.",mesaage);
        
         }
    
    //Check the LengthLimit of Length TextBox
    @Test   
    public void TextboxLength_Length()
  	
	{
		
	    maxLengthDefined =driver.findElement(By.name("length-0")).getAttribute("maxlength");
		if (maxLengthDefined == null) 
		{
			System.out.println("No limit is set. There should be limit on Length textbox");
		}
        else {
			
				System.out.println("Limit of the length textbox is "+ maxLengthDefined);
			}
		
		
	}
    
    //Check the LengthLimit of Width TextBox
    @Test
    public void TextboxLength_Width()
	
	{
		
	 maxLengthDefined =driver.findElement(By.name("width-0")).getAttribute("maxlength");
     if (maxLengthDefined == null) {
			System.out.println("No limit is set. There should be limit on textbox");
		}

	 else {
			
				System.out.println("Limit of the length textbox is "+ maxLengthDefined);
		  }
		
		
	}
    
    //Check the LengthLimit of height TextBox
    @Test
    public void TextboxLength_Height()

{
	
	maxLengthDefined =driver.findElement(By.name("height-0")).getAttribute("maxlength");
    if (maxLengthDefined == null) {
		System.out.println("No limit is set. There should be limit on textbox");
	}

	else {
		
			System.out.println("Limit of the length textbox is "+ maxLengthDefined);
		}
	
	
}
    //Checking here Element is present on the page.
    @Test
    public void isElementPresent()throws Exception
{
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/th[1]")).isDisplayed());
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/th[2]")).isDisplayed());
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/th[3]")).isDisplayed());
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/th[4]")).isDisplayed());
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/div/h1")).isDisplayed());//calculating
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[1]")).isDisplayed());//1 gallons of
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[2]/code")).isDisplayed());//formula
    AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body/footer/p[3]")).isDisplayed());//gallons required


    }


    //Internal Server Error case
    //Insert "1.0" into Enter the Rooms TextBox and click on submit button.Its giving a Internal Server Error.
    @Test
    public void InternalServerErrorCase()throws Exception
{
    PassdecimalValueToTextboxe();
   	driver.findElement(By.xpath("/html/body/div/form/input")).click();
    System.out.println("Error message on the page is "+driver.findElement(By.xpath("/html/body/h1")).getText());
    AssertJUnit.assertFalse(driver.findElement(By.xpath("/html/body/h1")).isDisplayed());
}


   //check the URL when click on Submit button.
   @Test
   public void Redirect()
{
	PassValueToTextboxes();
	String expectedURL="http://127.0.0.1:5000/results";
    String redirectURL=driver.getCurrentUrl(); 
    AssertJUnit.assertEquals(redirectURL,expectedURL);
}
   
 
   
   
   
   
  @ AfterMethod 
   public void quit() { 
   driver.quit();
   
   
   } 
   
   	
	
	} 
	
	