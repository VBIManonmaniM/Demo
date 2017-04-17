package com.visualbi.automation.reporting.xml.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exception")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExceptionModel {
    @XmlAttribute(name = "class")
    private String clazz;

    @XmlElement(name = "message")
    public MessageModel message;

    @XmlElement(name = "full-stacktrace")
    public FullStacktraceModel fullStacktrace;

    public String getClazz() {
        return clazz;
    }

    public MessageModel getMessage() {
        return message;
    }

    public FullStacktraceModel getFullStacktrace() {
        return fullStacktrace;
    }
}
