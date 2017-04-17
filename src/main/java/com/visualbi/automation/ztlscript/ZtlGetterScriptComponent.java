package com.visualbi.automation.ztlscript;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.xmlutils.models.Component;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created by praveenn on 3/2/2017.
 */
public class ZtlGetterScriptComponent {
    Component component;
    JSONObject getterJSON;
    JSONObject defaultValueJSON;

    public ZtlGetterScriptComponent(Component component, JSONObject getterJSON, JSONObject defaultValueJSON) {
        this.component = component;
        this.getterJSON = getterJSON;
        this.defaultValueJSON = defaultValueJSON;
    }

    public Component getProcessedComponent()
    {
        Component rootPanelComponent=new Component("ROOT_PANEL","PANEL_COMPONENT");
        component.addProperties(new String[][]{{"LEFT_MARGIN","0"},{"TOP_MARGIN","0"},{"RIGHT_MARGIN","0"},{"BOTTOM_MARGIN","auto"},{"WIDTH","auto"},{"HEIGHT","200"}});;
        rootPanelComponent.addComponent(component);
        Component resultText=new Component("RESULT_TEXT","TEXT_COMPONENT");
        resultText.addProperties(new String[][]{{"LEFT_MARGIN","0"},{"TOP_MARGIN","auto"},{"RIGHT_MARGIN","auto"},{"BOTTOM_MARGIN","0"},{"WIDTH","300"},{"HEIGHT","100"},{"CSS_CLASS", VBIConfig.ZTL_SCRIPT_RESULT_CLASS}});
        rootPanelComponent.addComponent(resultText);
        Integer leftMargin=0,topMargin=200;
        for ( Object key: getterJSON.keySet()) {
            JSONObject scriptFunction=(JSONObject)getterJSON.get(key);
            String biappProperty= (String) scriptFunction.get("property");
            String returnType= (String) scriptFunction.get("returntype");
            String propertyValue;
                propertyValue= (String) defaultValueJSON.get(biappProperty);
           if(propertyValue==null)
                propertyValue= (String) defaultValueJSON.get(returnType);

            if(propertyValue!=null) {

                component.addProperty(new Property(biappProperty,propertyValue));
                Component button = new Component("BUTTON_" + key.toString().toUpperCase(), "BUTTON_COMPONENT");
                button.addProperties(new String[][]{{"LEFT_MARGIN", leftMargin.toString()}, {"TOP_MARGIN", topMargin.toString()}, {"RIGHT_MARGIN", "auto"}, {"BOTTOM_MARGIN", "auto"}, {"WIDTH", "20"}, {"HEIGHT", "20"}});
                String buttonScript = "RESULT_TEXT.setText(\"" + key + ":\"+" + component.getName() + "." + key + "());";
                button.addProperty2(new Property2("ON_SELECT", buttonScript));
                button.addProperty(new Property("CSS_CLASS",key.toString().toLowerCase()));
                rootPanelComponent.addComponent(button);
                leftMargin = leftMargin + 20;
                if(leftMargin>=700)
                {
                    leftMargin=0;
                    topMargin=topMargin+20;
                }

            }
        }
        return rootPanelComponent;
    }
}
