package com.visualbi.automation;

/**
 * Created by praveenn on 1/10/2017.
 */
public class VBIConfig {
    public  static String sdkVersion ="1.59";
    public static String buildNo ="DSX.DS14.SP1.VBI.v1.0.Suite.20170410.11.56.38";
    public  static String designstudioPortNumber ="8002";
    public static String testMode ="local";
    public static String browserstackEnvironment ="WServer 2012 Chrome 56";
    public static String dsVersion ="1601";
    public static boolean isNeedToEmail=false;



    public final static String USER_HOME_DIR=System.getProperty("user.home");
    public static  String archiveFolderPath =USER_HOME_DIR+"/Friday_DUM_B";

    public final static String ANALYSIS_WORKSPACE_PATH =USER_HOME_DIR+"\\Analysis-workspace\\com.sap.ip.bi.zen\\repository";
    public final static String SDK_NAME="com.visualbi.charts";
    public final static String WORKING_DIR=System.getProperty("user.dir");
    public final static String RESOURCE_PATH= WORKING_DIR +"\\src\\main\\resources";
    public final static String CHROME_DRIVER=RESOURCE_PATH+"\\drivers\\chromedriver.exe";
    public final static String URL_PATH="http://localhost:"+ designstudioPortNumber +"/aad/zen?APPLICATION={ApplicationName}";
    public final static String CUSTOM_REPORT_OUTPUT_PATH =WORKING_DIR+"\\test-output\\custom-testng-report";
    public final static String TEST_OUTPUT =WORKING_DIR +"\\test-output";
    public final static String BS_CONFIG_FILE_PATH =WORKING_DIR +"\\crossbrowsertesting.config.json";
    public final static String ONE_DRVIE_ARCHIVE_PATH ="C:\\Users\\praveenn\\OneDrive - VISUAL BI Solutions Inc\\AUTOMATION_RESULTS";
    public final static String ZIP_ARCHIVE_FOLDER_PATH =WORKING_DIR+"\\zip-archive";
    public final static String SCREENSHOT_PATH= CUSTOM_REPORT_OUTPUT_PATH +"\\screenshots";
    public final static String BROWSER_LOG_PATH= CUSTOM_REPORT_OUTPUT_PATH +"\\browser-logs";
    public final static String EXPORT_PATH= CUSTOM_REPORT_OUTPUT_PATH +"\\exports";
    public final static String MASTER_CSV_PATH= USER_HOME_DIR +"\\OneDrive";
    public final static String HEADER_CSV_PATH= RESOURCE_PATH +"\\other-files\\csvReportHeader.csv";
    public final static String PROPERTY_BANK_PATH= RESOURCE_PATH +"\\other-files\\propertyBank.js";
    public final static String ZTl_JSON_PATH= RESOURCE_PATH +"\\ztl-script-test";
    public final static String GETTER_MAP_JSON_PATH= ZTl_JSON_PATH+"\\getterMap.json";
    public final static String GETTER_REVERSE_MAP_JSON_PATH= ZTl_JSON_PATH+"\\getterReverseMap.json";
    public final static String SETTER_MAP_JSON_PATH= ZTl_JSON_PATH+"\\setterMap.json";
    public final static String DEFAULT_VALUE_JSON_PATH= ZTl_JSON_PATH+"\\defaultValue.json";
    public final static String ZTL_SCRIPT_RESULT_CLASS= "ztl-script-result";




}
