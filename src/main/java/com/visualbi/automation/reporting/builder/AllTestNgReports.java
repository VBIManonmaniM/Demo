package com.visualbi.automation.reporting.builder;

import java.util.List;

import com.visualbi.automation.reporting.xml.models.TestngResultsModel;

public class AllTestNgReports {

    private List<TestngResultsModel> allTestSuites;

    private int suitesCount;

    private int totalTests;

    private int totalFailed = 0;

    private int totalPassed = 0;

    private int totalSkipped = 0;

    private int totalClasses = 0;

    private int totalMethods = 0;

    private String pageTitle;

    private String userName;

    private int failPercentage;


    private String archiveLink;

    private Long totalTime = (long) 0;

    public AllTestNgReports(String pageTitle, List<TestngResultsModel> allTestngResults) {
        this.pageTitle = pageTitle;
        this.allTestSuites = allTestngResults;
        this.suitesCount = allTestngResults.size();

        for (TestngResultsModel ts : allTestngResults) {
            totalPassed += ts.getTotalClassesPassed();
            totalFailed += ts.getTotalClassesFailed();
            totalSkipped += ts.getTotalClassesSkipped();
            totalTests += ts.getTotalClassesTests();
            totalTime += ts.getTotalTime();
            totalClasses += ts.getTotalClasses();
            totalMethods+=ts.getTotalMethods();

        }
        failPercentage=Math.round((float)totalFailed/totalTests)*100;
        userName=System.getProperty("user.name");

    }

    public String getPageTitle() {
        return pageTitle;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public int getSuitesCount() {
        return suitesCount;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public int getTotalFailed() {
        return totalFailed;
    }

    public int getTotalPassed() {
        return totalPassed;
    }

    public int getTotalSkipped() {
        return totalSkipped;
    }

    public List<TestngResultsModel> getAllTestSuites() {
        return allTestSuites;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getTotalMethods() {
        return totalMethods;
    }

    public String getUserName() {
        return userName;
    }

    public float getFailPercentage() {
        return failPercentage;
    }

    public String getArchiveLink() {
        return archiveLink;
    }

    public void setArchiveLink(String archiveLink) {
        this.archiveLink = archiveLink;
    }
}
