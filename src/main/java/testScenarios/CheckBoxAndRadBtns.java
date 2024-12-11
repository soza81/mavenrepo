package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CheckBoxAndRadBtns {

	WebDriver driver;
	@Test
	public void radChk() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement bmwRad=driver.findElement(By.id("bmwradio"));
		bmwRad.click();
		Thread.sleep(3000);
		if(bmwRad.isSelected())
		{
			System.out.println("BMW Radio button is selected..");
		}
		WebElement benzChk=driver.findElement(By.id("benzcheck"));
		WebElement hondaChk=driver.findElement(By.id("hondacheck"));
		benzChk.click();
		Thread.sleep(3000);
		hondaChk.click();
		Thread.sleep(3000);
		if(benzChk.isSelected() && hondaChk.isSelected())
		{
			System.out.println("Benz and Honda are selected...");
		}
		driver.quit();
		
	}
}
