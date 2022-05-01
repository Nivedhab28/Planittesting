import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Essential Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		    driver.get("https://jupiter.cloud.planittesting.com/#/");
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		    WebElement link = driver.findElement(By.xpath("//*[@id=\'nav-contact\']/a"));
		    link.click();
		    WebElement Fname= driver.findElement(By.id("forename"));
		    Fname.sendKeys("Jesica"+Keys.ENTER);
		    WebElement Sname= driver.findElement(By.id("surname"));
		    Sname.sendKeys("Arun");
		    WebElement email= driver.findElement(By.id("email"));
		    email.sendKeys("Arun@gmail.com");
		    WebElement tnumber= driver.findElement(By.id("telephone"));
		    tnumber.sendKeys("998745621");
		    WebElement message= driver.findElement(By.id("message"));
		    message.sendKeys("Account is not able to create");
		    WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/div/form/div/a"));
		    submit.click();
		    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		    WebElement back= driver.findElement(By.xpath("/html/body/div[2]/div/a"));
		    back.click();


	}

}
