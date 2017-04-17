package com.visualbi.automation.base;


import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBIProperty2;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.chartevents.ChartEventsTestLayout;
import com.visualbi.automation.export.ApplicationExporter;
import com.visualbi.automation.utils.BrowserLog;
import com.visualbi.automation.xmlutils.biapp.BiappXStreamWriter;
import com.visualbi.automation.xmlutils.biapp.IBiappWriter;
import com.visualbi.automation.xmlutils.models.Component;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import com.visualbi.automation.ztlscript.ZtlGetterScriptComponent;
import com.visualbi.automation.ztlscript.ZtlSetterScriptComponent;
import com.visualbi.automation.utils.AutomatedPropertiesReport;
import org.apache.commons.io.FileUtils;
import org.fluentlenium.adapter.testng.FluentTestNg;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.stream.Collectors;

/**
 * Created by praveenn on 1/10/2017.
 */
public class BaseTest extends FluentTestNg {

    @BeforeSuite(alwaysRun = true)
    @Parameters( {"testMode","browserstackEnvironment","needToEmail"} )
    public void beforeSuite(@Optional("local")String testMode,@Optional("Chrome")String browserstackEnvironment,@Optional("false")String needToEmail) throws IOException {
        VBIConfig.testMode =testMode;
        VBIConfig.browserstackEnvironment=browserstackEnvironment;
        if(needToEmail.equals("true"))
        {
            VBIConfig.isNeedToEmail=true;
            VBIConfig.archiveFolderPath=VBIConfig.ONE_DRVIE_ARCHIVE_PATH;
        }
        FileUtils.deleteDirectory(new File(VBIConfig.TEST_OUTPUT));
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(Method method){

        if(VBIConfig.testMode.equals("report"))
            return;
        VBIComponentConfig componentConfig = method.getDeclaringClass().getAnnotation(VBIComponentConfig.class);
        String componentName = componentConfig.componentName();
        String componentType = componentConfig.type();
        VBIProperty[] properties;
        VBIProperty2[] properties2;
        List<Property> propertyList;
        List<Property2> property2List;
        Component component;
        String testType=method.getAnnotation(VBITestConfig.class).testType();
        JSONParser parser = new JSONParser();
        JSONObject defaultValueJSON = null;
         switch (testType)
         {
             case "ztlGetterScriptTest":
                    JSONObject getterJSON = null;
                 try {
                     getterJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.GETTER_MAP_JSON_PATH));
                     defaultValueJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.DEFAULT_VALUE_JSON_PATH));
                 } catch (IOException e) {
                     e.printStackTrace();
                 } catch (ParseException e) {
                     e.printStackTrace();
                 }
                 ZtlGetterScriptComponent ztlGetterScriptComponent=new ZtlGetterScriptComponent(new Component(componentName,componentType),(JSONObject)getterJSON.get(componentName),defaultValueJSON);
                 component=ztlGetterScriptComponent.getProcessedComponent();
                 break;
             case "ztlSetterScriptTest":
                 JSONObject setterJSON = null;
                 JSONObject getterReverseJSON = null;

                 try {
                     setterJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.SETTER_MAP_JSON_PATH));
                     defaultValueJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.DEFAULT_VALUE_JSON_PATH));
                     getterReverseJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.GETTER_REVERSE_MAP_JSON_PATH));
                 } catch (IOException e) {
                     e.printStackTrace();
                 } catch (ParseException e) {
                     e.printStackTrace();
                 }
                 ZtlSetterScriptComponent ztlSetterScriptComponent=new ZtlSetterScriptComponent(new Component(componentName,componentType),(JSONObject)setterJSON.get(componentName),defaultValueJSON,(JSONObject)getterReverseJSON.get(componentName));
                 component=ztlSetterScriptComponent.getProcessedComponent();
                 break;

             case "chartEventTest":
             case "propertyTest":
             default:
                 properties = method.getAnnotation(VBITestConfig.class).properties();
                 properties2 = method.getAnnotation(VBITestConfig.class).properties2();
                 propertyList = Arrays.stream(properties).map(p -> new Property(p.name(), p.value(), p.expectedValue())).collect(Collectors.toList());
                 property2List = Arrays.stream(properties2).map(p -> new Property2(p.name(), p.value())).collect(Collectors.toList());
                 component=new Component(componentName, componentType);
                 component.setProperties(propertyList);
                 component.setProperties2(property2List);

                 break;
         }
     if(testType.equals("chartEventTest"))
         component= ChartEventsTestLayout.createLayout(component);
      String fileLocation= VBIConfig.ANALYSIS_WORKSPACE_PATH +"/"+componentName+"/";
        IBiappWriter biappXStreamWriter= new BiappXStreamWriter();
        biappXStreamWriter.createBIAppFile(fileLocation,component,VBIConfig.SDK_NAME,VBIConfig.sdkVersion);
    }
    @DataProvider(name = "vbiAutomationDataProvider")
    public Object[][] createTestData(Method method) {
        VBIComponentConfig componentConfig = method.getDeclaringClass().getAnnotation(VBIComponentConfig.class);
        String componentName = componentConfig.componentName();
        String chartName = componentConfig.type().replace("com_visualbi_charts_","");

        VBIProperty[] properties=method.getAnnotation(VBITestConfig.class).properties();
        List<Property> propertyList=Arrays.stream(properties).map(p -> new Property(p.name(), p.value(),p.expectedValue())).collect(Collectors.toList());
        Map<String, Property> propertyMap = propertyList.stream().collect(Collectors.toMap(property -> property.getName(), property -> property));

        if(VBIConfig.testMode.equals("report"))
        {
            AutomatedPropertiesReport.addToAutomatedProperties(propertyMap,chartName);
            return new Object[][] {};
        }
        return new Object[][] {
                {propertyMap,componentName}
        };
    }

    @DataProvider(name = "vbiChartEventAutomationDataProvider")
    public Object[][] createChartEventTestData(Method method) {
        VBIComponentConfig componentConfig = method.getDeclaringClass().getAnnotation(VBIComponentConfig.class);
        String componentName = componentConfig.componentName();
        String chartName = componentConfig.type().replace("com_visualbi_charts_","");
        VBIProperty2[] properties2=method.getAnnotation(VBITestConfig.class).properties2();
        if(VBIConfig.testMode.equals("report"))
        {
            List<Property> propertyList=Arrays.stream(properties2).map(p -> new Property(p.name(), p.value(),p.expectedValue())).collect(Collectors.toList());
            Map<String, Property> propertyMap = propertyList.stream().collect(Collectors.toMap(property -> property.getName(), property -> property));
            AutomatedPropertiesReport.addToAutomatedProperties(propertyMap,chartName);
            return new Object[][] {};
        }


        List<Property2> property2List=Arrays.stream(properties2).map(p -> new Property2(p.name(), p.value(),p.expectedValue())).collect(Collectors.toList());
        Map<String, Property2> property2Map = property2List.stream().collect(Collectors.toMap(property -> property.getName(), property -> property));



        return new Object[][] {
                {property2Map,componentName}
        };
    }
    @DataProvider(name = "vbiZtlGetterScriptAutomationDataProvider")
    public Object[][] creatZtlGetterSciptTestData(Method method) {
        VBIComponentConfig componentConfig = method.getDeclaringClass().getAnnotation(VBIComponentConfig.class);
        String componentName = componentConfig.componentName();
        JSONParser parser = new JSONParser();
        JSONObject getterJSON = null;
        JSONObject defaultValueJSON = null;

        try {
            getterJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.GETTER_MAP_JSON_PATH));
            getterJSON= (JSONObject) getterJSON.get(componentName);
            defaultValueJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.DEFAULT_VALUE_JSON_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Object[][] {
                {getterJSON,defaultValueJSON,componentName}
        };
    }
    @DataProvider(name = "vbiZtlSetterScriptAutomationDataProvider")
    public Object[][] creatZtlSettterSciptTestData(Method method) {
        VBIComponentConfig componentConfig = method.getDeclaringClass().getAnnotation(VBIComponentConfig.class);
        String componentName = componentConfig.componentName();
        JSONParser parser = new JSONParser();
        JSONObject setterJSON = null;
        JSONObject defaultValueJSON = null;
        JSONObject getterReverseJSON = null;

        try {
            setterJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.SETTER_MAP_JSON_PATH));
            setterJSON = (JSONObject) setterJSON.get(componentName);
            getterReverseJSON= (JSONObject) parser.parse(new FileReader(VBIConfig.GETTER_REVERSE_MAP_JSON_PATH));
            getterReverseJSON= (JSONObject) getterReverseJSON.get(componentName);
            defaultValueJSON = (JSONObject) parser.parse(new FileReader(VBIConfig.DEFAULT_VALUE_JSON_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Object[][] {
                {setterJSON,defaultValueJSON,getterReverseJSON,componentName}
        };
    }
    @Override
    public WebDriver newWebDriver() {
         if(VBIConfig.testMode.equals("browserstack")) {
             JSONParser parser = new JSONParser();
             JSONObject config = null;
             try {
                 config = (JSONObject) parser.parse(new FileReader(VBIConfig.BS_CONFIG_FILE_PATH));
             } catch (IOException e) {
                 e.printStackTrace();
             } catch (ParseException e) {
                 e.printStackTrace();
             }
             JSONObject envs = (JSONObject) config.get("environments");

             DesiredCapabilities capabilities = new DesiredCapabilities();

             Map<String, String> envCapabilities = (Map<String, String>) envs.get(VBIConfig.browserstackEnvironment);
             Iterator it = envCapabilities.entrySet().iterator();
             while (it.hasNext()) {
                 Map.Entry pair = (Map.Entry) it.next();
                 capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
             }

             Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
             it = commonCapabilities.entrySet().iterator();
             while (it.hasNext()) {
                 Map.Entry pair = (Map.Entry) it.next();
                 if (capabilities.getCapability(pair.getKey().toString()) == null) {
                     capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
                 }
             }

             String username = System.getenv("BROWSERSTACK_USERNAME");
             if (username == null) {
                 username = (String) config.get("user");
             }

             String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
             if (accessKey == null) {
                 accessKey = (String) config.get("key");
             }


             String HUB_URL = "http://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub";


             URL hubURL = null;
             try {
                 hubURL = new URL(HUB_URL);
             } catch (Exception e) {
                 System.out.println("Please provide proper crendentials. Error " + e);
             }
//             LoggingPreferences logPrefs = new LoggingPreferences();
//             logPrefs.enable(LogType.BROWSER, Level.ALL);
//             capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
             return new RemoteWebDriver(hubURL, capabilities);
         }
         else {
             System.setProperty("webdriver.chrome.driver",VBIConfig.CHROME_DRIVER);
             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             LoggingPreferences logPrefs = new LoggingPreferences();
             logPrefs.enable(LogType.BROWSER, Level.ALL);
             capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
             return new ChromeDriver(capabilities);
         }

    }

    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result) {

        if(!result.isSuccess())
        {

            String fileNameFormat=result.getParameters()[1].toString()+"_"+result.getName();
            try {

           takeScreenShot(fileNameFormat+".png");
            ApplicationExporter applicationExporter = new ApplicationExporter(result.getName(),result.getParameters()[1].toString(),VBIConfig.dsVersion);
                applicationExporter.exportBiapp();
                if(VBIConfig.testMode.equals("local")) {
                    LogEntries logEntries = getDriver().manage().logs().get(LogType.BROWSER);
                    BrowserLog.writeLogToFile(logEntries, fileNameFormat + "_log.txt", VBIConfig.BROWSER_LOG_PATH);
                }
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }

               }


    }
    @Override
    public String  getScreenshotPath(){
        return VBIConfig.SCREENSHOT_PATH;
    }

}
