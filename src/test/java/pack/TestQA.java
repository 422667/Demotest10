package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestQA {

	@Test
	public void che() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		Select drpdwn = new Select(driver.findElementById("job_role"));
		drpdwn.selectByIndex(1);
		Thread.sleep(2000);
		drpdwn.selectByValue("IT Manager/Executive");
		Thread.sleep(2000);
		drpdwn.selectByVisibleText("Developer");
		
		
	}

}
