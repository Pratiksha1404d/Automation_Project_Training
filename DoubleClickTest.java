package SeleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:/Automation-Workspace/Automation_Training_Project/ExternaleResources/drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Actions");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		
		a.doubleClick(driver.findElement(By.xpath("//button[@name='dblClick']"))).build().perform();
	}

}

















