package com.visualbi.automation.xmlutils.models;

import java.util.List;

/**
 * Created by praveenn on 1/10/2017.
 */
public class Property {
    private String name;
    private String value;
    private String expectedValue;


    public Property(String name, String value, String expectedValue) {
        this.name = name;
        this.value = value;
        this.expectedValue = expectedValue;
    }
    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Property(String property[])
    {
        this.name = property[0];
        this.value = property[1];
        if(property.length>2)
        this.value = property[2];
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public String toString() {
        return "\"{" +
                "\"name\":\"" + name + '\"' +
                ",\"value\":\"" + value + '\"' +
                "}\"";
    }
}
