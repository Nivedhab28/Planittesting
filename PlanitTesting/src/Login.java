import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Essential Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		    driver.get("https://jupiter.cloud.planittesting.com/#/");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		    WebElement link = driver.findElement(By.xpath("//*[@id=\'nav-login\']/ng-login/a"));
		    link.click();
		    WebElement uname = driver.findElement(By.id("loginUserName"));
		    uname.sendKeys("Jesica");
		    WebElement pwrd = driver.findElement(By.id("loginPassword"));
		    pwrd.sendKeys("Jesica");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		    WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[1]"));
		    
		    login.click();
		    
	}

}
