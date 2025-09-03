package com.day_21;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class Reading_Properties {

	@Test
	public void Reading_Propertie() throws Throwable {

		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(projectPath + "\\Configuration\\config.properties");
		prop.load(fis);

		String url=prop.getProperty("appurl");
		String username=prop.getProperty("name");
		String password=prop.getProperty("pwd");

		System.out.println( url +"  "+ username  +"  "+ password);
		Set<String>kesy=	prop.stringPropertyNames();
		System.out.println(kesy);
		Set<Object>obj=	prop.keySet();
		System.out.println(obj);
		Collection<Object>ob=	prop.values();
		System.out.println(ob);





	}
}