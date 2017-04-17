package com.visualbi.automation.export.model;

/**
 * Created by praveenn on 2/9/2017.
 */
public class ExportProperties {
    private String applicationName;
    private String platformVersion;

    public ExportProperties(String applicationName, String platformVersion) {
        this.applicationName = applicationName;
        this.platformVersion = platformVersion;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }
}
