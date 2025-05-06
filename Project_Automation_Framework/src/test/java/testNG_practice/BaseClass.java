package testNG_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite(groups = {"RT" , "ST"})
	public void beforeSuiteConfiguration()
	{
		System.out.println("This is before Suite Configuration");
	}
	
	@BeforeClass(groups = {"RT" , "ST"})
	public void beforeClassConfiguration()
	{
		System.out.println("This is before Class Configuration");
	}
	
	@BeforeMethod(groups = {"RT" , "ST"})
	public void beforeMethodConfiguration()
	{
		System.out.println("This is before Method Configuration");
	}
	
	@AfterSuite(groups = {"RT" , "ST"})
	public void afterSuiteConfiguration()
	{
		System.out.println("This is after Suite Configuration");
	}
	
	@AfterClass(groups = {"RT" , "ST"})
	public void afterClassConfiguration()
	{
		System.out.println("This is after Class Configuration");
	}
	
	@AfterMethod(groups = {"RT" , "ST"})
	public void afterMethodConfiguration()
	{
		System.out.println("This is after Method Configuration");
	}
}
