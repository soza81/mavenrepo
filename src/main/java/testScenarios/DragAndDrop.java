package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	WebDriver driver;
	@Test
	public void MousActions() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(drag, drop).build().perform();
		action.clickAndHold(drag).moveToElement(drag).release(drop).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
