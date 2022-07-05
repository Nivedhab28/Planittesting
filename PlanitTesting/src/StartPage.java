import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Essential Drivers\\Chrome\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
    driver.get("https://jupiter.cloud.planittesting.com/#/");

    WebElement button= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/p[2]/a"));
    button.click();
    
    
	
	}

}
