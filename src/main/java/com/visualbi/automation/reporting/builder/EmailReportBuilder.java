package com.visualbi.automation.reporting.builder;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.reporting.archiver.ReportArchiver;
import com.visualbi.automation.reporting.helpers.Helpers;
import com.visualbi.automation.reporting.xml.models.TestngResultsModel;
import com.visualbi.automation.utils.Mailer;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by praveenn on 4/10/2017.
 */
public class EmailReportBuilder {
    private static String emailReport = "mail-report/emailReport";
    public  static void writeEmailReport(List<TestngResultsModel> processedTestNgReports) throws IOException, ParseException {
        if(!VBIConfig.isNeedToEmail)
            return;
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(emailReport);
        String dateString=processedTestNgReports.get(0).getSuites().get(0).getStartedAt();
        String environment=processedTestNgReports.get(0).getBrowserstackEnvironment();
        AllTestNgReports allTestNgReports =
                new AllTestNgReports("Email Report", processedTestNgReports);
        allTestNgReports.setArchiveLink("https://visualbis-my.sharepoint.com/personal/praveenn_visualbi_com/Documents/AUTOMATION_RESULTS/"+ ReportArchiver.getArchiveDirectory(dateString,environment,"folder")+"/custom-testng-report/testsByClassOverview.aspx");
        Mailer.mail(processedTestNgReports.get(0).getBuildNo(),template.apply(allTestNgReports));
    }
}
