package com.visualbi.automation.reporting.cli;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import com.visualbi.automation.reporting.builder.TestNgReportBuilder;
import com.visualbi.automation.VBIConfig;
import org.apache.commons.io.FileUtils;


public class TestNgReportBuilderCli {

    public static void generateReport()
            throws FactoryConfigurationError, JAXBException, XMLStreamException, IOException, ParseException {

        System.setProperty("xmlPath", VBIConfig.TEST_OUTPUT);
        System.setProperty("reportsOutputPath",VBIConfig.CUSTOM_REPORT_OUTPUT_PATH);
        List<String> xmlReports = new ArrayList<String>();
        String[] extensions = {"xml"};
        String xmlPath = System.getProperty("xmlPath");
        String outputPath = System.getProperty("reportsOutputPath");
        if (xmlPath == null || outputPath == null) {
            throw new Error("xmlPath or reportsOutputPath variables have not been set");
        }
        Object[] files = FileUtils.listFiles(new File(xmlPath), extensions, false).toArray();
        System.out.println("Found " + files.length + " xml files");
        for (Object absFilePath : files) {
            System.out.println("Found an xml: " + absFilePath);
            xmlReports.add(((File) absFilePath).getAbsolutePath());
        }

        TestNgReportBuilder repo = new TestNgReportBuilder(xmlReports, outputPath);
        repo.writeReportsOnDisk();
    }
}
