package testScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwitchingWin {

	WebDriver driver;
	@Test
	public void SwitchWindows()
	{
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Set<String> allwinIds=driver.getWindowHandles();
		System.out.println("total windows="+allwinIds.size());
		String win1=null;
		String win2=null;
		Iterator<String> itr=allwinIds.iterator();
		if(itr.hasNext())
		{
			win1=itr.next();
			win2=itr.next();
		}
		System.out.println(win1);
		System.out.println(win2);
		System.out.println("window1 title="+driver.getTitle());
		driver.switchTo().window(win2);
		System.out.println("window2 title="+driver.getTitle());
		driver.quit();
	}
}
