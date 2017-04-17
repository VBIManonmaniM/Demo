package com.visualbi.automation.base;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.json.simple.JSONObject;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by praveenn on 3/3/2017.
 */
public class ZtlScriptTest  {
    public  void testGetterScript(HighchartsPage page, JSONObject getterJSON, JSONObject defaultValueJSON) throws InterruptedException {
        String previousValue="";
        for ( Object key: getterJSON.keySet()) {
            JSONObject scriptFunction = (JSONObject) getterJSON.get(key);
            String biappProperty = (String) scriptFunction.get("property");
            String returnType = (String) scriptFunction.get("returntype");
            String expectedValue;
            expectedValue = (String) defaultValueJSON.get(biappProperty);
            if (expectedValue == null)
                expectedValue = (String) defaultValueJSON.get(returnType);

            if (expectedValue != null) {
                if(returnType.equals("boolean"))
                    expectedValue="true";
                expectedValue=key+":"+expectedValue;
                page.clickButton(key.toString().toLowerCase());
                String actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
                for (int i=0;i<5 && actualValue.equals(previousValue);i++) {
                    actualValue = page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
                    Thread.sleep(300);
                }
                if(actualValue.equals(previousValue))
                {
                    actualValue="Error in executing script";
                }
                else {
                    previousValue=expectedValue;
                }
                assertThat(actualValue).isEqualTo(expectedValue);

            }
        }
    }

    public  void testSetterScript(HighchartsPage page, JSONObject setterJSON, JSONObject defaultValueJSON,JSONObject getterReverseJSON) throws InterruptedException {
        String previousValue="";
        for ( Object key: setterJSON.keySet()) {
            JSONObject scriptFunction = (JSONObject) setterJSON.get(key);
            String biappProperty = (String) scriptFunction.get("property");
            String returnType = (String) scriptFunction.get("paramtype");
            String expectedValue;
            expectedValue = (String) defaultValueJSON.get(biappProperty);
            if (expectedValue == null)
                expectedValue = (String) defaultValueJSON.get(returnType);

            if (expectedValue != null && getterReverseJSON.get(biappProperty)!=null) {
                if(returnType.equals("boolean"))
                    expectedValue="true";
                expectedValue=key+":"+expectedValue;
                page.clickButton(key.toString().toLowerCase());
                String actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
                for (int i=0;i<5 && actualValue.equals(previousValue);i++) {
                    actualValue = page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
                    Thread.sleep(300);
                }
                if(actualValue.equals(previousValue))
                {
                    actualValue="Error in executing script";
                }
                else {
                    previousValue=expectedValue;
                }
                assertThat(actualValue).isEqualTo(expectedValue);

            }
        }
    }
}
