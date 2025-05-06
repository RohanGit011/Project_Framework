package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningWithInvocationCount extends BaseClass {

	
	@Test(invocationCount = 2, groups = "ST")
	public void deleteTest()
	{
		System.out.println("This is action test from LearningWithInvocationCount");
	}
}
