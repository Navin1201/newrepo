package projecttwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getvalueandgetattribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navin\\seleniumproject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebElement e = driver.findElement(By.xpath("//span[text()='Create an account']"));
	String num = e.getText();
	System.out.println(num);
	WebElement p = driver.findElement(By.xpath("//input[@type='submit']"));
	String log = p.getAttribute("value");
	System.out.println(log);
	driver.quit();
}
}
