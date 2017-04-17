package com.visualbi.automation.reporting.builder;

import com.visualbi.automation.reporting.archiver.ReportArchiver;
import com.visualbi.automation.reporting.helpers.Helpers;
import com.visualbi.automation.reporting.xml.models.*;
import com.visualbi.automation.utils.IOCopier;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.utils.Mailer;
import org.apache.commons.io.FileUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TestNgReportBuilder {
    public static final String TESTS_BY_CLASS_OVERVIEW = "testsByClassOverview.aspx";
    public static final String TESTS_BY_METHOD_OVERVIEW = "testsByTestMethodOverview.aspx";

    private final String testOverviewPath;

    private final String classesSummaryPath;
    private final String methodSummaryPath;

    private String testSummaryReport = "testng-reporting/testCaseSummaryReport";
    private String testMethodSummaryReport = "testng-reporting/testMethodSummaryReport";

    private String testOverviewReport = "testng-reporting/testsByClassOverview";

    private String testNameOverviewReport = "testng-reporting/testsByNameOverview";
    private String csvReport = "testng-reporting/csvReport";


    private String testMethodOverviewReport = "testng-reporting/testsByTestMethodOverview";

    private String buildDataTemplate = "testng-reporting/buildData";


    private List<TestngResultsModel> processedTestNgReports;

    public TestNgReportBuilder(List<String> xmlReports, String targetBuildPath)
        throws JAXBException, XMLStreamException, FactoryConfigurationError, IOException {
        testOverviewPath = targetBuildPath + "/";
        classesSummaryPath = targetBuildPath + "/classes-summary/";
        methodSummaryPath = targetBuildPath + "/testmethod-summary/";

        processedTestNgReports = new ArrayList<>();

        JAXBContext cntx = JAXBContext.newInstance(TestngResultsModel.class);

        Unmarshaller unm = cntx.createUnmarshaller();

        for (String xml : xmlReports) {
            InputStream inputStream = new FileInputStream(xml);
            XMLStreamReader xmlStream = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
            TestngResultsModel ts = (TestngResultsModel) unm.unmarshal(xmlStream);
            ts.postProcess();
            processedTestNgReports.add(ts);
            inputStream.close();
            xmlStream.close();
        }
    }
    private void writeBuildDataScript() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(buildDataTemplate);
        AllTestNgReports allTestNgReports =
                new AllTestNgReports("Tests by class overview reporting", processedTestNgReports);
        FileUtils.writeStringToFile(new File(testOverviewPath +"/js/build_data.js"),
                template.apply(allTestNgReports), Charset.defaultCharset());
    }
    public void copyPropertyBankFile() throws IOException {
        File propertyBankFile=new File(testOverviewPath +"/js/propertyBank.js");
        File sourcePropertyBankFile=new File(VBIConfig.PROPERTY_BANK_PATH);
        FileUtils.copyFile(sourcePropertyBankFile,propertyBankFile);


    }
    private void writeCSVReport() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(csvReport);
        AllTestNgReports allTestNgReports =
                new AllTestNgReports("Tests by class overview reporting", processedTestNgReports);
        FileUtils.writeStringToFile(new File(testOverviewPath +"/csv/csvReport.csv"),
                template.apply(allTestNgReports), Charset.defaultCharset());
    }
    private void writeTestsByClassOverview() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(testOverviewReport);
        AllTestNgReports allTestNgReports =
            new AllTestNgReports("Tests by class overview reporting", processedTestNgReports);
        FileUtils.writeStringToFile(new File(testOverviewPath + TESTS_BY_CLASS_OVERVIEW),
            template.apply(allTestNgReports), Charset.defaultCharset());
    }
    private void writeTestsByTestMethodOverview() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(testMethodOverviewReport);
        AllTestNgReports allTestNgReports =
                new AllTestNgReports("Tests by method overview reporting", processedTestNgReports);
        FileUtils.writeStringToFile(new File(testOverviewPath + TESTS_BY_METHOD_OVERVIEW),
                template.apply(allTestNgReports), Charset.defaultCharset());
    }
    private void writeTestsByNameOverview() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(testNameOverviewReport);
        AllTestNgReports allTestNgReports =
            new AllTestNgReports("Tests by name overview reporting", processedTestNgReports);
        FileUtils.writeStringToFile(new File(testOverviewPath + "testsByNameOverview.aspx"),
            template.apply(allTestNgReports), Charset.defaultCharset());
    }



    private void writeTestCaseSummaryReport() throws IOException {
        Template templateTestClassReport =
            new Helpers(new Handlebars()).registerHelpers().compile(testSummaryReport);
        for (TestngResultsModel tngr : processedTestNgReports) {
            for (SuiteModel sm : tngr.getSuites()) {
                for (TestModel tm : sm.getTests()) {
                    generateHtmlReport(templateTestClassReport, tm);
                }
            }
        }
    }

    private void writeTestMethodSummaryReport() throws IOException {
        Template templateTestMethodReport =
                new Helpers(new Handlebars()).registerHelpers().compile(testMethodSummaryReport);
        for (TestngResultsModel tngr : processedTestNgReports) {
            for (SuiteModel sm : tngr.getSuites()) {
                for (TestModel tm : sm.getTests()) {
                    generatetestMethodHtmlReport(templateTestMethodReport, tm);
                }
            }
        }
    }

    private void generatetestMethodHtmlReport(Template templateTestMethodReport, TestModel tm) throws IOException {
        for (TestMethodListModel methodListModel : tm.getTestMethods()) {

            File file = new File(methodSummaryPath + methodListModel.getName() + ".aspx");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            OutputStream os =
                new FileOutputStream(file);

            PrintWriter rw = new PrintWriter(os);
            rw.print(templateTestMethodReport.apply(methodListModel));
            rw.close();
            os.close();
        }
    }
    private void generateHtmlReport(Template templateTestClassReport, TestModel tm) throws IOException {
        for (ClassModel cm : tm.getClasses()) {

            File file = new File(classesSummaryPath + tm.getName() + cm.getName() + ".aspx");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            OutputStream os =
                    new FileOutputStream(file);

            PrintWriter rw = new PrintWriter(os);
            rw.print(templateTestClassReport.apply(cm));
            rw.close();
            os.close();
        }
    }
    private void writeMasterCSVReport() throws IOException {
        File MasterCSVDirectory = new File(VBIConfig.MASTER_CSV_PATH);
        if(!MasterCSVDirectory.exists())
        {
            MasterCSVDirectory.mkdir();
        }
        File MasterCSV=new File(VBIConfig.MASTER_CSV_PATH+"/MasterReport.csv");
        if(!MasterCSV.exists())
        {

            File HeaderFile=new File(VBIConfig.HEADER_CSV_PATH);
            FileUtils.copyFile(HeaderFile,MasterCSV);
        }
        File CSVReport=new File(testOverviewPath +"/csv/csvReport.csv");


        IOCopier.joinFiles(MasterCSV,new File[]{CSVReport});

    }

    public boolean writeReportsOnDisk() throws IOException, ParseException {
        writeBuildDataScript();
        copyPropertyBankFile();
        writeTestsByClassOverview();
        writeTestCaseSummaryReport();
        writeTestsByTestMethodOverview();
        writeTestMethodSummaryReport();
        writeCSVReport();
        writeMasterCSVReport();
        EmailReportBuilder.writeEmailReport(processedTestNgReports);
        String dateString=processedTestNgReports.get(0).getSuites().get(0).getStartedAt();
        String environment=processedTestNgReports.get(0).getBrowserstackEnvironment();

        ReportArchiver.archiveReport(dateString,environment);
        for (TestngResultsModel ts : processedTestNgReports) {
            if (ts.getTotalClassesFailed() >= 1 || ts.getTotalClassesSkipped() >= 1) {
                return false;
            }
        }
        return true;
    }

}
