package com.demo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("URL");
		return url;
	}
	
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	
	
	public String getTitleContactUs()
	{
	String contactUsTitle=pro.getProperty("ContactUsTitle");
	return contactUsTitle;
	}
	
	public String getTitlehome()
	{
	String AJBellHomeTitle=pro.getProperty("AJBellHomeTitle");
	return AJBellHomeTitle;
	}
	
	public String getOurProducts()
	{
	String ProductsTitle = pro.getProperty("OurProductsTitle");
	return ProductsTitle;
	}
	
	public String getFAFindOutMore()
	{
	String FAFindOutMore = pro.getProperty("FAFindOutMore");
	return FAFindOutMore;
	}
	
	

}
