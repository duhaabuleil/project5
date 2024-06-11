import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytest {
	WebDriver driver= new ChromeDriver();
	String theUrl="https://www.saucedemo.com/inventory.html";
	
	
	
	
	@BeforeTest
	public void mySetup() {
		driver.get(theUrl);
		driver.manage().window().maximize();
		
		
	}
	
	@Test(priority = 1)
	public void loginTest() {
		
		WebElement userNameInput=driver.findElement(By.xpath("//input[@data-test='username']"));
		WebElement passWordInput=driver.findElement(By.xpath("//input[@data-test='password']"));
		WebElement loginButton=driver.findElement(By.xpath("//input[@data-test='login-button']"));
		userNameInput.sendKeys("standard_user");
		passWordInput.sendKeys("secret_sauce");
		loginButton.click();
			
	}
	@Test(priority = 2,enabled = false)
	public void addAllItems() {
		
		List<WebElement>myAddToCartButtons= driver.findElements(By.className("btn"));
		System.out.println(myAddToCartButtons.size());
		for(int i=0;i<myAddToCartButtons.size();i++) {
			myAddToCartButtons.get(i).click();
		}
			
		
	}
	@Test(priority = 3,enabled = false)
	public void addOneItemAndSkipTheNextItem() {
		
		List<WebElement> myAddToCartButtons = driver.findElements(By.className("btn"));
		System.out.println(myAddToCartButtons.size());
		for(int i = 0 ;i< myAddToCartButtons.size();i++ ) {
			
		if(i==2) {
			continue;
		}	
		myAddToCartButtons.get(i).click();
		}
			
		}
		
		@Test(priority = 4)
		public void llElementsfindAThatHasTheTextLabs() {
			
			List<WebElement> myAddToCartButtons = driver.findElements(By.className("btn"));
			List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
			
			for(int i = 0 ;i< ItemsNames.size();i++ ) {
				; 
				
				String itemName = ItemsNames.get(i).getText();
				myAddToCartButtons.get(i).click();

				if(itemName.contains("Labs")) {
				break ; 
				}

			

				
			}
			
			
			
		}
		
		
		
		
		
		
		
	
	

}
