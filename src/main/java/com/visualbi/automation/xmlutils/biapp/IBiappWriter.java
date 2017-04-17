package com.visualbi.automation.xmlutils.biapp;


import com.visualbi.automation.xmlutils.models.Component;

/**
 * Created by praveenn on 1/10/2017.
 */
public interface IBiappWriter {

    public void createBIAppFile(String filePath, Component component, String sdkName, String sdkVersion);
}
