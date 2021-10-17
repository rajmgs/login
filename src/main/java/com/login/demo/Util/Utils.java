package com.login.demo.Util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
	private static final Logger logger= LoggerFactory.getLogger(Utils.class);
	public static String readProperties(String key) {
		
		Properties prop = new Properties();
		InputStream input=null;
		String Value=null;
		try {
			ClassLoader classloader= Thread.currentThread().getContextClassLoader();
			input= classloader.getResourceAsStream("db.properties");
			prop.load(input);
			Value= prop.getProperty(key);
		} catch (IOException e) {
			logger.error("error wile reading propperties file",e);
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
		
					logger.error("error wile reading propperties file",e);
				}
			}
		}
		return Value;
		
	}

}
