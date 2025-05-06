package com.orangehrm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertyFile(String value) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/main/resources/File.properties");
		
		Properties p = new Properties();
		
		p.load(file);
		
		return p.getProperty(value);
	}

}
