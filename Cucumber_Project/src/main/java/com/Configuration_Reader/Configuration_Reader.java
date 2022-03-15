package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
 
public class Configuration_Reader {
	public static Properties p;
	public Object reader;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\Rajesh\\eclipse-workspace\\Cucumber_Project\\src\\main\\java\\com\\Configuration_Reader\\Configure.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getUrl() throws Throwable {
		String url = p.getProperty("url");
		return url;		
	}
	
	public String getusername() throws Throwable  {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() throws Throwable  {
		String password = p.getProperty("password");
		return password;

     }
}
