package com.visualbi.automation.reporting.xml.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "testng-results")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestngResultsModel {
    @XmlAttribute
    private String skipped;

    @XmlAttribute
    private String failed;

    @XmlAttribute
    private String total;

    @XmlAttribute
    private String passed;

    @XmlAttribute
    private String browserstackEnvironment;

    @XmlAttribute
    private String buildNo;




    private Long totalTime = (long) 0;

    @XmlElement(name = "suite")
    private List<SuiteModel> suites = new ArrayList<>();

    private int totalClasses;

    private int totalMethods = 0;

    private int totalClassesTests = 0;

    private int totalClassesFailed = 0;

    private int totalClassesPassed = 0;

    private int totalClassesSkipped = 0;


    public void postProcess() {
        for (SuiteModel sm : getSuites()) {
            sm.postProcess();
            totalTime += sm.getDurationMs();
            totalClasses += sm.getTotalClasses();
            totalClassesTests += sm.getTotalTests();
            totalClassesFailed += sm.getTotalFailed();
            totalClassesPassed += sm.getTotalPassed();
            totalClassesSkipped += sm.getTotalSkipped();
             totalMethods = sm.getTotalMethods();
        }

    }


    public String getSkipped() {
        return skipped;
    }

    public String getFailed() {
        return failed;
    }

    public String getTotal() {
        return total;
    }

    public String getPassed() {
        return passed;
    }

    public List<SuiteModel> getSuites() {
        return suites;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getTotalClassesTests() {
        return totalClassesTests;
    }

    public int getTotalClassesFailed() {
        return totalClassesFailed;
    }

    public int getTotalClassesPassed() {
        return totalClassesPassed;
    }

    public int getTotalClassesSkipped() {
        return totalClassesSkipped;
    }

    public String getBuildNo() {
        return buildNo;
    }

    public int getTotalMethods() {
        return totalMethods;
    }

    public String getBrowserstackEnvironment() {
        return browserstackEnvironment;
    }
}
