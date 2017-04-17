package com.visualbi.automation.reporting.xml.models;

import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "test-method")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestMethodModel {
    @XmlAttribute
    private String status;

    @XmlAttribute
    private String signature;

    @XmlAttribute
    private String name;

    @XmlAttribute(name = "is-config")
    private boolean isConfig;

    @XmlAttribute(name = "duration-ms")
    private Long durationMs;

    @XmlAttribute(name = "started-at")
    private String startedAt;

    @XmlAttribute(name = "finished-at")
    private String finishedAt;

    @XmlElement(name = "reporter-output")
    private ReporterOutputModel reporterOutput;

    @XmlElement(name = "exception")
    private ExceptionModel exception;

    @XmlElement(name = "params")
    private ParamsModel params;

    public ParamsModel getParams() {
        return params;
    }

    public void setParams(ParamsModel params) {
        this.params = params;
    }

    private String uniqueID;

    public TestMethodModel() {
        uniqueID = UUID.randomUUID().toString();
    }

    public String getStatus() {
        return status;
    }

    public String getSignature() {
        return signature;
    }

    public String getName() {
        return name;
    }

    public boolean getIsConfig() {
        return isConfig;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public ReporterOutputModel getReporterOutput() {
        return reporterOutput;
    }

    public ExceptionModel getException() {
        return exception;
    }

    public String getUniqueID() {
        return uniqueID;
    }

}
