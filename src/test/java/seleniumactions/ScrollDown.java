package seleniumactions;

import java.security.Key;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	
	//Open google.com and search keyword then scroll down
	
	//JavaScriptExecutor interface that helps to execute JavaScript methods through Selenium Webdriver
	
	@Test
	public void testcase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("test");
		searchBox.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		

		/*
		 * 1.Scroll down by pixel
		 * 2.Scroll Down by visiblity of an element 
		 * 3.Scroll down to the bottom of the page 
		 * 4.Horizonal Scrolling
		 */

		// Scroll down by pixel
		
		js.executeScript("window.scrollBy(0,1000)");

		// Scroll Down by visiblity of an element
		WebElement targetElement = driver.findElement(By.xpath("//span[text()='Next']"));
		System.out.println(targetElement.toString());
		js.executeScript("arguments[0].scrollIntoView()", targetElement);
		targetElement.click();

		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
