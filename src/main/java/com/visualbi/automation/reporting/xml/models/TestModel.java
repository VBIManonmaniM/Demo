package com.visualbi.automation.reporting.xml.models;

import org.testng.reporters.XMLReporterConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "test")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestModel {

    @XmlAttribute
    private String name;

    @XmlAttribute(name = "duration-ms")
    private String durationMs;

    @XmlAttribute(name = "started-at")
    private String startedAt;

    @XmlAttribute(name = "finished-at")
    private String finishedAt;

    @XmlElement(name = "class")
    private List<ClassModel> classes = new ArrayList<>();

    private int totalPassed = 0;

    private int totalFailed = 0;

    private int totalSkipped = 0;

    private Map<String,TestMethodListModel> testMethods;

    public void postProcess() {
        for (ClassModel cm : getClasses()) {
            cm.postProcess();
            totalPassed += cm.getTotalPassed();
            totalFailed += cm.getTotalFailed();
            totalSkipped += cm.getTotalSkipped();
        }
        testMethods=new HashMap<>();
        for (ClassModel cm : getClasses()) {
            for(TestMethodModel tm : cm.getTestMethods())
            {
                if(!tm.getIsConfig())
                {
                    if(testMethods.get(tm.getName())==null)
                    {
                        TestMethodListModel ml=new TestMethodListModel();
                        ml.name=tm.getName();
                        ml.overallStatus=XMLReporterConfig.TEST_PASSED;
                        testMethods.put(tm.getName(),ml);
                    }

                    TestMethodListModel ml=testMethods.get(tm.getName());
                    ml.testMethods.add(tm);
                    ml.totalTests++;
                    ml.totalDuration+=tm.getDurationMs();
                    switch (tm.getStatus().toUpperCase()) {
                        case XMLReporterConfig.TEST_PASSED:
                            ml.totalPassed++;
                            break;
                        case XMLReporterConfig.TEST_FAILED:
                            ml.overallStatus=XMLReporterConfig.TEST_FAILED;
                            ml.totalFailed++;
                            break;
                        case XMLReporterConfig.TEST_SKIPPED:
                            ml.overallStatus=XMLReporterConfig.TEST_FAILED;
                            ml.totalSkipped++;
                            break;
                        default:
                            break;
                    }
                }
            }

        }
    }

    public List<TestMethodListModel> getTestMethods() {
        return new ArrayList<TestMethodListModel>(testMethods.values());
    }

    public String getName() {
        return name;
    }

    public String getDurationMs() {
        return durationMs;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public List<ClassModel> getClasses() {
        return classes;
    }

    public int getTotalPassed() {
        return totalPassed;
    }

    public int getTotalFailed() {
        return totalFailed;
    }

    public int getTotalSkipped() {
        return totalSkipped;
    }

}
