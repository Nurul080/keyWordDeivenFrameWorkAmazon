package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties prop;
	
	
	public PropertiesReader() {
		prop = new Properties();
		String propertyFile = "src/test/resources/tets.properties";
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(propertyFile);
			prop.load(fis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String readBrowser() {
		return prop.getProperty("browser");
		
	}
	
	public String getUrl() {
		return prop.getProperty("url");
		
	}
	public String getEmail() {
		return prop.getProperty("email");
		
	}
	public String getPssword() {
		return prop.getProperty("password");
		
	}

}
