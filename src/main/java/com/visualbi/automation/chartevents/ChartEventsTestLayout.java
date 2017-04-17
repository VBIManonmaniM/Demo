package com.visualbi.automation.chartevents;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.xmlutils.models.Component;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;

import java.util.List;

/**
 * Created by praveenn on 3/10/2017.
 */
public class ChartEventsTestLayout {

    public static Component createLayout(Component component)
    {
        Component rootPanelComponent=new Component("ROOT_PANEL","PANEL_COMPONENT");
        component.addProperties(new String[][]{{"LEFT_MARGIN","0"},{"TOP_MARGIN","0"},{"RIGHT_MARGIN","0"},{"BOTTOM_MARGIN","100"},{"WIDTH","auto"},{"HEIGHT","auto"}});;
        rootPanelComponent.addComponent(component);
        Component resultText=new Component("RESULT_TEXT","TEXT_COMPONENT");
        resultText.addProperties(new String[][]{{"LEFT_MARGIN","0"},{"TOP_MARGIN","auto"},{"RIGHT_MARGIN","auto"},{"BOTTOM_MARGIN","0"},{"WIDTH","300"},{"HEIGHT","100"},{"CSS_CLASS", VBIConfig.ZTL_SCRIPT_RESULT_CLASS}});
        rootPanelComponent.addComponent(resultText);
        return rootPanelComponent;
    }
}
