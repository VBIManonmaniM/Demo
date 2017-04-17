package com.visualbi.automation;


import com.visualbi.automation.base.HighchartsTest;
import com.visualbi.automation.base.ZtlScriptTest;
import com.visualbi.automation.constants.*;
import com.visualbi.automation.annotaions.VBIComponentConfig;
import com.visualbi.automation.annotaions.VBIProperty;
import com.visualbi.automation.annotaions.VBIProperty2;
import com.visualbi.automation.annotaions.VBITestConfig;
import com.visualbi.automation.pages.MultipleAxesChartPage;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import org.fluentlenium.core.annotation.Page;
import static com.visualbi.automation.constants.Properties.*;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import java.util.Map;

/**
 * Created by Code Generation Tool on Mon Apr 10 22:29:32 CDT 2017.
 */

@VBIComponentConfig(componentName="MULTIPLEAXESCHART",type="com_visualbi_charts_MultipleAxesChart")
public class MultipleAxesChartTest extends HighchartsTest{
    @Page
    private MultipleAxesChartPage multipleAxesChartPage;

    @VBITestConfig(properties ={
            @VBIProperty(name= Title.TEXT,value= Text.TEXT1),
            @VBIProperty(name=Title.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
            @VBIProperty(name = Title.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
            @VBIProperty(name=Title.FONTWEIGHT,value = Font.Weight.BOLD),
            @VBIProperty(name= Title.FONTFAMILY,value= Font.Family.VERDANA),
            @VBIProperty(name=Title.ALIGN,value= Align.RIGHT,expectedValue = "end")
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"title"})
    public void testTitle(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testTitle(propertyMap,multipleAxesChartPage);
    }

     @VBITestConfig(properties ={
           @VBIProperty(name= SubTitle.TEXT,value= Text.TEXT1),
           @VBIProperty(name=SubTitle.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
           @VBIProperty(name = SubTitle.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
           @VBIProperty(name=SubTitle.FONTWEIGHT,value = Font.Weight.BOLD),
           @VBIProperty(name= SubTitle.FONTFAMILY,value= Font.Family.VERDANA),
           @VBIProperty(name=SubTitle.ALIGN,value= Align.RIGHT,expectedValue = "end")
     })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"subtitle"})
    public void testSubtitle(Map<String, Property> propertyMap, String componentName){
       multipleAxesChartPage.go(componentName);
       testSubtitle(propertyMap,multipleAxesChartPage);
    }


    @VBITestConfig(properties ={
            @VBIProperty(name= GoogleFont.ENABLE,value=Common.ENABLE ),
            @VBIProperty(name=GoogleFont.FONTFAMILY,value =Font.Family.CARDO),
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
    public void testGoogleFont(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testGoogleFont(propertyMap,multipleAxesChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name= PlotOption.MARGINTOP,value= Count.TWENTY),
            @VBIProperty(name=PlotOption.MARGINLEFT,value = Count.TEN),
            @VBIProperty(name = PlotOption.CHARTSHADOW, value =Common.ENABLE ,expectedValue = Colors.BLACK_HEX),
            @VBIProperty(name=PlotOption.PLOTSHADOW,value = Common.ENABLE,expectedValue = Colors.BLACK_HEX),
    })

    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
    public void testPlotOptions(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testPlotOptions(propertyMap,multipleAxesChartPage);
    }
    @VBITestConfig(properties ={
            @VBIProperty(name= Background.COLOR,value= Colors.BLACK_HEX),
            @VBIProperty(name=Border.COLOR,value = Colors.GREY_HEX),
            @VBIProperty(name = Border.WIDTH, value =Count.TEN),
            @VBIProperty(name=Border.RADIUS,value = Count.FIVE)
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
    public void testBackgroundAndBorder(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testBackgroundAndBorder(propertyMap,multipleAxesChartPage);
    }
    @VBITestConfig(properties ={
            @VBIProperty(name= PlotArea.BORDERWIDTH,value= Count.FIVE),
            @VBIProperty(name=PlotArea.BORDERCOLOR,value = Colors.GREY_HEX),
            @VBIProperty(name = PlotArea.BACKGROUNDCOLOR, value =Colors.RED_HEX),
    })

    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
    public void testPlotArea(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testPlotArea(propertyMap,multipleAxesChartPage);
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
        multipleAxesChartPage.go(componentName);
        testNumberFormat(propertyMap,multipleAxesChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name=Datalabel.ENABLE,value = Common.ENABLE),
            @VBIProperty(name=Datalabel.FONTSIZE,value = Count.TEN,expectedValue = Count.TEN+"px"),
            @VBIProperty(name = Datalabel.COLOR, value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
            @VBIProperty(name=Datalabel.FONTWEIGHT,value = Font.Weight.BOLD),
            @VBIProperty(name= Datalabel.FONTFAMILY,value= Font.Family.VERDANA)


    })

    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"style"})
    public void testDataLabelStyle(Map<String, Property> propertyMap, String componentName){
        multipleAxesChartPage.go(componentName);
        testDataLabelStyle(propertyMap,multipleAxesChartPage);
    }
                                                                @VBITestConfig(properties ={
                               @VBIProperty(name=YAxis.CEILING,value = "5"),
                               @VBIProperty(name=YAxis.FLOOR,value = "4"),
                               @VBIProperty(name= YAxis.REVERSED,value= Common.ENABLE),
                               @VBIProperty(name= YAxis.ALLOW_DECIMALS,value= Common.DISABLE)
                       })


                       @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"yaxis"})
                       public void testYAxisCeilingAndFlooring(Map<String, Property> propertyMap, String componentName){
                            multipleAxesChartPage.go(componentName);
                           testYAxisCeilingAndFlooring(propertyMap,multipleAxesChartPage);
                       }
                         @VBITestConfig(properties ={

                      @VBIProperty(name=XAxisGridLine.WIDTH,value = "7"),
                      @VBIProperty(name = XAxisGridLine.COLOR, value = Colors.GREY_HEX),
                      @VBIProperty(name=XAxisMajorTick.WIDTH,value = "5"),
                      @VBIProperty(name = XAxisMajorTick.COLOR, value = Colors.RED_HEX),


              })
              @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
              public void testXAxisGridAndTick(Map<String, Property> propertyMap, String componentName){
                  multipleAxesChartPage.go(componentName);
                  testXAxisGridAndTick(propertyMap,multipleAxesChartPage);
              }
                   @VBITestConfig(properties ={
                       @VBIProperty(name=XAxis.MAXIMUM,value = "5"),
                       @VBIProperty(name=XAxis.MINIMUM,value = "4"),
                       @VBIProperty(name= XAxis.ON_TOP,value= Common.ENABLE)
               })

               @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
               public void testXAxisMinimumAndMaximum(Map<String, Property> propertyMap, String componentName){
                   multipleAxesChartPage.go(componentName);
                   testXAxisMinimumAndMaximum(propertyMap,multipleAxesChartPage);
               }
                      @VBITestConfig(properties ={
                       @VBIProperty(name=XAxis.CEILING,value = "5"),
                       @VBIProperty(name=XAxis.FLOOR,value = "4"),
                       @VBIProperty(name= XAxis.REVERSED,value= Common.ENABLE)
               })

               @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
               public void testXAxisCeilingAndFlooring(Map<String, Property> propertyMap, String componentName){
                   multipleAxesChartPage.go(componentName);
                   testXAxisCeilingAndFlooring(propertyMap,multipleAxesChartPage);
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
                    multipleAxesChartPage.go(componentName);
                    testXAxisPlotBand(propertyMap,multipleAxesChartPage);
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
                    multipleAxesChartPage.go(componentName);
                    testXAxisPlotBandLabel(propertyMap,multipleAxesChartPage);
                }
                        @VBITestConfig(properties ={
                         @VBIProperty(name=XAxisPlotLine.VALUE,value = "4"),
                         @VBIProperty(name=XAxisPlotLine.ENABLE,value = Common.ENABLE),
                         @VBIProperty(name=XAxisPlotLine.WIDTH,value = "7"),
                         @VBIProperty(name = XAxisPlotLine.COLOR, value = Colors.GREY_HEX),

                 })
                 @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
                 public void testXAxisPlotLine(Map<String, Property> propertyMap, String componentName){
                     multipleAxesChartPage.go(componentName);
                     testXAxisPlotLine(propertyMap,multipleAxesChartPage);
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
                              multipleAxesChartPage.go(componentName);
                              testXAxisPlotLineLabel(propertyMap,multipleAxesChartPage);
                          }

                     
         @VBITestConfig(properties ={
                 @VBIProperty(name=XAxis.LINE_COLOR,value = Colors.RED_HEX),
                 @VBIProperty(name=XAxis.LINE_WIDTH,value = "4"),
                 @VBIProperty(name= XAxis.ALTERNATIVE_GRID_COLOR,value=  Colors.GREY_HEX)
         })


         @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"xaxis"})
         public void testXAxisStyle(Map<String, Property> propertyMap, String componentName){
             multipleAxesChartPage.go(componentName);
             testXAxisStyle(propertyMap,multipleAxesChartPage);
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
             multipleAxesChartPage.go(componentName);
             testXAxisLabelStyle(propertyMap,multipleAxesChartPage);
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
             multipleAxesChartPage.go(componentName);
             testXAxisTitle(propertyMap,multipleAxesChartPage);
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
        multipleAxesChartPage.go(componentName);
        testCredits(propertyMap,multipleAxesChartPage);
    }





    @VBITestConfig(properties ={
        @VBIProperty(name= Export.EXPORT_ICON_SYMBOL_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
        @VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE_WIDTH,value = Count.THREE,expectedValue =Count.THREE),
        @VBIProperty(name= Export.EXPORT_ICON_SYMBOL_STROKE,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
    public void testExportSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
        multipleAxesChartPage.go(componentName);
        testExportSymbolStyles(propertyMap,multipleAxesChartPage);
    }

    @VBITestConfig(properties ={
            @VBIProperty(name= Export.EXPORT_BACKGROUND_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
            @VBIProperty(name= Export.EXPORT_BACKGROUND_RADIUS,value =Count.THREE,expectedValue = Count.THREE),
            @VBIProperty(name= Export.EXPORT_BACKGROUND_HOVER_FILL,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX)
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
    public void testExportBackground(Map<String, Property> propertyMap, String componentName) throws Exception{
        multipleAxesChartPage.go(componentName);

        testExportBackGround(propertyMap,multipleAxesChartPage);
    }

    @VBITestConfig(properties ={
        @VBIProperty(name= Export.EXPORT_ENABLED,value = ""),
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"export"})
    public void testExportEnabled(Map<String, Property> propertyMap, String componentName) throws Exception{
        multipleAxesChartPage.go(componentName);

        testExportIconEnabled(propertyMap,multipleAxesChartPage);
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
        multipleAxesChartPage.go(componentName);

        testExportDropDownStyles(propertyMap,multipleAxesChartPage);
    }

               @VBITestConfig(properties ={
            @VBIProperty(name= Legend.LEGEND_BACKGROUNDCOLOR,value = Colors.GREY_HEX,expectedValue =Colors.GREY_HEX ),
            @VBIProperty(name= Legend.LEGEND_BORDER_WIDTH,value = Count.SIX,expectedValue = Count.SIX),
            @VBIProperty(name= Legend.LEGEND_BORDER_RADIUS,value = Count.THREE,expectedValue = Count.THREE),
            @VBIProperty(name= Legend.LEGEND_BORDER_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
        })
        @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
        public void testLegendStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
            multipleAxesChartPage.go(componentName);
            testLegendStyle(propertyMap,multipleAxesChartPage);
        }
           @VBITestConfig(properties ={
        @VBIProperty(name= Legend.LEGEND_SYMBOL_WIDTH,value = Count.EIGHT,expectedValue = Count.EIGHT),
        @VBIProperty(name= Legend.LEGEND_SYMBOL_HEIGHT,value = Count.TEN,expectedValue = Count.TEN),
        @VBIProperty(name= Legend.LEGEND_SYMBOL_RADIUS,value = Count.THIRTY_ONE,expectedValue = Count.THIRTY_ONE),
        @VBIProperty(name= Legend.LEGEND_SYMBOL_PADDING,value = Count.THIRTY_ONE,expectedValue = Count.THIRTY_ONE),
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
    public void testLegendSymbolStyles(Map<String, Property> propertyMap, String componentName) throws Exception{
        multipleAxesChartPage.go(componentName);
        testLegendSymbolStyle(propertyMap,multipleAxesChartPage,"8","31");
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
        multipleAxesChartPage.go(componentName);
        testLegendTitle(propertyMap,multipleAxesChartPage);
    }


    @VBITestConfig(properties ={
            @VBIProperty(name= Legend.LEGEND_ITEM_COLOR,value = Colors.GREY_HEX,expectedValue = Colors.GREY_HEX),
            @VBIProperty(name= Legend.LEGEND_ITEM_FONT_WEIGHT,value = Font.Weight.BOLD,expectedValue = Font.Weight.BOLD),
            @VBIProperty(name= Legend.LEGEND_ITEM_FONT_SIZE,value = Count.TWENTY,expectedValue = "20px"),
            @VBIProperty(name= Legend.LEGEND_ITEM_FONT_FAMILY,value = Font.Family.VERDANA,expectedValue =Font.Family.VERDANA)
    })
    @Test(alwaysRun=true,dataProvider = "vbiAutomationDataProvider",groups = {"legend"})
    public void testLegendItemText(Map<String, Property> propertyMap, String componentName) throws Exception{
        multipleAxesChartPage.go(componentName);
        testLegendFontStyle(propertyMap,multipleAxesChartPage);
    }
        @VBITestConfig(properties ={},testType = "ztlGetterScriptTest")
    @Test(alwaysRun=true,dataProvider = "vbiZtlGetterScriptAutomationDataProvider",groups = {"ztlscript"})
    public void ztlGetterScriptTest(JSONObject getterJSON,JSONObject defaultValueJSON,String componentName) throws Exception{
         multipleAxesChartPage.go(componentName);
        ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
        ztlScriptTest.testGetterScript(multipleAxesChartPage,getterJSON,defaultValueJSON);
    }

    @VBITestConfig(properties ={},testType = "ztlSetterScriptTest")
    @Test(alwaysRun=true,dataProvider = "vbiZtlSetterScriptAutomationDataProvider",groups = {"ztlscript"})
    public void ztlSetterScriptTest(JSONObject setterJSON,JSONObject defaultValueJSON,JSONObject getterReverseJSON,String componentName) throws Exception{
              multipleAxesChartPage.go(componentName);
        ZtlScriptTest ztlScriptTest=new ZtlScriptTest();
        ztlScriptTest.testSetterScript(multipleAxesChartPage,setterJSON,defaultValueJSON,getterReverseJSON);
    }
        @VBITestConfig(properties ={
               @VBIProperty(name=Event.ON_CLICK_EVENT,value ="select" )
       },
               properties2 = {@VBIProperty2(name = Event.ON_SELECT,value = "RESULT_TEXT.setText(\"ON_SELECT_TEST\");",expectedValue = "ON_SELECT_TEST")},
               testType = "chartEventTest")
       @Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","onclickevent"})
       public void testOnSelect(Map<String, Property2> property2Map, String componentName) throws Exception{
           multipleAxesChartPage.go(componentName);
           testOnSelect(property2Map,multipleAxesChartPage);
       }
                       @VBITestConfig(properties2 ={
                @VBIProperty2(name=Event.ON_AXIS_CLICK,value = "RESULT_TEXT.setText(\"ON_AXIS_CLICK_TEST\");",expectedValue ="ON_AXIS_CLICK_TEST" ),
        },testType = "chartEventTest")
        @Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","axisclickevent"})
        public void testOnAxisClick(Map<String, Property2> property2Map, String componentName) throws Exception{
           multipleAxesChartPage.go(componentName);
            testOnAxisClick(property2Map,multipleAxesChartPage);
        }
             @VBITestConfig(properties2 = {
                   @VBIProperty2(name = Event.ON_CHART_LOAD,value = "RESULT_TEXT.setText(\"ON_CHART_LOAD_TEST\");",expectedValue = "ON_CHART_LOAD_TEST")},
                   testType = "chartEventTest")
       @Test(alwaysRun=true,dataProvider = "vbiChartEventAutomationDataProvider",groups = {"chartevent","chartloadevent"})
       public void testOnChartLoad(Map<String, Property2> property2Map, String componentName) throws Exception{
          multipleAxesChartPage.go(componentName);
           testOnChartLoad(property2Map,multipleAxesChartPage);
       }

}
