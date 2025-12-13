package testcase;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	public ReadConfig(){
		
		try {
			properties = new Properties();
			
			FileInputStream fis= new FileInputStream("D:\\Work_Space\\GroTechMind\\configuration\\Config.properties");
			properties.load(fis);	
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
	
	public String getUrl() {
		
		return properties.getProperty("URL");
	}
	
	public String getBrowser() {
		 return properties.getProperty("Browser");
	}
}
