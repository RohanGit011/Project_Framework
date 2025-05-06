package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningWithPriority extends BaseClass {
	
	@Test(groups = "ST" , priority = 1)
	public void methodTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8888/");
		
		System.out.println("This is method test from LearningWithPriority");
	}

	@Test(priority = 2)
	public void actionTest()
	{
		System.out.println("This is action test from LearningWithPriority");
	}
}
