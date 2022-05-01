import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAgainToCart{
	

	public static void main(String[] args) throws InterruptedException {
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
		//  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		    WebElement cartlink = driver.findElement(By.xpath("//*[@id=\'nav-cart\']/a"));
		    cartlink.click();
	Thread.sleep(3000);		   
			   WebElement shoppinglink	= driver.findElement(By.xpath("/html/body/div[2]/div/p/a[2]"));
			   shoppinglink.click();
			   WebElement img3 = driver.findElement(By.xpath("//*[@id=\'product-8\']/div/p/a"));
			   img3.click();
			   
	  WebElement cartlink2 = driver.findElement(By.xpath("//*[@id=\'nav-cart\']/a"));
	    cartlink2.click();
	}
}
