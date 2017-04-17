package com.visualbi.automation.utils;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.xmlutils.models.Property;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by praveenn on 4/4/2017.
 */
public class AutomatedPropertiesReport {
    public static JSONObject automatedProperties = new JSONObject();
    public static void addToAutomatedProperties(Map<String, Property> propertyMap, String componentName){
        if(!automatedProperties.containsKey(componentName))
        {
            JSONArray propertyList=new JSONArray();
            automatedProperties.put(componentName,propertyList);
        }
        for (Map.Entry<String, Property> entry : propertyMap.entrySet())
        {
            JSONArray propertyList = (JSONArray) automatedProperties.get(componentName);
            propertyList.add(entry.getKey());
            automatedProperties.replace(componentName,propertyList);
        }
    }

    public static void writeToFile() throws IOException {
        File propertiesJSON=new File(VBIConfig.WORKING_DIR+"\\automatedProperties.json");
        FileUtils.write(propertiesJSON,automatedProperties.toJSONString(), Charset.defaultCharset());
    }
}
