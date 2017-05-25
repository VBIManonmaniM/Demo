package com.visualbi.automation.xmlutils.biapp;

import com.thoughtworks.xstream.XStream;


import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.visualbi.automation.xmlutils.xstreammodels.*;
import com.visualbi.automation.xmlutils.xstreamutils.CustomizedDomDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by praveenn on 1/10/2017.
 */
public class BiappXStreamWriter implements  IBiappWriter {
    public void createBIAppFile(String filePath, com.visualbi.automation.xmlutils.models.Component component, String sdkName, String sdkVersion,String dataSourceName) {
        String[] excludeDs=new String[]{"COLUMNBARDRILLDOWNCHART","FUNNELPYRAMIDCHART","PIEDRILLDOWNCHART","TREEMAPDRILLDOWN"};
       XStream xstream = new XStream(new CustomizedDomDriver());
        xstream.processAnnotations(BiappRoot.class);
        BiappRoot biapp=new BiappRoot(sdkName,sdkVersion);
        Component applicationProperties = new Component("APPLICATION_PROPERTIES","APPLICATION_PROPERTIES");
        applicationProperties.addProperties(new String[][]{{"THEME","sap_bluecrystal"},{"COMPACT_MODE","X"}});
        DataSource dataSource=new DataSource("DS_1","com_visualbi_utilities_ConstantDataSource");
        dataSource.addProperty(new Property("datasourcevalue",dataSourceName));
       // dataSource.addProperty(new Property("datasourcevalue","HierData 1"));
        Component absoluteLayout= new Component("ROOT","ABSOLUTE_LAYOUT_COMPONENT");
        Component convertedComponent = convertComponent(component);
        convertedComponent.addProperties(new String[][]{{"LEFT_MARGIN","0"},{"TOP_MARGIN","0"},{"RIGHT_MARGIN","0"},{"BOTTOM_MARGIN","0"},{"WIDTH","auto"},{"HEIGHT","auto"}});
        absoluteLayout.addComponent(convertedComponent);
        Component contextMenu =new Component("CONTEXT_MENU","CONTEXT_MENU_COMPONENT");
        absoluteLayout.addComponent(contextMenu);
        biapp.addComponent(applicationProperties);
        if(!Arrays.asList(excludeDs).contains(component.getName()) || !(dataSourceName.equals("Mul Mes 1 Dim")))
        {biapp.addDataSource(dataSource);
            convertedComponent.addProperties(new String[][]{{"DATA_SOURCE_ALIAS_REF","DS_1"}});
        }

        biapp.addComponent(absoluteLayout);

        try {
            File fileDirectory = new File(filePath);
            if (!fileDirectory.exists()) {
                fileDirectory.mkdir();
                }
            File file= new File(filePath+"content.biapp");
            if (!file.exists()) {
                file.createNewFile();
            }
            xstream.toXML(biapp, new FileOutputStream(file));
        }
           catch (Exception e) {
            e.printStackTrace();
        }

    }



    public Component convertComponent(com.visualbi.automation.xmlutils.models.Component component){
       Component xstreamComponent = new Component(component.getName(),component.getType());
        List<Property> convertedProperties = component.getProperties().stream().map(p -> new Property(p.getName(), p.getValue())).collect(Collectors.toList());
        List<Property2> convertedProperties2 = component.getProperties2().stream().map(p -> new Property2(p.getName(), p.getValue())).collect(Collectors.toList());
        List<Component> convertedComponent= component.getComponents().stream().map(p -> convertComponent(p)).collect(Collectors.toList());
        xstreamComponent.setComponents(convertedComponent);
        xstreamComponent.setProperties(convertedProperties);
        xstreamComponent.setProperties2(convertedProperties2);
        return xstreamComponent;
    }

}
