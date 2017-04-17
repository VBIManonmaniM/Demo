package com.visualbi.automation.xmlutils.models;

/**
 * Created by praveenn on 3/1/2017.
 */
public class Property2 {

    private String name;
    private String value;
    private String expectedValue;

    public Property2(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Property2(String name, String value,String expectedValue) {
        this.name = name;
        this.value = value;
        this.expectedValue=expectedValue;
    }
    public Property2(String property[])
    {
        this.name = property[0];
        this.value = property[1];
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
}
