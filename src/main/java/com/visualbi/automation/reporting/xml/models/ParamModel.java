package com.visualbi.automation.reporting.xml.models;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by praveenn on 2/7/2017.
 */
public class ParamModel {
    @XmlElement(name = "value")
    private String value;

    public String getValue() {
        return value;
    }


}
