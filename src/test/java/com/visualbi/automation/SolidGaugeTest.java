package com.visualbi.automation;


import com.visualbi.automation.base.HighchartsTest;
import com.visualbi.automation.base.ZtlScriptTest;
import com.visualbi.automation.constants.*;
import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBIProperty2;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.pages.SolidGaugePage;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import org.fluentlenium.core.annotation.Page;
import static com.visualbi.automation.constants.Properties.*;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import java.util.Map;

/**
* Created by Code Generation Tool on Wed May 10 04:39:40 CDT 2017.
*/

@VBIComponentConfig(componentName="SOLIDGAUGE",type="com_visualbi_charts_SolidGauge")
public class SolidGaugeTest extends HighchartsTest{
@Page
private SolidGaugePage solidGaugePage;

@VBITestConfig(properties ={
		@VBIProperty(name = Title.TEXT,value= Text.TEXT1),
		@VBIProperty(name = Title.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		@VBIProperty(name = Title.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name = Title.FONTWEIGHT,value = Font.Weight.BOLD),
		@VBIProperty(name = Title.FONTFAMILY,value = Font.Family.VERDANA),
		@VBIProperty(name = Title.ALIGN,value = Align.RIGHT,expectedValue = "end")
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"title"})
public void testTitle(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testTitle(propertyMap,solidGaugePage);
}

 @VBITestConfig(properties ={
	   @VBIProperty(name = SubTitle.TEXT,value = Text.TEXT1),
	   @VBIProperty(name = SubTitle.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
	   @VBIProperty(name = SubTitle.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	   @VBIProperty(name = SubTitle.FONTWEIGHT,value = Font.Weight.BOLD),
	   @VBIProperty(name = SubTitle.FONTFAMILY,value = Font.Family.VERDANA),
	   @VBIProperty(name = SubTitle.ALIGN,value = Align.RIGHT,expectedValue = "end")
 })
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"subtitle"})
public void testSubtitle(Map<String, Property> propertyMap, String componentName){
   solidGaugePage.go(componentName);
   testSubtitle(propertyMap,solidGaugePage);
}


@VBITestConfig(properties ={
		@VBIProperty(name=GoogleFont.ENABLE,value=Common.ENABLE ),
		@VBIProperty(name=GoogleFont.FONTFAMILY,value =Font.Family.CARDO),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testGoogleFont(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testGoogleFont(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= PlotOption.MARGINTOP,value= Count.TWENTY),
		@VBIProperty(name=PlotOption.MARGINLEFT,value = Count.TEN),
		@VBIProperty(name = PlotOption.CHARTSHADOW, value =Common.ENABLE ,expectedValue = Colors.BLACK_HEX),
		@VBIProperty(name=PlotOption.PLOTSHADOW,value = Common.ENABLE,expectedValue = Colors.BLACK_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotOptions(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testPlotOptions(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = Background.COLOR,value= Colors.BLACK_HEX),
		@VBIProperty(name = Border.COLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = Border.WIDTH, value = Count.TEN),
		@VBIProperty(name = Border.RADIUS,value = Count.FIVE)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testBackgroundAndBorder(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testBackgroundAndBorder(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = PlotArea.BORDERWIDTH,value = Count.FIVE),
		@VBIProperty(name = PlotArea.BORDERCOLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = PlotArea.BACKGROUNDCOLOR, value = Colors.RED_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotArea(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testPlotArea(propertyMap,solidGaugePage);
}


@VBITestConfig(properties ={
		@VBIProperty(name= Datalabel.ENABLE,value = Common.ENABLE),
		@VBIProperty(name= NumberFormat.NO_OF_DECIMAL,value =  Count.THREE),
		@VBIProperty(name= NumberFormat.PREFIX,value = Common.OPENBRACE),
		@VBIProperty(name= NumberFormat.SUFFIX,value = "_"),
		@VBIProperty(name= NumberFormat.DECIMAL_SEPARATOR,value = "?"),
		@VBIProperty(name= NumberFormat.DECIMAL_SEPARATOR2,value = "?"),
		//@VBIProperty(name= NumberFormat.THOUSANDS_SEPARATOR,value = "#")
		//@VBIProperty(name= NumberFormat.THOUSANDS_SEPARATOR2,value = "#")
		})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"numberformat"})
public void testNumberFormat(Map<String, Property> propertyMap, String componentName) throws Exception{
	solidGaugePage.go(componentName);
	testNumberFormat(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
		@VBIProperty(name=Datalabel.ENABLE,value = Common.ENABLE),
		@VBIProperty(name=Datalabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		@VBIProperty(name= Datalabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name=Datalabel.FONTWEIGHT,value = Font.Weight.BOLD),
		@VBIProperty(name= Datalabel.FONTFAMILY,value= Font.Family.VERDANA)
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testDataLabelStyle(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testDataLabelStyle(propertyMap,solidGaugePage);
}
  @VBITestConfig(properties ={
	@VBIProperty(name=Credit.ENABLE,value = Common.ENABLE),
	@VBIProperty(name= Credit.TEXT,value= Text.TEXT1),
	@VBIProperty(name=Credit.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
	@VBIProperty(name = Credit.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name=Credit.FONTWEIGHT,value = Font.Weight.BOLD),
	@VBIProperty(name= Credit.FONTFAMILY,value= Font.Family.VERDANA),
	@VBIProperty(name=Credit.ALIGN,value= Align.RIGHT,expectedValue = "end"),
	@VBIProperty(name=Credit.CURSOUR,value= Cursor.POINTER)

})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"metadata"})
public void testCredits(Map<String, Property> propertyMap, String componentName){
	solidGaugePage.go(componentName);
	testCredits(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE_WIDTH,value = Count.THREE,expectedValue =Count.THREE),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
	solidGaugePage.go(componentName);
	testExportSymbolStyles(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= Export.EXPORT_BACKGROUND_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_RADIUS,value =Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_HOVER_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportBackground(Map<String, Property> propertyMap, String componentName) throws Exception{
	solidGaugePage.go(componentName);

	testExportBackGround(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ENABLED,value = ""),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportEnabled(Map<String, Property> propertyMap, String componentName) throws Exception{
	solidGaugePage.go(componentName);

	testExportIconEnabled(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_MENU_BACKGROUND_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_MENU_TEXT_COLOR,value = Colors.GREY_HEX,expectedValue =Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_MENU_FONT_STYLE,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
	@VBIProperty(name= Export.EXPORT_MENU_TEXT_HOVER_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_MENU_FONT_HOVER_STYLE,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
	@VBIProperty(name= Export.EXPORT_MENU_HOVER_STYLE_BACKGROUND,value = Colors.VIOLET_HEX,expectedValue = Colors.VIOLET_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportDropDownMenu(Map<String, Property> propertyMap, String componentName) throws Exception{
	solidGaugePage.go(componentName);

	testExportDropDownStyles(propertyMap,solidGaugePage);
}

@VBITestConfig(properties ={},testType = "ztlGetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlGetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlGetterScriptTest(JSONObject getterJSON,JSONObject defaultValueJSON,String componentName) throws Exception{
	 solidGaugePage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testGetterScript(solidGaugePage,getterJSON,defaultValueJSON);
}

@VBITestConfig(properties ={},testType = "ztlSetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlSetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlSetterScriptTest(JSONObject setterJSON,JSONObject defaultValueJSON,JSONObject getterReverseJSON,String componentName) throws Exception{
	solidGaugePage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testSetterScript(solidGaugePage,setterJSON,defaultValueJSON,getterReverseJSON);
}
	@VBITestConfig(properties2 = {
	@VBIProperty2(name = Event.ON_CHART_LOAD,value = "RESULT_TEXT.setText(\"ON_CHART_LOAD_TEST\");",expectedValue = "ON_CHART_LOAD_TEST")},
	testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","chartloadevent"})
	public void testOnChartLoad(Map<String, Property2> property2Map, String componentName) throws Exception{
		solidGaugePage.go(componentName);
		testOnChartLoad(property2Map,solidGaugePage);
	}
   /********** Data Series -> Data Selection ***/
   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.Datalabel.ENABLE,value = Common.ENABLE),
		   @VBIProperty(name= Properties.Datalabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		   @VBIProperty(name = Properties.Datalabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		   @VBIProperty(name= Properties.Datalabel.FONTWEIGHT,value = Font.Weight.BOLD),
		   @VBIProperty(name= Properties.Datalabel.FONTFAMILY,value= Font.Family.VERDANA)

   })
   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSelection(Map<String, Property> propertyMap, String componentName){
	   solidGaugePage.go(componentName);
	   testDataSelection(propertyMap,solidGaugePage);
   }



}
