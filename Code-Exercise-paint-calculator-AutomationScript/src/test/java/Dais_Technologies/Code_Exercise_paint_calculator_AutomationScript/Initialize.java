package Dais_Technologies.Code_Exercise_paint_calculator_AutomationScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
  WebDriver driver;
  WebElement element;
  WebElement submit;
  String maxLengthDefined;
  String message ;
  int multiply;
  int Calculatedvalue;
  int gallons;
  int calculatedGallons;

		public void startup()	{
	        System.setProperty("webdriver.chrome.driver","chromedriver");
	        driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("http://127.0.0.1:5000/");
	        
		}
	        
	        
	        
	    public void DimensionTest() {    
	        element= driver.findElement(By.name("rooms"));
	   		element.sendKeys("1");
	   	    submit=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
	   		submit.click();
	
		}
       	
		public void length()
		{
			
	        element= driver.findElement(By.name("length-0"));

		}
		public void width()
		{
			
	        element= driver.findElement(By.name("width-0"));

		}
		public void height()
		{
			
	        element= driver.findElement(By.name("height-0"));

		}
		public void room()
		{
			
	        element= driver.findElement(By.name("rooms"));

		}
      
		
		public void PassValueToTextboxes() {
    	  
    	  
    	    driver.findElement(By.name("length-0")).sendKeys("20");
    		driver.findElement(By.name("width-0")).sendKeys("20");
    		driver.findElement(By.name("height-0")).sendKeys("20");
    		element=driver.findElement(By.xpath("/html/body/div/form/input"));
    		element.click();
      }
		
		public void PassdecimalValueToTextboxe() {
	    	  
	    	  
    	    driver.findElement(By.name("length-0")).sendKeys("1.0");
    		driver.findElement(By.name("width-0")).sendKeys("1.0");
    		driver.findElement(By.name("height-0")).sendKeys("1.0");
    	  
      }



}

	