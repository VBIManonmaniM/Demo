package com.visualbi.automation.testsuite;


import com.visualbi.automation.VBIConfig;
import org.testng.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


/**
 * Created by arulkumars on 7/1/2016.
 */
public class RunTestSuite {
    public static void main(String arg[]){
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);
            // get the property value and print it out
            System.out.println(prop.getProperty("SDK_VERSION"));
            System.out.println(prop.getProperty("BUILD_NO"));
            System.out.println(prop.getProperty("DESIGNSTUDIO_PORT_NUMBER"));

            VBIConfig.buildNo =prop.getProperty("BUILD_NO");
            VBIConfig.sdkVersion =prop.getProperty("SDK_VERSION");
            VBIConfig.designstudioPortNumber =prop.getProperty("DESIGNSTUDIO_PORT_NUMBER");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Create object of TestNG Class
        TestNG runner=new TestNG();
// Create a list of String
        List<String> suitefiles=new ArrayList<String>();
// Add xml file which you have to execute
        suitefiles.add(prop.getProperty("SUITE_XML"));

// now set xml file for execution
        runner.setTestSuites(suitefiles);
        runner.setUseDefaultListeners(false);

// finally execute the runner using run method
        runner.run();

    }
}
