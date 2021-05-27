package com.sel.jav.NewSelProj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalPara {
	static Properties prop;
	static Properties property;
	String str2 = "Yo";
	
	public static Properties callProperties() throws IOException  {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".//resources//Config.properties");
		prop.load(fis);
		return prop;
	}
	
	public static void main(String[] args) throws IOException {
		property = callProperties();
		//Call Properties
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("hostname"));
		System.out.println(property.getProperty("browser"));
	}

}
