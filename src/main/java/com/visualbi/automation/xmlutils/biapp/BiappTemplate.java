package com.visualbi.automation.xmlutils.biapp;

import com.visualbi.automation.xmlutils.xstreammodels.Component;
import com.visualbi.automation.xmlutils.xstreammodels.BiappRoot;

/**
 * Created by praveenn on 1/10/2017.
 */
public class BiappTemplate extends BiappRoot {

    public BiappTemplate(String sdk1, String sdk1Version,Component component) {
        super(sdk1, sdk1Version);
        Component appProperties = new Component("APPLICATION_PROPERTIES","APPLICATION_PROPERTIES");
        appProperties.addProperties(new String[][]{{"THEME","sap_bluecrystal"}});
        Component absoluteLayout= new Component("ROOT","ABSOLUTE_LAYOUT_COMPONENT");
        absoluteLayout.addComponent(component);
        Component contextMenu =new Component("CONTEXT_MENU","CONTEXT_MENU_COMPONENT");
        absoluteLayout.addComponent(contextMenu);
    }
}
