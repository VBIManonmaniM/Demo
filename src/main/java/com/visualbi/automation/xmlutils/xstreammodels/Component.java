package com.visualbi.automation.xmlutils.xstreammodels;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 1/10/2017.
 */
@XStreamAlias("bi:component")
public class Component {
    @XStreamAsAttribute
    private String name;

    @XStreamAsAttribute
    private String type;

    @XStreamImplicit
    private List<Property> properties = new ArrayList<Property>();

    @XStreamImplicit
    private List<Property2> properties2 = new ArrayList<Property2>();



    @XStreamImplicit
    private List<Component> components = new ArrayList<Component>();

    public Component(String name, String type) {
        this.name = name;
        this.type = type;
        }

    public void addProperty(Property property)
    {
        this.properties.add(property);
    }
    public void addComponent(Component component)
    {
        this.components.add(component);
    }


    public void addProperties(String propertyList[][])
    {
        for (String property[]:propertyList) {
            this.addProperty(new Property(property));
        }
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

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<Property2> getProperties2() {
        return properties2;
    }

    public void setProperties2(List<Property2> properties2) {
        this.properties2 = properties2;
    }
}
