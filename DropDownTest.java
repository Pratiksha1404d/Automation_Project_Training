package SeleniumDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:/Automation-Workspace/Automation_Training_Project/ExternaleResources/drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			Thread.sleep(3000);
			
			WebElement day= driver.findElement(By.name("birthday_day"));
            
			WebElement month= driver.findElement(By.name("birthday_month"));
			
			WebElement year= driver.findElement(By.name("birthday_year"));
			
			Select select= new Select(day);
			select.selectByVisibleText("28");
			
			Select select1= new Select(month);
			select1.selectByVisibleText("Jan");
			
			Select select2= new Select(year);
			select2.selectByVisibleText("1995");
			
	}

}
