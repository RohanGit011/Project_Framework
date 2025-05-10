package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningWithEnabled extends BaseClass {
	
	@Test(groups = "ST")
	public void modifyTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.28.218:8888/");
		System.out.println("This is method test from LearningWithEnabled");
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		String username= System.getProperty("username");
		String password= System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

	@Test(enabled = true , groups = "RT")
	public void actionTest()
	{
		System.out.println("This is action test from LearningWithEnabled");
	}

}
