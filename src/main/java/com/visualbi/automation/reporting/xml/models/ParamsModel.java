package com.visualbi.automation.reporting.xml.models;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 2/7/2017.
 */
public class ParamsModel {
    @XmlElement(name = "param")
    List <ParamModel> paramsList =new ArrayList<>();

    public List<ParamModel> getParamsList() {
        return paramsList;
    }

}
