package com.visualbi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum AutomationPropertyReader {
    INSTANCE;

    public String getPropertyValue(String propertyName) {

        Properties prop = new Properties();
		prop.add();
        InputStream in = AutomationPropertyReader.class.getResourceAsStream("testcases.properties");
        try {
            prop.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(propertyName);
    }
}