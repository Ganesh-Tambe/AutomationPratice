package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.PageAction.LoginPageAction;

public class ReadPropertyFile {
	FileInputStream fileInput=null;
	String strUserName,strPassword;
	LoginPageAction objlogin=new LoginPageAction();

	public void FillData()
	{
		File file=new File("src\\test\\resource\\LoginPage.properties");
		
		try
		{
			fileInput=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//creating object of properties file
		Properties prop=new Properties();
		
		try
		{
			prop.load(fileInput);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		strUserName=prop.getProperty("username");
		strPassword=prop.getProperty("password");

		
	
		
		//fill email
		objlogin.setUsername(strUserName);
		
		//fill cardnumber
		objlogin.setPassword(strPassword);

       }
}
