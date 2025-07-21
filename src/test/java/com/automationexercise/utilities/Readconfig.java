package com.automationexercise.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties properties;
	FileInputStream inputStream;

	public Readconfig() throws IOException {
		String config_filepath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\configfiles\\config.properties";

		properties = new Properties();
		inputStream = new FileInputStream(config_filepath);
		properties.load(inputStream);
	}

	public String get_property(String property) {
		return properties.getProperty(property);
	}
}
