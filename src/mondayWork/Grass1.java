package mondayWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grass1 {
	
	WebDriver Driver;
	
	public void getdriver() {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/ashfakrahman/Downloads/chromedriver");
	     
		 Driver= new ChromeDriver();
		 
		 
	}
   public void clickOnWebElement(By  x) {
	
	//method to click on a WebElement
	Driver.findElement (x).click();
}

  //method using int value where value is fixed and action is fixed 
   
   void substract() {
   
   //int a=5;
  // int b=6;
   //int c=a-b;
  
  //System.out.println("c");
   
   }
   //method using string value from any web, where value is not fixed and action is not fixed 
   public String getText() {
	return null;
	   }
   }
   
   

   
   
   
   
   
   