package com.visualbi.automation.reporting.xml.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupModel {
    @XmlAttribute
    private String name;

    @XmlElement(name = "method")
    private List<MethodModel> methods = new ArrayList<>();

    public GroupModel(String name) {
        this.name = name;
    }

    public GroupModel() {
    }

    public String getName() {
        return name;
    }

    public List<MethodModel> getMethods() {
        return methods;
    }

}
