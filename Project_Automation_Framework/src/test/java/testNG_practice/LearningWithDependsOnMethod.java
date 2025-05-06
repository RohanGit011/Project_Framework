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
	}

	@Test(dependsOnMethods = "createTest")
	public void actionTest()
	{
		System.out.println("This is action test from LearningWithDependsOnMethod");
	}
}
