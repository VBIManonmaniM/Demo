package com.visualbi.automation.reporting.xml.models;

import org.testng.reporters.XMLReporterConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 2/12/2017.
 */
public class TestMethodListModel {
    public int totalPassed = 0;

    public int totalFailed = 0;

    public int totalSkipped = 0;

    public String name;

    public String overallStatus= XMLReporterConfig.TEST_PASSED;

    public int totalTests = 0;

    public long totalDuration = 0;

    public List<TestMethodModel> testMethods=new ArrayList<>();

    public int getTotalPassed() {
        return totalPassed;
    }

    public int getTotalFailed() {
        return totalFailed;
    }

    public int getTotalSkipped() {
        return totalSkipped;
    }

    public String getName() {
        return name;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public long getTotalDuration() {
        return totalDuration;
    }

    public List<TestMethodModel> getTestMethods() {
        return testMethods;
    }
}
