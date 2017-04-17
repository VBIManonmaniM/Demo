package com.visualbi.automation.xmlutils.xstreammodels;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 1/20/2017.
 */

@XStreamAlias("bi:data_source_alias")
public class DataSource {

    @XStreamAsAttribute
    private String name;

    @XStreamAsAttribute
    private String type;

    @XStreamImplicit
    private List<Property> properties = new ArrayList<Property>();

    public DataSource(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void addProperty(Property property)
    {
        this.properties.add(property);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
