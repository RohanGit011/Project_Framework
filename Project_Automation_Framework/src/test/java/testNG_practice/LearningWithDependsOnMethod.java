package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningWithDependsOnMethod extends BaseClass {

	@Test (groups = "RT")
	public void createTest()
	{
		System.out.println("This is method test from LearningWithDependsOnMethod");
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		String username= System.getProperty("username");
		String password= System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = "createTest")
	public void actionTest()
	{
		System.out.println("This is action test from LearningWithDependsOnMethod");
	}
}
