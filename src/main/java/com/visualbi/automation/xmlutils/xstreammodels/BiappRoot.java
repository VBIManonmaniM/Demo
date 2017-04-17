package com.visualbi.automation.xmlutils.xstreammodels;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 1/10/2017.
 */
@XStreamAlias("bi:biapp")
public class BiappRoot {
    @XStreamAsAttribute
    @XStreamAlias("bi:version")
    private final String biVersion="1601";

    @XStreamAsAttribute
    @XStreamAlias("xmlns")
    private final String xmlns="http://www.w3.org/TR/REC-html40";
    @XStreamAsAttribute
    @XStreamAlias("xmlns:bi")
    private final String bi="http://xml.sap.com/2011/biml/biapp";


    @XStreamAsAttribute
    @XStreamAlias("xmlns:jsp")
    private final String jsp="http://java.sun.com/JSP/Page";

    @XStreamAsAttribute
    @XStreamAlias("xmlns:h")
    private final String h="http://www.w3.org/TR/REC-html40";

    @XStreamAsAttribute
    @XStreamAlias("xmlns:sdk1")
    private  String sdk1;

    @XStreamAsAttribute
    @XStreamAlias("sdk1:version")
    private  String sdk1Version;

    @XStreamAsAttribute
    @XStreamAlias("xmlns:sdk2")
    private  final String sdk2="com.visualbi.utilities";

    @XStreamAsAttribute
    @XStreamAlias("sdk2:version")
    private final  String sdk2Version="1.59";
    @XStreamImplicit
    private List<DataSource> dataSources = new ArrayList<DataSource>();
    @XStreamImplicit
    private List<Component> components = new ArrayList<Component>();

    public BiappRoot(String sdk1, String sdk1Version) {
        this.sdk1 = sdk1;
        this.sdk1Version = sdk1Version;
    }

    public void addComponent(Component component)
    {
        this.components.add(component);
    }

    public void addDataSource(DataSource dataSource){this.dataSources.add(dataSource);}

    public String getSdk1Version() {
        return sdk1Version;
    }

    public void setSdk1Version(String sdk1Version) {
        this.sdk1Version = sdk1Version;
    }

    public String getSdk1() {
        return sdk1;
    }

    public void setSdk1(String sdk1) {
        this.sdk1 = sdk1;
    }
}
