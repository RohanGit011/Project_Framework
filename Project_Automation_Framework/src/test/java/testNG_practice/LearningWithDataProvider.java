package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningWithDataProvider extends BaseClass {
	
	@Test(dataProvider = "getData", groups = {"RT" , "ST"} )
	public void setData(String firstName,String lastName)
	{
		System.out.println("The first name is: "+firstName);
		System.out.println("The last name is: "+lastName);
		System.out.println("====================");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Rohan";
		obj[0][1] = "Tewary";
		
		obj[1][0] = "Ankita";
		obj[1][1] = "Tewary";
		
		obj[2][0] = "Sandipa";
		obj[2][1] = "Tewary";
		
		return obj;
	}

}
