package com.visualbi.automation.ztlscript;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.xmlutils.models.Component;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import org.json.simple.JSONObject;

/**
 * Created by praveenn on 3/3/2017.
 */
public class ZtlSetterScriptComponent {
    Component component;
    JSONObject getterReverseJSON;
    JSONObject defaultValueJSON;
    JSONObject setterJSON;

    public ZtlSetterScriptComponent(Component component,JSONObject setterJSON, JSONObject defaultValueJSON, JSONObject getterReverseJSON ) {
        this.component = component;
        this.getterReverseJSON = getterReverseJSON;
        this.defaultValueJSON = defaultValueJSON;
        this.setterJSON = setterJSON;
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
        for ( Object key: setterJSON.keySet()) {
            JSONObject scriptFunction=(JSONObject)setterJSON.get(key);
            String biappProperty= (String) scriptFunction.get("property");
            String parameterType= (String) scriptFunction.get("paramtype");
            String equivalentGetterFunction=(String)getterReverseJSON.get(biappProperty);

            String propertyValue;
            if(parameterType.equals("boolean"))
                propertyValue="true";
            else
                propertyValue= (String) defaultValueJSON.get(biappProperty);

            if(propertyValue==null)
                propertyValue= (String) defaultValueJSON.get(parameterType);

            if(propertyValue!=null && equivalentGetterFunction!=null) {

                //component.addProperty(new Property(biappProperty,propertyValue));
                String buttonScriptSetter;
                if(parameterType.equals("String"))
                    buttonScriptSetter=component.getName()+"."+key+"(\""+propertyValue+"\");";
                else
                    buttonScriptSetter=component.getName()+"."+key+"("+propertyValue+");";
                Component button = new Component("BUTTON_" + key.toString().toUpperCase(), "BUTTON_COMPONENT");
                button.addProperties(new String[][]{{"LEFT_MARGIN", leftMargin.toString()}, {"TOP_MARGIN", topMargin.toString()}, {"RIGHT_MARGIN", "auto"}, {"BOTTOM_MARGIN", "auto"}, {"WIDTH", "20"}, {"HEIGHT", "20"}});
                String buttonScriptGetter = "RESULT_TEXT.setText(\"" + key + ":\"+" + component.getName() + "." + equivalentGetterFunction + "());";
                button.addProperty2(new Property2("ON_SELECT", buttonScriptSetter+buttonScriptGetter));
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
