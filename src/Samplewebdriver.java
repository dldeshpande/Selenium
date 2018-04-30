import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Samplewebdriver {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:/SeleniumGecko/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/intl/or/gmail/about/");
	    Thread.sleep(1500);
	driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
	driver.findElement(By.id("identifierId")).sendKeys("dldeshpande");
	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Talent_123");
	
	driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	
	}

}