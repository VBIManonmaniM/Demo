package com.visualbi.automation.xmlutils.xstreammodels;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by praveenn on 3/1/2017.
 */
@XStreamAlias("bi:property")
public class Property2 {
    @XStreamAsAttribute
    private String name;
    @XStreamAlias("bi:value")
    private String value;

    public Property2(String name, String value) {
        this.name = name;
        this.value = value;
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
}
