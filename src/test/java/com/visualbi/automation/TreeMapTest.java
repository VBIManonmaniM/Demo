package com.visualbi.automation;


import com.visualbi.automation.base.HighchartsTest;
import com.visualbi.automation.base.ZtlScriptTest;
import com.visualbi.automation.constants.*;
import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBIProperty2;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.pages.TreeMapPage;
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

@VBIComponentConfig(componentName="TREEMAP",type="com_visualbi_charts_TreeMap")
public class TreeMapTest extends HighchartsTest{
@Page
private TreeMapPage treeMapPage;

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
	treeMapPage.go(componentName);
	testTitle(propertyMap,treeMapPage);
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
   treeMapPage.go(componentName);
   testSubtitle(propertyMap,treeMapPage);
}


@VBITestConfig(properties ={
		@VBIProperty(name=GoogleFont.ENABLE,value=Common.ENABLE ),
		@VBIProperty(name=GoogleFont.FONTFAMILY,value =Font.Family.CARDO),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testGoogleFont(Map<String, Property> propertyMap, String componentName){
	treeMapPage.go(componentName);
	testGoogleFont(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= PlotOption.MARGINTOP,value= Count.TWENTY),
		@VBIProperty(name=PlotOption.MARGINLEFT,value = Count.TEN),
		@VBIProperty(name = PlotOption.CHARTSHADOW, value =Common.ENABLE ,expectedValue = Colors.BLACK_HEX),
		@VBIProperty(name=PlotOption.PLOTSHADOW,value = Common.ENABLE,expectedValue = Colors.BLACK_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotOptions(Map<String, Property> propertyMap, String componentName){
	treeMapPage.go(componentName);
	testPlotOptions(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = Background.COLOR,value= Colors.BLACK_HEX),
		@VBIProperty(name = Border.COLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = Border.WIDTH, value = Count.TEN),
		@VBIProperty(name = Border.RADIUS,value = Count.FIVE)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testBackgroundAndBorder(Map<String, Property> propertyMap, String componentName){
	treeMapPage.go(componentName);
	testBackgroundAndBorder(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = PlotArea.BORDERWIDTH,value = Count.FIVE),
		@VBIProperty(name = PlotArea.BORDERCOLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = PlotArea.BACKGROUNDCOLOR, value = Colors.RED_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotArea(Map<String, Property> propertyMap, String componentName){
	treeMapPage.go(componentName);
	testPlotArea(propertyMap,treeMapPage);
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
	treeMapPage.go(componentName);
	testCredits(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE_WIDTH,value = Count.THREE,expectedValue =Count.THREE),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
	treeMapPage.go(componentName);
	testExportSymbolStyles(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= Export.EXPORT_BACKGROUND_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_RADIUS,value =Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_HOVER_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportBackground(Map<String, Property> propertyMap, String componentName) throws Exception{
	treeMapPage.go(componentName);

	testExportBackGround(propertyMap,treeMapPage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ENABLED,value = ""),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportEnabled(Map<String, Property> propertyMap, String componentName) throws Exception{
	treeMapPage.go(componentName);

	testExportIconEnabled(propertyMap,treeMapPage);
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
	treeMapPage.go(componentName);

	testExportDropDownStyles(propertyMap,treeMapPage);
}

	@VBITestConfig(properties ={
			@VBIProperty(name= Tooltip.TOOLTIP_BACKGROUND_COLOR,value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
			@VBIProperty(name= Tooltip.TOOLTIP_BORDER_COLOR,value = Colors.RED_HEX,expectedValue = Colors.RED_HEX),
			@VBIProperty(name= Tooltip.TOOLTIP_BORDER_RADIUS,value = Count.TEN,expectedValue = Count.TEN),
			@VBIProperty(name= Tooltip.TOOLTIP_BORDER_WIDTH,value = Count.THREE,expectedValue = Count.THREE),
			@VBIProperty(name= Tooltip.TOOLTIP_TEXT_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name= Tooltip.TOOLTIP_FONT_WEIGHT,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
			@VBIProperty(name= Tooltip.TOOLTIP_FONT_SIZE,value = Count.TWENTY,expectedValue = Count.TWENTY),
			@VBIProperty(name= Tooltip.TOOLTIP_FONT_FAMILY,value = Font.Family.VERDANA,expectedValue = Font.Family.VERDANA)
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"tooltip"})
	public void testTooltip(Map<String, Property> propertyMap, String componentName) throws Exception{
		treeMapPage.go(componentName);
		testToolTipStyle(propertyMap,treeMapPage);
	}

	@VBITestConfig(properties ={
		@VBIProperty(name= Tooltip.TOOLTIP_DECIMAL_VALUE,value = Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Tooltip.TOOLTIP_VALUE_PREFIX,value = Common.OPENBRACE),
		@VBIProperty(name= Tooltip.TOOLTIP_VALUE_SUFFIX,value = Common.AMP),
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"tooltip"})
	public void testToolTipNumberFormat(Map<String, Property> propertyMap, String componentName) throws Exception{
		treeMapPage.go(componentName);
		testToolTipNumberFormat(propertyMap,treeMapPage);
	}
@VBITestConfig(properties ={},testType = "ztlGetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlGetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlGetterScriptTest(JSONObject getterJSON,JSONObject defaultValueJSON,String componentName) throws Exception{
	 treeMapPage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testGetterScript(treeMapPage,getterJSON,defaultValueJSON);
}

@VBITestConfig(properties ={},testType = "ztlSetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlSetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlSetterScriptTest(JSONObject setterJSON,JSONObject defaultValueJSON,JSONObject getterReverseJSON,String componentName) throws Exception{
	treeMapPage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testSetterScript(treeMapPage,setterJSON,defaultValueJSON,getterReverseJSON);
}
	@VBITestConfig(properties ={
	   @VBIProperty(name=Event.ON_CLICK_EVENT,value ="select" )	},
	   properties2 = {@VBIProperty2(name = Event.ON_SELECT,value = "RESULT_TEXT.setText(\"ON_SELECT_TEST\");",expectedValue = "ON_SELECT_TEST")},
	   testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","onclickevent"})
	public void testOnSelect(Map<String, Property2> property2Map, String componentName) throws Exception{
	   treeMapPage.go(componentName);
	   testOnSelect(property2Map,treeMapPage);
	}
	@VBITestConfig(properties2 = {
	@VBIProperty2(name = Event.ON_CHART_LOAD,value = "RESULT_TEXT.setText(\"ON_CHART_LOAD_TEST\");",expectedValue = "ON_CHART_LOAD_TEST")},
	testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","chartloadevent"})
	public void testOnChartLoad(Map<String, Property2> property2Map, String componentName) throws Exception{
		treeMapPage.go(componentName);
		testOnChartLoad(property2Map,treeMapPage);
	}




   /********** Data Series -> General***/
   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_TEXT,value = Properties.Title.TEXT),
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TEN,expectedValue = "12px"),
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_ALIGN,value = Align.LEFT,expectedValue = "left"),
		   @VBIProperty(name= DataSeries.TREE_COLOR_TYPE,value = "seriescolor"),
		   @VBIProperty(name= Properties.DataSeries.SERIES_COLOR,value = "#400080,#FF6657,#F3A730,#946B66,#B0AD53,#7AC1DE,#F1C337,#566C6C,#A1CC54,#543F1E,#B586DA",expectedValue = "#400080")
   }, dataSource = "Mul Mes 2 Dim")

   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSeriesColor(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
	   treeMapPage.go(componentName);
	   testDataSeriesColor(propertyMap,treeMapPage);
   }



}
