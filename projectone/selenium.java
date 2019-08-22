package projectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Navin\\seleniumproject\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement u = driver.findElement(By.xpath("(//input[@class='inputtext'])[1]"));
	u.sendKeys("cseachamp@gmail.com");
	WebElement p = driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
	p.sendKeys("alliswelll");
	WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
	btn.click();
	Thread.sleep(3000);
	driver.close();
	}
}
