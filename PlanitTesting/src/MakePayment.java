
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakePayment{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Essential Drivers\\Chrome\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		    driver.get("https://jupiter.cloud.planittesting.com/#/");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		    WebElement button= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/p[2]/a"));
		    button.click();
		    
		    WebElement img1= driver.findElement(By.xpath("//*[@id=\'product-1\']/div/p/a"));
		    img1.click();
		    WebElement img2= driver.findElement(By.xpath("//*[@id='product-3']/div/p/a"));
		    img2.click();
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			  
		    
		    WebElement cartlink = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/a"));
		    cartlink.click();
		    
		  WebElement quantity = driver.findElement(By.name("quantity"));
		    quantity.clear();
		    quantity.sendKeys("2");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		    WebElement checkout = driver.findElement(By.xpath("/html/body/div[2]/div/form/table/tfoot/tr[2]/td/a\r\n"
		    		+ ""));
		    checkout.click();
		    
		    WebElement forename= driver.findElement(By.id("forename"));
		    forename.sendKeys("Jesica");
		    WebElement Sname= driver.findElement(By.id("surname"));
		    Sname.sendKeys("Arun");
		    WebElement email= driver.findElement(By.id("email"));
		    email.sendKeys("Arun@gmail.com");
		    WebElement tnumber= driver.findElement(By.id("telephone"));
		    tnumber.sendKeys("998745621");
		    WebElement address= driver.findElement(By.id("address"));
		    address.sendKeys("Adelaide,Australia");
		    
		    WebElement card= driver.findElement(By.id("cardType"));
		    Select select = new Select(card);
		    select.selectByVisibleText("Mastercard");
		    WebElement cardno= driver.findElement(By.id("card"));
		    cardno.sendKeys("9874563211236547");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			 
		    WebElement submit= driver.findElement(By.id("checkout-submit-btn"));
		    submit.click();

		    
		    
		    
		
		      
		    	}

}
