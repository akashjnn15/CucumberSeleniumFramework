package com.facebook.test.Helpers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerClass {

	protected static Logger log = Logger.getLogger(LoggerClass.class.getName());

	static {

		PropertyConfigurator
				.configure("src/main/resources/ConfigFiles/Log4J.properties");
	}

	public static void info(final String message) {
		LoggerClass.log.info(message);
	}

	public static void warn(final String message) {
		LoggerClass.log.warn(message);
	}

}
