package seleniumactions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsClass {
	
	
	/*Build--> perform
	 * 
	 * Action 
	 * Actions 
	 * 
	 * 
	 * 
	*/
	
	
	/*Actions class helps us to handle the mouse and keyboard events 
	 * 
	 * Keyboard events
	 *  1.sendKeys()
	 *    a.sendKeys(charactersequence)-->pass the characters which you want to use
	 *    b.sendKeys(target, keys)-->pass the keys in the target element
	 *    action.sendKeys(element, "Hello"); 
	 *	 
	 * 2.KeysUp()--.has two methods
	 *    a.zero params 
	 *    b.Accepts KeysUp(WebElement,charactSequence)
	 * 3.KeyDown()
	 *    a.zero params 
	 *    b.Accepts KeysDown(WebElement,charactSequence)
	 * 
	 * Mouse Events
	 * click ()
	 *   a. Click()-->prereq--> you have to find the element and  then perform click 
	 *   b.click(Webelement target) -->Accept the input as webelement and it performs the click action on the target element
	 *   
	 * clickAndHold
	 * a.clickAndHold()--> prereq--> you have to find the element and Performs click and hold the element and does not release 
	 * b.clickAndHold(WebElement target) -->Accept the input as webelement and it performs the clickandhold action on the target element
	 *   
	 * 
	 * 
	 * doubleclick()
	 * a.doubleclick() --> prereq--> find the element and performs double click on it 
	 * b.doubleclick(WebElement target)--> you can pass the element in which you want to perform the double click operation
	 * 
	 * dragandDrop()
	 * a.dragandDrop(Source,Dest)
	 *     It accepts two webelement as parameters and it drags the element from one place to another 
	 *     
	 * b.dragandDrop(Source,x offset ,  yoffset)   
	 *    It helps to perform  click and hold the source element and move to the specific offset*    
	 *     
	 * moveToElement()
	 * a.moveToElement(WebElement target)--> moves the mouse to middle of the element 
	 * 
	 * a.moveToElement(WebElement target,int xoffset, int yoffset )--> 
	 *       x offset -->move the mouse from the centre point view of the element . Negative value-->leftside 
	 *       y offset -->move the mouse from the centre point view of the element . Negative value-->upwards 
	 *       
	 *c.moveByOffset(int xoffset, int yoffset)
	 *
	 *
	 *pause()
	 *========
	 *action.pause(Duration.ofSeconds(30) --> one accepts Duration as paramter
	 *action.pause(6000)--->once accepts long milliseconds 
	 *
	 *Contextclick-->Right click 
	 *
	 *tick()-->actions related to single source
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *      
	 *             
	 *       
	 *       
	 *       
	 *    
	 * 
	 *     
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * contextClick()
	 * 
	 * 
	 * 
	 * 
	 * 
	
	*/
	@Test
	public void dragAndDrop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
		action.dragAndDrop( driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	 }
	
	
	@Test
	public void dragAndDropByOfset() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rangeslider.js.org/");

		WebElement js = driver.findElement(By.xpath("(//a[text()='rangeslider.js'])[1]"));

		Actions action = new Actions(driver);

		
		  WebElement element =
		  driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));
		  
		  action.dragAndDropBy(element, 50, 0).build().perform();
		 
		
		WebElement vertical = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[7]"));
		action.dragAndDropBy(vertical, 0, 10).build().perform();
		
		
		
		
		

	}

}
