import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hindustanuniv.ac.in/");
		//driver.findElement(By.id("query-input")).sendKeys("query-input");
		driver.findElement(By.linkText("Covid 19")).click();

	}

}