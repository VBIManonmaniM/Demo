package com.visualbi.automation;


import com.visualbi.automation.base.HighchartsTest;
import com.visualbi.automation.base.ZtlScriptTest;
import com.visualbi.automation.constants.*;
import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBIProperty2;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.pages.RadarChartPage;
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

@VBIComponentConfig(componentName="RADARCHART",type="com_visualbi_charts_RadarChart")
public class RadarChartTest extends HighchartsTest{
@Page
private RadarChartPage radarChartPage;

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
	radarChartPage.go(componentName);
	testTitle(propertyMap,radarChartPage);
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
   radarChartPage.go(componentName);
   testSubtitle(propertyMap,radarChartPage);
}


@VBITestConfig(properties ={
		@VBIProperty(name=GoogleFont.ENABLE,value=Common.ENABLE ),
		@VBIProperty(name=GoogleFont.FONTFAMILY,value =Font.Family.CARDO),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testGoogleFont(Map<String, Property> propertyMap, String componentName){
	radarChartPage.go(componentName);
	testGoogleFont(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= PlotOption.MARGINTOP,value= Count.TWENTY),
		@VBIProperty(name=PlotOption.MARGINLEFT,value = Count.TEN),
		@VBIProperty(name = PlotOption.CHARTSHADOW, value =Common.ENABLE ,expectedValue = Colors.BLACK_HEX),
		@VBIProperty(name=PlotOption.PLOTSHADOW,value = Common.ENABLE,expectedValue = Colors.BLACK_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotOptions(Map<String, Property> propertyMap, String componentName){
	radarChartPage.go(componentName);
	testPlotOptions(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = Background.COLOR,value= Colors.BLACK_HEX),
		@VBIProperty(name = Border.COLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = Border.WIDTH, value = Count.TEN),
		@VBIProperty(name = Border.RADIUS,value = Count.FIVE)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testBackgroundAndBorder(Map<String, Property> propertyMap, String componentName){
	radarChartPage.go(componentName);
	testBackgroundAndBorder(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name = PlotArea.BORDERWIDTH,value = Count.FIVE),
		@VBIProperty(name = PlotArea.BORDERCOLOR,value = Colors.GREY_HEX),
		@VBIProperty(name = PlotArea.BACKGROUNDCOLOR, value = Colors.RED_HEX),
})

@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
public void testPlotArea(Map<String, Property> propertyMap, String componentName){
	radarChartPage.go(componentName);
	testPlotArea(propertyMap,radarChartPage);
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
	radarChartPage.go(componentName);
	testNumberFormat(propertyMap,radarChartPage);
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
	radarChartPage.go(componentName);
	testDataLabelStyle(propertyMap,radarChartPage);
}
 	@VBITestConfig(properties ={
			@VBIProperty(name=YAxis.ENABLE,value = "X"),
			@VBIProperty(name=YAxis.MAXIMUM,value = "6"),
			@VBIProperty(name=YAxis.MINIMUM,value = "4"),
			@VBIProperty(name= YAxis.PREFIX,value = "}"),
			@VBIProperty(name= YAxis.SUFFIX,value = "_"),
			@VBIProperty(name=YAxis.FONTSIZE,value = "10",expectedValue = "10px"),
			@VBIProperty(name = YAxis.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name=YAxis.FONTWEIGHT,value = Font.Weight.BOLD),
			@VBIProperty(name= YAxis.FONTFAMILY,value= Font.Family.VERDANA),
			@VBIProperty(name=YAxis.ALIGN,value= Align.RIGHT,expectedValue = "end"),
			@VBIProperty(name=YAxis.ROTATION,value= "8"),
			@VBIProperty(name=YAxis.SHOW_FIST_LABEL,value= ""),
			@VBIProperty(name=YAxis.SHOW_LAST_LABEL,value= "")

	})

	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisLabelStyle(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisLabelStyle(propertyMap,radarChartPage);
	}

	@VBITestConfig(properties ={
			@VBIProperty(name=YAxisTitle.ENABLE,value = "X"),
			@VBIProperty(name= YAxisTitle.TEXT,value= Text.TEXT1),
			@VBIProperty(name=YAxisTitle.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
			@VBIProperty(name = YAxisTitle.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name=YAxisTitle.FONTWEIGHT,value = Font.Weight.BOLD),
			@VBIProperty(name= YAxisTitle.FONTFAMILY,value= Font.Family.VERDANA),
			@VBIProperty(name=YAxisTitle.ROTATION,value= "8"),
			@VBIProperty(name=YAxisTitle.ALIGN,value= "high",expectedValue = "end")
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisTitle(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisTitle(propertyMap,radarChartPage);
	}



	@VBITestConfig(properties ={
			@VBIProperty(name=YAxis.MAXIMUM,value = "6"),
			@VBIProperty(name=YAxis.MINIMUM,value = "3"),
			@VBIProperty(name=YAxisPlotBand.FROM,value = "4"),
			@VBIProperty(name=YAxisPlotBand.TO,value = "5"),
			@VBIProperty(name=YAxisPlotBand.BORDER_WIDTH,value = "7"),
			@VBIProperty(name = YAxisPlotBand.COLOR, value = Colors.GREY_HEX),
			@VBIProperty(name = YAxisPlotBand.BORDER_COLOR, value = Colors.RED_HEX),
			@VBIProperty(name=YAxisPlotBand.ENABLE,value = "X"),

	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisPlotBand(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisPlotBand(propertyMap,radarChartPage);
	}

	@VBITestConfig(properties ={

			@VBIProperty(name=YAxisPlotBand.FROM,value = "4"),
			@VBIProperty(name=YAxis.MAXIMUM,value = "5"),
			@VBIProperty(name=YAxis.MINIMUM,value = "3"),
			@VBIProperty(name=YAxisPlotBandLabel.ENABLE,value = "X"),
			@VBIProperty(name= YAxisPlotBandLabel.TEXT,value= Text.TEXT1),
			@VBIProperty(name= YAxisPlotBandLabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
			@VBIProperty(name = YAxisPlotBandLabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name= YAxisPlotBandLabel.FONTWEIGHT,value = Font.Weight.BOLD),
			@VBIProperty(name= YAxisPlotBandLabel.FONTFAMILY,value= Font.Family.VERDANA),
			@VBIProperty(name= YAxisPlotBandLabel.ROTATION,value= "8")
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisPlotBandLabel(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisPlotBandLabel(propertyMap,radarChartPage);
	}


	@VBITestConfig(properties ={
			@VBIProperty(name=YAxisPlotLine.VALUE,value = "4"),
			@VBIProperty(name=YAxisPlotLine.ENABLE,value = Common.ENABLE),
			@VBIProperty(name=YAxisPlotLine.WIDTH,value = "7"),
			@VBIProperty(name = YAxisPlotLine.COLOR, value = Colors.GREY_HEX),

	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisPlotLine(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisPlotLine(propertyMap,radarChartPage);
	}
	@VBITestConfig(properties ={
			@VBIProperty(name=YAxisPlotLineLabel.ENABLE,value = "X"),
			@VBIProperty(name= YAxisPlotLineLabel.TEXT,value= Text.TEXT1),
			@VBIProperty(name=YAxisPlotLine.VALUE,value = "4"),
			@VBIProperty(name=YAxisPlotLine.ENABLE,value = Common.ENABLE),
			@VBIProperty(name=YAxisPlotLineLabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
			@VBIProperty(name = YAxisPlotLineLabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name=YAxisPlotLineLabel.FONTWEIGHT,value = Font.Weight.BOLD),
			@VBIProperty(name= YAxisPlotLineLabel.FONTFAMILY,value= Font.Family.VERDANA),
			@VBIProperty(name=YAxisPlotLineLabel.ROTATION,value= "8")
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisPlotLineLabel(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		testYAxisPlotLineLabel(propertyMap,radarChartPage);
	}
	@VBITestConfig(properties ={
		   @VBIProperty(name=YAxis.CEILING,value = "5"),
		   @VBIProperty(name=YAxis.FLOOR,value = "4"),
		   @VBIProperty(name= YAxis.REVERSED,value= Common.ENABLE),
		   @VBIProperty(name= YAxis.ALLOW_DECIMALS,value= Common.DISABLE)
	})


	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
	public void testYAxisCeilingAndFlooring(Map<String, Property> propertyMap, String componentName){
		radarChartPage.go(componentName);
	   testYAxisCeilingAndFlooring(propertyMap,radarChartPage);
	}
 	@VBITestConfig(properties ={
		   @VBIProperty(name=XAxis.CEILING,value = "5"),
		   @VBIProperty(name=XAxis.FLOOR,value = "4"),
		   @VBIProperty(name= XAxis.REVERSED,value= Common.ENABLE)
	})

	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	public void testXAxisCeilingAndFlooring(Map<String, Property> propertyMap, String componentName){
	   radarChartPage.go(componentName);
	   testXAxisCeilingAndFlooring(propertyMap,radarChartPage);
	}

	@VBITestConfig(properties ={
			@VBIProperty(name=XAxisPlotBand.FROM,value = "4"),
			@VBIProperty(name=XAxisPlotBand.TO,value = "5"),
			@VBIProperty(name=XAxisPlotBand.BORDER_WIDTH,value = "7"),
			@VBIProperty(name = XAxisPlotBand.COLOR, value = Colors.GREY_HEX),
			@VBIProperty(name = XAxisPlotBand.BORDER_COLOR, value = Colors.RED_HEX),
			@VBIProperty(name=XAxisPlotBand.ENABLE,value = "X"),

	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	public void testXAxisPlotBand(Map<String, Property> propertyMap, String componentName){
		radarChartPage.go(componentName);
		testXAxisPlotBand(propertyMap,radarChartPage);
	}
	@VBITestConfig(properties ={

			@VBIProperty(name=XAxisPlotBand.FROM,value = "4"),
			@VBIProperty(name=XAxisPlotBandLabel.ENABLE,value = "X"),
			@VBIProperty(name= XAxisPlotBandLabel.TEXT,value= Text.TEXT1),
			@VBIProperty(name= XAxisPlotBandLabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
			@VBIProperty(name = XAxisPlotBandLabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			@VBIProperty(name= XAxisPlotBandLabel.FONTWEIGHT,value = Font.Weight.BOLD),
			@VBIProperty(name= XAxisPlotBandLabel.FONTFAMILY,value= Font.Family.VERDANA),
			@VBIProperty(name= XAxisPlotBandLabel.ROTATION,value= "8")
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	public void testXAxisPlotBandLabel(Map<String, Property> propertyMap, String componentName){
		radarChartPage.go(componentName);
		testXAxisPlotBandLabel(propertyMap,radarChartPage);
	}
		@VBITestConfig(properties ={
		 @VBIProperty(name=XAxisPlotLine.VALUE,value = "4"),
		 @VBIProperty(name=XAxisPlotLine.ENABLE,value = Common.ENABLE),
		 @VBIProperty(name=XAxisPlotLine.WIDTH,value = "7"),
		 @VBIProperty(name = XAxisPlotLine.COLOR, value = Colors.GREY_HEX),

	 })
	 @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	 public void testXAxisPlotLine(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		 testXAxisPlotLine(propertyMap,radarChartPage);
	 }
   @VBITestConfig(properties ={
		  @VBIProperty(name=XAxisPlotLineLabel.ENABLE,value = "X"),
		  @VBIProperty(name= XAxisPlotLineLabel.TEXT,value= Text.TEXT1),
		  @VBIProperty(name=XAxisPlotLineLabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		  @VBIProperty(name = XAxisPlotLineLabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		  @VBIProperty(name=XAxisPlotLineLabel.FONTWEIGHT,value = Font.Weight.BOLD),
		  @VBIProperty(name= XAxisPlotLineLabel.FONTFAMILY,value= Font.Family.VERDANA),
		  @VBIProperty(name=XAxisPlotLineLabel.ROTATION,value= "8"),

		  })
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	public void testXAxisPlotLineLabel(Map<String, Property> propertyMap, String componentName){
	  radarChartPage.go(componentName);
	  testXAxisPlotLineLabel(propertyMap,radarChartPage);
	}


	 @VBITestConfig(properties ={
			 @VBIProperty(name=XAxis.LINE_COLOR,value = Colors.RED_HEX),
			 @VBIProperty(name=XAxis.LINE_WIDTH,value = "4"),
			 @VBIProperty(name= XAxis.ALTERNATIVE_GRID_COLOR,value=  Colors.GREY_HEX)
	 })


	 @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	 public void testXAxisStyle(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		 testXAxisStyle(propertyMap,radarChartPage);
	 }

	 @VBITestConfig(properties ={
		 @VBIProperty(name=XAxis.ENABLE,value = "X"),
		 @VBIProperty(name=XAxis.MAXIMUM,value = "6"),
		 @VBIProperty(name=XAxis.MINIMUM,value = "4"),
		 @VBIProperty(name= XAxis.PREFIX,value = "}"),
		 @VBIProperty(name= XAxis.SUFFIX,value = "_"),
		 @VBIProperty(name=XAxis.FONTSIZE,value = "10",expectedValue = "10px"),
		 @VBIProperty(name = XAxis.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		 @VBIProperty(name=XAxis.FONTWEIGHT,value = Font.Weight.BOLD),
		 @VBIProperty(name= XAxis.FONTFAMILY,value= Font.Family.VERDANA),
		 @VBIProperty(name=XAxis.ALIGN,value= Align.RIGHT,expectedValue = "end"),
		 @VBIProperty(name=XAxis.ROTATION,value= "8"),
		 @VBIProperty(name=XAxis.SHOW_FIST_LABEL,value= ""),
		 @VBIProperty(name=XAxis.SHOW_LAST_LABEL,value= "")

	 })

	 @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	 public void testXAxisLabelStyle(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		 testXAxisLabelStyle(propertyMap,radarChartPage);
	 }



	 @VBITestConfig(properties ={
			 @VBIProperty(name=XAxisTitle.ENABLE,value = "X"),
			 @VBIProperty(name= XAxisTitle.TEXT,value= Text.TEXT1),
			 @VBIProperty(name=XAxisTitle.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
			 @VBIProperty(name = XAxisTitle.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
			 @VBIProperty(name=XAxisTitle.FONTWEIGHT,value = Font.Weight.BOLD),
			 @VBIProperty(name= XAxisTitle.FONTFAMILY,value= Font.Family.VERDANA),
			 @VBIProperty(name=XAxisTitle.ROTATION,value= "8"),
			 @VBIProperty(name=XAxisTitle.ALIGN,value= "high",expectedValue = "end")
	 })
	 @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
	 public void testXAxisTitle(Map<String, Property> propertyMap, String componentName){
		 radarChartPage.go(componentName);
		 testXAxisTitle(propertyMap,radarChartPage);
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
	radarChartPage.go(componentName);
	testCredits(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE_WIDTH,value = Count.THREE,expectedValue =Count.THREE),
	@VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
	radarChartPage.go(componentName);
	testExportSymbolStyles(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
		@VBIProperty(name= Export.EXPORT_BACKGROUND_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_RADIUS,value =Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Export.EXPORT_BACKGROUND_HOVER_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportBackground(Map<String, Property> propertyMap, String componentName) throws Exception{
	radarChartPage.go(componentName);

	testExportBackGround(propertyMap,radarChartPage);
}

@VBITestConfig(properties ={
	@VBIProperty(name= Export.EXPORT_ENABLED,value = ""),
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
public void testExportEnabled(Map<String, Property> propertyMap, String componentName) throws Exception{
	radarChartPage.go(componentName);

	testExportIconEnabled(propertyMap,radarChartPage);
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
	radarChartPage.go(componentName);

	testExportDropDownStyles(propertyMap,radarChartPage);
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
		radarChartPage.go(componentName);
		testToolTipStyle(propertyMap,radarChartPage);
	}

	@VBITestConfig(properties ={
		@VBIProperty(name= Tooltip.TOOLTIP_DECIMAL_VALUE,value = Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Tooltip.TOOLTIP_VALUE_PREFIX,value = Common.OPENBRACE),
		@VBIProperty(name= Tooltip.TOOLTIP_VALUE_SUFFIX,value = Common.AMP),
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"tooltip"})
	public void testToolTipNumberFormat(Map<String, Property> propertyMap, String componentName) throws Exception{
		radarChartPage.go(componentName);
		testToolTipNumberFormat(propertyMap,radarChartPage);
	}
	@VBITestConfig(properties ={
		@VBIProperty(name= Legend.LEGEND_BACKGROUNDCOLOR,value = Colors.GREY_HEX,expectedValue =Colors.GREY_HEX ),
		@VBIProperty(name= Legend.LEGEND_BORDER_WIDTH,value = Count.SIX,expectedValue = Count.SIX),
		@VBIProperty(name= Legend.LEGEND_BORDER_RADIUS,value = Count.THREE,expectedValue = Count.THREE),
		@VBIProperty(name= Legend.LEGEND_BORDER_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
	public void testLegendStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
		radarChartPage.go(componentName);
		testLegendStyle(propertyMap,radarChartPage);
	}
	@VBITestConfig(properties ={
		@VBIProperty(name= Legend.LEGEND_SYMBOL_WIDTH,value = Count.EIGHT,expectedValue = Count.EIGHT),
		@VBIProperty(name= Legend.LEGEND_SYMBOL_HEIGHT,value = Count.TEN,expectedValue = Count.TEN),
		@VBIProperty(name= Legend.LEGEND_SYMBOL_RADIUS,value = Count.THIRTY_ONE,expectedValue = Count.THIRTY_ONE),
		@VBIProperty(name= Legend.LEGEND_SYMBOL_PADDING,value = Count.THIRTY_ONE,expectedValue = Count.THIRTY_ONE),
	})
	@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
	public void testLegendSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
		radarChartPage.go(componentName);
		testLegendSymbolStyle(propertyMap,radarChartPage,"8","31");
	}
@VBITestConfig(properties ={
	@VBIProperty(name= Legend.LEGEND_TITLE,value= "HelloWorld1",expectedValue = "HelloWorld1"),
	@VBIProperty(name= Legend.LEGEND_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
	@VBIProperty(name= Legend.LEGEND_FONT_WEIGHT,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
	@VBIProperty(name= Legend.LEGEND_FONT_SIZE,value = Count.TWENTY,expectedValue = Count.TWENTY+"px"),
	@VBIProperty(name= Legend.LEGEND_FONT_FAMILY,value = Font.Family.VERDANA,expectedValue =Font.Family.VERDANA)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
public void testLegendTitle(Map<String, Property> propertyMap, String componentName) throws Exception{
	radarChartPage.go(componentName);
	testLegendTitle(propertyMap,radarChartPage);
}


@VBITestConfig(properties ={
		@VBIProperty(name= Legend.LEGEND_ITEM_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
		@VBIProperty(name= Legend.LEGEND_ITEM_FONT_WEIGHT,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
		@VBIProperty(name= Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TWENTY,expectedValue = "20px"),
		@VBIProperty(name= Legend.LEGEND_ITEM_FONT_FAMILY,value = Font.Family.VERDANA,expectedValue =Font.Family.VERDANA)
})
@Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
public void testLegendItemText(Map<String, Property> propertyMap, String componentName) throws Exception{
	radarChartPage.go(componentName);
	testLegendFontStyle(propertyMap,radarChartPage);
}
@VBITestConfig(properties ={},testType = "ztlGetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlGetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlGetterScriptTest(JSONObject getterJSON,JSONObject defaultValueJSON,String componentName) throws Exception{
	 radarChartPage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testGetterScript(radarChartPage,getterJSON,defaultValueJSON);
}

@VBITestConfig(properties ={},testType = "ztlSetterScriptTest")
@Test(alwaysRun=true,dataProvider = "vbiZtlSetterScriptAutomationDataProvider",groups = {"ztlscript"})
public void ztlSetterScriptTest(JSONObject setterJSON,JSONObject defaultValueJSON,JSONObject getterReverseJSON,String componentName) throws Exception{
	radarChartPage.go(componentName);
	ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
	ztlScriptTest.testSetterScript(radarChartPage,setterJSON,defaultValueJSON,getterReverseJSON);
}
	@VBITestConfig(properties ={
	   @VBIProperty(name=Event.ON_CLICK_EVENT,value ="select" )	},
	   properties2 = {@VBIProperty2(name = Event.ON_SELECT,value = "RESULT_TEXT.setText(\"ON_SELECT_TEST\");",expectedValue = "ON_SELECT_TEST")},
	   testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","onclickevent"})
	public void testOnSelect(Map<String, Property2> property2Map, String componentName) throws Exception{
	   radarChartPage.go(componentName);
	   testOnSelect(property2Map,radarChartPage);
	}
	@VBITestConfig(properties2 ={
	@VBIProperty2(name=Event.ON_AXIS_CLICK,value = "RESULT_TEXT.setText(\"ON_AXIS_CLICK_TEST\");",expectedValue ="ON_AXIS_CLICK_TEST" ),
	},testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","axisclickevent"})
	public void testOnAxisClick(Map<String, Property2> property2Map, String componentName) throws Exception{
		radarChartPage.go(componentName);
		testOnAxisClick(property2Map,radarChartPage);
	}
	@VBITestConfig(properties2 = {
	@VBIProperty2(name = Event.ON_CHART_LOAD,value = "RESULT_TEXT.setText(\"ON_CHART_LOAD_TEST\");",expectedValue = "ON_CHART_LOAD_TEST")},
	testType = "chartEventTest")
	@Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","chartloadevent"})
	public void testOnChartLoad(Map<String, Property2> property2Map, String componentName) throws Exception{
		radarChartPage.go(componentName);
		testOnChartLoad(property2Map,radarChartPage);
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
	   radarChartPage.go(componentName);
	   testDataSelection(propertyMap,radarChartPage);
   }
    /********** Data Series -> Data Series Labels***/

    @VBITestConfig(properties ={
       @VBIProperty(name= Properties.Datalabel.ENABLE,value = Common.ENABLE),
       @VBIProperty(name= Properties.Datalabel.TEXT,value = "{\"1ROWCOUNT0000000000000009\":\""+Text.TEXT2+"\",\"ZCONSBCF00000000000000008\":\"\",\"ZCONSBCM00000000000000008\":\"\",\"ZCONSMT000000000000000007\":\"\",\"ZCONSMTO00000000000000008\":\"\",\"ZCONSTBD00000000000000008\":\"\",\"ZCONSTW000000000000000007\":\"\"}",expectedValue = Text.TEXT2),
       @VBIProperty(name= Properties.Datalabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
       @VBIProperty(name = Properties.Datalabel.COLOR, value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),

    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testDataSeriesLabels(Map<String, Property> propertyMap, String componentName){
    radarChartPage.go(componentName);
	radarChartPage.testDataSeriesLabels(propertyMap,radarChartPage);
    }




   /********** Data Series -> General***/
   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_TEXT,value = Properties.Title.TEXT),
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TEN,expectedValue = "12px"),
		   @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_ALIGN,value = Align.LEFT,expectedValue = "left"),
		   @VBIProperty(name= Properties.DataSeries.SERIES_COLOR,value = "#400080,#FF6657,#F3A730,#946B66,#B0AD53,#7AC1DE,#F1C337",expectedValue = "#400080")
   })

   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSeriesColor(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
	   radarChartPage.go(componentName);
	   testDataSeriesColor(propertyMap,radarChartPage);
   }

   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.ENABLE,value = "X"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_LINE,value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_MAXLINE, value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.COLOR,value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.SHOWTOTAL,value= "X",expectedValue = "Total Result")
   })

   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSeriesShowTotal(Map<String, Property> propertyMap, String componentName){
	   radarChartPage.go(componentName);
	   testDataSeriesShowTotal(propertyMap,radarChartPage);

   }

   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.ENABLE,value = "X"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_LINE,value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_MAXLINE, value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.COLOR,value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.SHOWTOTAL_DB,value= "X",expectedValue = "Overall Result")
   })

   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSeriesShowTotalDatabase(Map<String, Property> propertyMap, String componentName){
	   radarChartPage.go(componentName);
	   testDataSeriesShowTotalDatabase(propertyMap,radarChartPage);

   }

   @VBITestConfig(properties ={
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.ENABLE,value = "X"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_LINE,value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.HLABEL_MAXLINE, value = Count.ZERO),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
		   @VBIProperty(name= Properties.DataSeriesHierarcyLables.COLOR, value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX)

   })
   @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
   public void testDataSeriesHierarchyLabel(Map<String, Property> propertyMap, String componentName){
	   radarChartPage.go(componentName);
	   testDataSeriesHierarchyLabel(propertyMap,radarChartPage);
   }
}
