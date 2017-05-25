package com.visualbi.automation;

import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.base.HighchartsTest;
import com.visualbi.automation.constants.*;
import com.visualbi.automation.pages.AreaChartPage;
import com.visualbi.automation.pages.LineChartPage;
import com.visualbi.automation.xmlutils.models.Property;
import org.fluentlenium.core.annotation.Page;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by YogendraBG on 4/12/2017.
 */
@VBIComponentConfig(componentName="POLARCHART",type="com_visualbi_charts_PolarChart")
public class DataSeriesTest extends HighchartsTest {
    @Page
    private AreaChartPage lineChartPage;

    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.Title.TEXT,value= Text.TEXT1),
            @VBIProperty(name= Properties.Title.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
            @VBIProperty(name = Properties.Title.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
            @VBIProperty(name= Properties.Title.FONTWEIGHT,value = Font.Weight.BOLD),
            @VBIProperty(name= Properties.Title.FONTFAMILY,value= Font.Family.VERDANA),
            @VBIProperty(name= Properties.Title.ALIGN,value= Align.RIGHT,expectedValue = "end")
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"title"})
    public void testTitle(Map<String, Property> propertyMap, String componentName){
        lineChartPage.go(componentName);
        testTitle(propertyMap,lineChartPage);
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
        lineChartPage.go(componentName);
        testDataSelection(propertyMap,lineChartPage);
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
        lineChartPage.go(componentName);
        testDataSeriesLabels(propertyMap,lineChartPage);
    }


    /********** Data Series -> General***/
    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_TEXT,value = Properties.Title.TEXT),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TEN,expectedValue = "12px"),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_ALIGN,value = Align.LEFT,expectedValue = "left"),
            @VBIProperty(name= Properties.DataSeries.SERIES_COLOR,value = "#400080,#FF6657,#F3A730,#946B66,#B0AD53,#7AC1DE,#F1C337",expectedValue = "#400080,#FF6657,#F3A730,#946B66,#B0AD53,#7AC1DE,#F1C337")
    })

    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testDataSeriesColor(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
        lineChartPage.go(componentName);
        testDataSeriesColor(propertyMap,lineChartPage);
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
        lineChartPage.go(componentName);
        testDataSeriesShowTotal(propertyMap,lineChartPage);

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
        lineChartPage.go(componentName);
        testDataSeriesShowTotalDatabase(propertyMap,lineChartPage);

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
        lineChartPage.go(componentName);
        testDataSeriesHierarchyLabel(propertyMap,lineChartPage);
    }


    /********** Data Series -> Marker***/

    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_TEXT,value = Properties.Title.TEXT),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TEN,expectedValue = "12px"),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_ALIGN,value = Align.LEFT,expectedValue = "left"),
            @VBIProperty(name= Properties.DataSeries.SERIES_COLOR,value = "#FF6657",expectedValue ="#FF6657"),
            @VBIProperty(name= Properties.DataSeriesMarkers.MARKER_ENABLE,value = "X"),
            @VBIProperty(name= Properties.DataSeriesMarkers.ADD_MARKER,value ="true;4;circle;#FF6657",expectedValue = "#FF6657"),
            @VBIProperty(name= Properties.DataSeriesMarkers.MARKER_COLOR,value ="#FF6657",expectedValue = "#FF6657")
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testMarkerCustomization(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
        lineChartPage.go(componentName);
        testMarkerCustomization(propertyMap,lineChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_TEXT,value = Properties.Title.TEXT),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TEN,expectedValue = "12px"),
            @VBIProperty(name= Properties.Legend.LEGEND_ITEM_FONT_ALIGN,value = Align.LEFT,expectedValue = "left"),
            @VBIProperty(name= Properties.DataSeries.SERIES_COLOR,value = "#FF6657",expectedValue ="#FF6657"),
            @VBIProperty(name= Properties.DataSeriesMarkers.MARKER_ENABLE,value = "X"),
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testDefaultMarkerColor(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
        lineChartPage.go(componentName);
        testDefaultMarkerColor(propertyMap,lineChartPage);
    }

    /********** Data Series -> TrendLine***/
    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.DataSeriesTrendLine.TRENDLINE_ENABLE,value = "X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_ENABLE,value ="X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.IDENTICAL_COLOR,value =""),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_TEXT,value="",expectedValue = "y = 133.25x + 973.75-Number of Records"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_FONTSIZE,value = Count.TEN,expectedValue = "12px"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_ALIGN,value = Align.LEFT,expectedValue = "start"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_COLOR,value=Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
            @VBIProperty(name= Properties.DataSeriesTrendLine.TRENDLINE_COLOR,value=Colors.GREEN_HEX,expectedValue = Colors.GREEN_HEX)
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testTrendLineEquation(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
        lineChartPage.go(componentName);
        testTrendLineEquation(propertyMap,lineChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.DataSeriesTrendLine.TRENDLINE_ENABLE,value = "X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_ENABLE,value ="X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.IDENTICAL_COLOR,value =""),
            @VBIProperty(name= Properties.Tooltip.TOOLTIP_BORDER_COLOR,value = "#B586DA",expectedValue = "#B586DA"),
            @VBIProperty(name= Properties.Tooltip.TOOLTIP_BORDER_RADIUS,value = Count.TEN,expectedValue = Count.TEN),
            @VBIProperty(name= Properties.Tooltip.TOOLTIP_BORDER_WIDTH,value = Count.ONE,expectedValue = Count.ONE),
            @VBIProperty(name= Properties.Tooltip.TOOLTIP_TEXT_COLOR,value = Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
            @VBIProperty(name= Properties.Tooltip.TOOLTIP_FONT_SIZE,value = Count.TWELVE,expectedValue = Count.TWELVE)
          //  @VBIProperty(name= Properties.Tooltip.TOOLTIP_TEXT,value ="",expectedValue = "y = 133.25x + 973.75-Number of Records")

    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"tooltip"})
    public void testToolTipTrendLineStyle(Map<String, Property> propertyMap, String componentName) throws Exception{
        lineChartPage.go(componentName);
        testToolTipTrendLineStyle(propertyMap,lineChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name= Properties.DataSeriesTrendLine.TRENDLINE_ENABLE,value = "X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_ENABLE,value ="X"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.IDENTICAL_COLOR,value =""),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_TEXT,value="",expectedValue = "y = 133.25x + 973.75-Number of Records"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_FONTSIZE,value = Count.TEN,expectedValue = "12px"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_ALIGN,value = Align.LEFT,expectedValue = "start"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_COLOR,value=Colors.BLACK_HEX,expectedValue = Colors.BLACK_HEX),
            @VBIProperty(name= Properties.DataSeriesTrendLine.TRENDLINE_PICKER_COLOR,value="[{\"id\":\"0\",\"color\":\"#B586DA\"}]",expectedValue ="#B586DA"),
            @VBIProperty(name= Properties.DataSeriesTrendLine.EQUATION_SYMBOL_COLOR,value="#B586DA",expectedValue = "#B586DA")
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"dataseries"})
    public void testTrendLine(Map<String, Property> propertyMap, String componentName) throws InterruptedException{
        lineChartPage.go(componentName);
        testTrendLine(propertyMap,lineChartPage);
    }









}
