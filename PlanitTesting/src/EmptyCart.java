
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Essential Drivers\\chromedriver.exe");
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
		    WebElement EmptyCart = driver.findElement(By.xpath(" /html/body/div[2]/div/form/table/tfoot/tr[2]/td/ng-confirm/a"));
		    EmptyCart.click();
		    WebElement Yes = driver.findElement(By.xpath("/html/body/div[3]/div[3]/a[1]"));
		    Yes.click();
		    WebElement start = driver.findElement(By.xpath("/html/body/div[2]/div/p/a"));
		    start.click();
	
	}

}
