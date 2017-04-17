package com.visualbi.test;


import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.pages.AreaChartPage;
import com.visualbi.automation.pages.base.HighchartsPage;
import com.visualbi.automation.reporting.cli.TestNgReportBuilderCli;
import com.visualbi.automation.xmlutils.biapp.BiappXStreamWriter;
import com.visualbi.automation.xmlutils.biapp.IBiappWriter;

import com.visualbi.automation.xmlutils.models.Component;
import com.visualbi.automation.ztlscript.ZtlGetterScriptComponent;
import com.visualbi.automation.ztlscript.ZtlSetterScriptComponent;
import org.fluentlenium.core.annotation.Page;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by praveenn on 1/10/2017.
 */
public class TestXml {
    @Page
    private static AreaChartPage areaChartPage;
    public static void main(String[] args) throws IOException, XMLStreamException, java.text.ParseException, JAXBException {
        TestNgReportBuilderCli.generateReport();
    }
}
