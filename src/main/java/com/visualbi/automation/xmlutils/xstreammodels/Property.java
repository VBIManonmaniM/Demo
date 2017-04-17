package com.visualbi.automation.xmlutils.xstreammodels;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

/**
 * Created by praveenn on 1/10/2017.
 */
@XStreamConverter(value = ToAttributedValueConverter.class)
@XStreamAlias("bi:property")
public class Property {
    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public Property(String property[])
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
}
