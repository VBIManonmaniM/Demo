package com.visualbi.automation.base;

import static com.visualbi.automation.constants.Properties.*;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import com.visualbi.automation.xmlutils.models.Property;
import com.visualbi.automation.xmlutils.models.Property2;
import org.junit.ComparisonFailure;

import static org.testng.Assert.*;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by praveenn on 1/12/2017.
 */
public class HighchartsTest extends BaseTest {
    public  void testChartLoaded(HighchartsPage page){
        assertThat(page.highchartsContainer().present()).isEqualTo(true);
    }

    public void testTitle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.title().getText()).isEqualTo(propertyMap.get(Title.TEXT).getValue());
        assertThat(page.title().getTextAnchor()).isEqualTo(propertyMap.get(Title.ALIGN).getExpectedValue());
        assertThat(page.title().getColor()).isEqualTo(propertyMap.get(Title.COLOR).getExpectedValue());
        assertThat(page.title().getFontFamily()).isEqualTo(propertyMap.get(Title.FONTFAMILY).getValue());
        assertThat(page.title().getFontWeight()).isEqualTo(propertyMap.get(Title.FONTWEIGHT).getValue());
        assertThat(page.title().getFontSize()).isEqualTo(propertyMap.get(Title.FONTSIZE).getExpectedValue());
    }

    public void testSubtitle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.subtitle().getText()).isEqualTo(propertyMap.get(SubTitle.TEXT).getValue());
        assertThat(page.subtitle().getTextAnchor()).isEqualTo(propertyMap.get(SubTitle.ALIGN).getExpectedValue());
        assertThat(page.subtitle().getColor()).isEqualTo(propertyMap.get(SubTitle.COLOR).getExpectedValue());
        assertThat(page.subtitle().getFontFamily()).isEqualTo(propertyMap.get(SubTitle.FONTFAMILY).getValue());
        assertThat(page.subtitle().getFontWeight()).isEqualTo(propertyMap.get(SubTitle.FONTWEIGHT).getValue());
        assertThat(page.subtitle().getFontSize()).isEqualTo(propertyMap.get(SubTitle.FONTSIZE).getExpectedValue());
    }
    public void testGoogleFont(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.subtitle().getFontFamily()).isEqualTo(propertyMap.get(GoogleFont.FONTFAMILY).getValue());
        assertThat(page.title().getFontFamily()).isEqualTo(propertyMap.get(GoogleFont.FONTFAMILY).getValue());
    }
    public void testPlotOptions(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotBackground().getXValue()).isEqualTo(propertyMap.get(PlotOption.MARGINLEFT).getValue());
        assertThat(page.plotBackground().getYValue()).isEqualTo(propertyMap.get(PlotOption.MARGINTOP).getValue());
        assertThat(page.background().getStrokeColor()).isEqualTo(propertyMap.get(PlotOption.CHARTSHADOW).getExpectedValue());
        assertThat(page.plotBackground().getStrokeColor()).isEqualTo(propertyMap.get(PlotOption.PLOTSHADOW).getExpectedValue());
    }

    public void testBackgroundAndBorder(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.background().getFillColor()).isEqualTo(propertyMap.get(Background.COLOR).getValue());
        assertThat(page.background().getStrokeColor()).isEqualTo(propertyMap.get(Border.COLOR).getValue());
        assertThat(page.background().getStrokeWidth()).isEqualTo(propertyMap.get(Border.WIDTH).getValue());
        assertThat(page.background().getBorderRadiusX()).isEqualTo(propertyMap.get(Border.RADIUS).getValue());
        assertThat(page.background().getBorderRadiusY()).isEqualTo(propertyMap.get(Border.RADIUS).getValue());
    }
    public void testPlotArea(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotBackground().getFillColor()).isEqualTo(propertyMap.get(PlotArea.BACKGROUNDCOLOR).getValue());
        assertThat(page.plotBorder().getStrokeColor()).isEqualTo(propertyMap.get(PlotArea.BORDERCOLOR).getValue());
        assertThat(page.plotBorder().getStrokeWidth()).isEqualTo(propertyMap.get(PlotArea.BORDERWIDTH).getValue());
    }

    public void testDataLabelStyle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.dataLabel().getColor()).isEqualTo(propertyMap.get(Datalabel.COLOR).getExpectedValue());
        assertThat(page.dataLabel().getFontFamily()).isEqualTo(propertyMap.get(Datalabel.FONTFAMILY).getValue());
        assertThat(page.dataLabel().getFontWeight()).isEqualTo(propertyMap.get(Datalabel.FONTWEIGHT).getValue());
        assertThat(page.dataLabel().getFontSize()).isEqualTo(propertyMap.get(Datalabel.FONTSIZE).getExpectedValue());
    }
    public void testXAxisCeilingAndFlooring(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.xAxisFirstLabel().getText()).isEqualTo("Eurasia");
        assertThat(page.xAxisSecondLabel().getText()).isEqualTo("Europe");
        if(page.xAxisSecondLabel().getXValueAsFloat() > page.xAxisFirstLabel().getXValueAsFloat())
           throw new ComparisonFailure("XAxis reversed Assertion failure","Reversed","Not Reversed");
    }
    public void testYAxisCeilingAndFlooring(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisFirstLabelText().getValue()).isEqualTo(propertyMap.get(YAxis.FLOOR).getValue());
        assertThat(page.yAxisSecondLabelText().getValue()).isEqualTo(propertyMap.get(YAxis.CEILING).getValue());
            }
    public void testXAxisMinimumAndMaximum(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.xAxisFirstLabel().getText()).isEqualTo("Eurasia");
        assertThat(page.xAxisSecondLabel().getText()).isEqualTo("Europe");
        if(page.xAxisSecondLabel().getYValueAsFloat() >200 )
            throw new ComparisonFailure("XAxis ON Top Assertion failure","Top","Bottom");
    }
    public void testYAxisMinimumAndMaximum(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisFirstLabelText().getValue()).isEqualTo(propertyMap.get(YAxis.MINIMUM).getValue());
        assertThat(page.yAxisSecondLabelText().getValue()).isEqualTo(propertyMap.get(YAxis.MAXIMUM).getValue());

        if(page.yAxisTitle().getXValueAsFloat() < 600 )
            throw new ComparisonFailure("YAxis Axis Opposite Assertion failure","Axis on Right Side","Axis on Left Side"+page.yAxisTitle().getXValueAsFloat() );
    }

    public void testXAxisStyle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.xAxisLine().getStrokeColor()).isEqualTo(propertyMap.get(XAxis.LINE_COLOR).getValue());
        assertThat(page.xAxisLine().getStrokeWidth()).isEqualTo(propertyMap.get(XAxis.LINE_WIDTH).getValue());
        assertThat(page.plotBand().getFillColor()).isEqualTo(propertyMap.get(XAxis.ALTERNATIVE_GRID_COLOR).getValue());
    }
    public void testYAxisStyle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisLine().getStrokeColor()).isEqualTo(propertyMap.get(YAxis.LINE_COLOR).getValue());
        assertThat(page.yAxisLine().getStrokeWidth()).isEqualTo(propertyMap.get(YAxis.LINE_WIDTH).getValue());
        assertThat(page.yAxisPlotBand().getFillColor()).isEqualTo(propertyMap.get(YAxis.ALTERNATIVE_GRID_COLOR).getValue());
    }
    public void testXAxisLabelStyle(Map<String, Property> propertyMap, HighchartsPage page){
        String regex="^\\"+propertyMap.get(XAxis.PREFIX).getValue()+".+\\"+propertyMap.get(XAxis.SUFFIX).getValue()+"$";
        assertThat(page.xAxisLabelText().getText()).matches(regex);
        assertThat(page.xAxisSecondLabel().getTextAnchor()).isEqualTo(propertyMap.get(XAxis.ALIGN).getExpectedValue());
        assertThat(page.xAxisSecondLabel().getColor()).isEqualTo(propertyMap.get(XAxis.COLOR).getValue());
        assertThat(page.xAxisSecondLabel().getFontFamily()).isEqualTo(propertyMap.get(XAxis.FONTFAMILY).getValue());
        assertThat(page.xAxisSecondLabel().getFontWeight()).isEqualTo(propertyMap.get(XAxis.FONTWEIGHT).getValue());
        assertThat(page.xAxisSecondLabel().getFontSize()).isEqualTo(propertyMap.get(XAxis.FONTSIZE).getExpectedValue());
        assertThat(page.xAxisSecondLabel().getTransform()).contains("rotate("+propertyMap.get(XAxis.ROTATION).getValue());
        assertThat(page.xAxisFirstLabel().getText()).isEqualTo("");
        assertThat(page.xAxisLastLabel().getText()).isEqualTo("");
    }
    public void testYAxisLabelStyle(Map<String, Property> propertyMap, HighchartsPage page){
        String regex="^\\"+propertyMap.get(YAxis.PREFIX).getValue()+".+\\"+propertyMap.get(YAxis.SUFFIX).getValue()+"$";
        assertThat(page.yAxisSecondLabel().getText()).matches(regex);
        assertThat(page.yAxisSecondLabel().getTextAnchor()).isEqualTo(propertyMap.get(YAxis.ALIGN).getExpectedValue());
        assertThat(page.yAxisSecondLabel().getColor()).isEqualTo(propertyMap.get(YAxis.COLOR).getValue());
        assertThat(page.yAxisSecondLabel().getFontFamily()).isEqualTo(propertyMap.get(YAxis.FONTFAMILY).getValue());
        assertThat(page.yAxisSecondLabel().getFontWeight()).isEqualTo(propertyMap.get(YAxis.FONTWEIGHT).getValue());
        assertThat(page.yAxisSecondLabel().getFontSize()).isEqualTo(propertyMap.get(YAxis.FONTSIZE).getExpectedValue());
        assertThat(page.yAxisSecondLabel().getTransform()).contains("rotate("+propertyMap.get(YAxis.ROTATION).getValue());
        assertThat(page.yAxisFirstLabel().getText()).isEqualTo("");
        assertThat(page.yAxisLastLabel().getText()).isEqualTo("");
    }
    public void testXAxisTitle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.xAxisTitle().getText()).isEqualTo(propertyMap.get(XAxisTitle.TEXT).getValue());
        assertThat(page.xAxisTitle().getTextAnchor()).isEqualTo(propertyMap.get(XAxisTitle.ALIGN).getExpectedValue());
        assertThat(page.xAxisTitle().getColor()).isEqualTo(propertyMap.get(XAxisTitle.COLOR).getExpectedValue());
        assertThat(page.xAxisTitle().getFontFamily()).isEqualTo(propertyMap.get(XAxisTitle.FONTFAMILY).getValue());
        assertThat(page.xAxisTitle().getFontWeight()).isEqualTo(propertyMap.get(XAxisTitle.FONTWEIGHT).getValue());
        assertThat(page.xAxisTitle().getFontSize()).isEqualTo(propertyMap.get(XAxisTitle.FONTSIZE).getExpectedValue());
        assertThat(page.xAxisTitle().getTransform()).contains("rotate("+propertyMap.get(XAxisTitle.ROTATION).getValue());
    }
    public void testYAxisTitle(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisTitle().getText()).isEqualTo(propertyMap.get(YAxisTitle.TEXT).getValue());
        assertThat(page.yAxisTitle().getTextAnchor()).isEqualTo(propertyMap.get(YAxisTitle.ALIGN).getExpectedValue());
        assertThat(page.yAxisTitle().getColor()).isEqualTo(propertyMap.get(YAxisTitle.COLOR).getExpectedValue());
        assertThat(page.yAxisTitle().getFontFamily()).isEqualTo(propertyMap.get(YAxisTitle.FONTFAMILY).getValue());
        assertThat(page.yAxisTitle().getFontWeight()).isEqualTo(propertyMap.get(YAxisTitle.FONTWEIGHT).getValue());
        assertThat(page.yAxisTitle().getFontSize()).isEqualTo(propertyMap.get(YAxisTitle.FONTSIZE).getExpectedValue());
        assertThat(page.yAxisTitle().getTransform()).contains("rotate("+propertyMap.get(YAxisTitle.ROTATION).getValue());
    }

    public void testXAxisPlotBandLabel(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotBandLabel().getText()).isEqualTo(propertyMap.get(XAxisPlotBandLabel.TEXT).getValue());
         assertThat(page.plotBandLabel().getColor()).isEqualTo(propertyMap.get(XAxisPlotBandLabel.COLOR).getValue());
        assertThat(page.plotBandLabel().getFontFamily()).isEqualTo(propertyMap.get(XAxisPlotBandLabel.FONTFAMILY).getValue());
        assertThat(page.plotBandLabel().getFontWeight()).isEqualTo(propertyMap.get(XAxisPlotBandLabel.FONTWEIGHT).getValue());
        assertThat(page.plotBandLabel().getFontSize()).isEqualTo(propertyMap.get(XAxisPlotBandLabel.FONTSIZE).getExpectedValue());
        assertThat(page.plotBandLabel().getTransform()).contains("rotate("+propertyMap.get(XAxisPlotBandLabel.ROTATION).getValue());
    }

    public void testYAxisPlotBandLabel(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisPlotBandLabel().getText()).isEqualTo(propertyMap.get(YAxisPlotBandLabel.TEXT).getValue());
        assertThat(page.yAxisPlotBandLabel().getColor()).isEqualTo(propertyMap.get(YAxisPlotBandLabel.COLOR).getValue());
        assertThat(page.yAxisPlotBandLabel().getFontFamily()).isEqualTo(propertyMap.get(YAxisPlotBandLabel.FONTFAMILY).getValue());
        assertThat(page.yAxisPlotBandLabel().getFontWeight()).isEqualTo(propertyMap.get(YAxisPlotBandLabel.FONTWEIGHT).getValue());
        assertThat(page.yAxisPlotBandLabel().getFontSize()).isEqualTo(propertyMap.get(YAxisPlotBandLabel.FONTSIZE).getExpectedValue());
        assertThat(page.yAxisPlotBandLabel().getTransform()).contains("rotate("+propertyMap.get(YAxisPlotBandLabel.ROTATION).getValue());
    }

    public void testXAxisPlotLineLabel(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotLineLabel().getText()).isEqualTo(propertyMap.get(XAxisPlotLineLabel.TEXT).getValue());
        assertThat(page.plotLineLabel().getColor()).isEqualTo(propertyMap.get(XAxisPlotLineLabel.COLOR).getValue());
        assertThat(page.plotLineLabel().getFontFamily()).isEqualTo(propertyMap.get(XAxisPlotLineLabel.FONTFAMILY).getValue());
        assertThat(page.plotLineLabel().getFontWeight()).isEqualTo(propertyMap.get(XAxisPlotLineLabel.FONTWEIGHT).getValue());
        assertThat(page.plotLineLabel().getFontSize()).isEqualTo(propertyMap.get(XAxisPlotLineLabel.FONTSIZE).getExpectedValue());
        assertThat(page.plotLineLabel().getTransform()).contains("rotate("+propertyMap.get(XAxisPlotLineLabel.ROTATION).getValue());
           }

    public void testYAxisPlotLineLabel(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisPlotLineLabel().getText()).isEqualTo(propertyMap.get(YAxisPlotLineLabel.TEXT).getValue());
        assertThat(page.yAxisPlotLineLabel().getColor()).isEqualTo(propertyMap.get(YAxisPlotLineLabel.COLOR).getValue());
        assertThat(page.yAxisPlotLineLabel().getFontFamily()).isEqualTo(propertyMap.get(YAxisPlotLineLabel.FONTFAMILY).getValue());
        assertThat(page.yAxisPlotLineLabel().getFontWeight()).isEqualTo(propertyMap.get(YAxisPlotLineLabel.FONTWEIGHT).getValue());
        assertThat(page.yAxisPlotLineLabel().getFontSize()).isEqualTo(propertyMap.get(YAxisPlotLineLabel.FONTSIZE).getExpectedValue());
        assertThat(page.yAxisPlotLineLabel().getTransform()).contains("rotate("+propertyMap.get(YAxisPlotLineLabel.ROTATION).getValue());

    }


    public void testXAxisPlotBand(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotBand().getFillColor()).isEqualTo(propertyMap.get(XAxisPlotBand.COLOR).getValue());
        assertThat(page.plotBand().getStrokeColor()).isEqualTo(propertyMap.get(XAxisPlotBand.BORDER_COLOR).getValue());
        assertThat(page.plotBand().getStrokeWidth()).isEqualTo(propertyMap.get(XAxisPlotBand.BORDER_WIDTH).getValue());

    }

    public void testYAxisPlotBand(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisPlotBand().getFillColor()).isEqualTo(propertyMap.get(YAxisPlotBand.COLOR).getValue());
        assertThat(page.yAxisPlotBand().getStrokeColor()).isEqualTo(propertyMap.get(YAxisPlotBand.BORDER_COLOR).getValue());
        assertThat(page.yAxisPlotBand().getStrokeWidth()).isEqualTo(propertyMap.get(YAxisPlotBand.BORDER_WIDTH).getValue());

    }

    public void testXAxisGridAndTick(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.xAxisGridLine().getStrokeColor()).isEqualTo(propertyMap.get(XAxisGridLine.COLOR).getValue());
        assertThat(page.xAxisGridLine().getStrokeWidth()).isEqualTo(propertyMap.get(XAxisGridLine.WIDTH).getValue());
        assertThat(page.xAxisTick().getStrokeColor()).isEqualTo(propertyMap.get(XAxisMajorTick.COLOR).getValue());
        assertThat(page.xAxisTick().getStrokeWidth()).isEqualTo(propertyMap.get(XAxisMajorTick.WIDTH).getValue());

    }
    public void testYAxisGridAndTick(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisGridLine().getStrokeColor()).isEqualTo(propertyMap.get(YAxisGridLine.COLOR).getValue());
        assertThat(page.yAxisGridLine().getStrokeWidth()).isEqualTo(propertyMap.get(YAxisGridLine.WIDTH).getValue());
        assertThat(page.yAxisTick().getStrokeColor()).isEqualTo(propertyMap.get(YAxisMajorTick.COLOR).getValue());
        assertThat(page.yAxisTick().getStrokeWidth()).isEqualTo(propertyMap.get(YAxisMajorTick.WIDTH).getValue());

    }


    public void testXAxisPlotLine(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.plotLine().getStrokeColor()).isEqualTo(propertyMap.get(XAxisPlotLine.COLOR).getValue());
          assertThat(page.plotLine().getStrokeWidth()).isEqualTo(propertyMap.get(XAxisPlotLine.WIDTH).getValue());

    }

    public void testYAxisPlotLine(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.yAxisPlotLine().getStrokeColor()).isEqualTo(propertyMap.get(YAxisPlotLine.COLOR).getValue());
        assertThat(page.yAxisPlotLine().getStrokeWidth()).isEqualTo(propertyMap.get(YAxisPlotLine.WIDTH).getValue());

    }

    public void testCredits(Map<String, Property> propertyMap, HighchartsPage page){
        assertThat(page.credits().getText()).isEqualTo(propertyMap.get(Credit.TEXT).getValue());
        assertThat(page.credits().getTextAnchor()).isEqualTo(propertyMap.get(Credit.ALIGN).getExpectedValue());
        assertThat(page.credits().getColor()).isEqualTo(propertyMap.get(Credit.COLOR).getExpectedValue());
        assertThat(page.credits().getFontFamily()).isEqualTo(propertyMap.get(Credit.FONTFAMILY).getValue());
        assertThat(page.credits().getFontWeight()).isEqualTo(propertyMap.get(Credit.FONTWEIGHT).getValue());
        assertThat(page.credits().getFontSize()).isEqualTo(propertyMap.get(Credit.FONTSIZE).getExpectedValue());
        assertThat(page.credits().getCursor()).isEqualTo(propertyMap.get(Credit.CURSOUR).getValue());
    }

    public void testLegendTitle(Map<String, Property> propertyMap, HighchartsPage page){
        CustomFluentWebElementComponent legendTitle = page.legendTitle();
        assertThat(legendTitle.text()).isEqualTo(propertyMap.get(Legend.LEGEND_TITLE).getValue());
        assertThat(legendTitle.getColor()).isEqualTo(propertyMap.get(Legend.LEGEND_COLOR).getExpectedValue());
        assertThat(legendTitle.getFontWeight()).isEqualTo(propertyMap.get(Legend.LEGEND_FONT_WEIGHT).getExpectedValue());
        assertThat(legendTitle.getFontSize()).isEqualTo(propertyMap.get(Legend.LEGEND_FONT_SIZE).getExpectedValue());
        assertThat(legendTitle.getFontFamily()).isEqualTo(propertyMap.get(Legend.LEGEND_FONT_FAMILY).getExpectedValue());
    }

    public void testLegendFontStyle(Map<String, Property> propertyMap, HighchartsPage page){
        CustomFluentWebElementComponent legendItemText = page.legendItemText();
        assertThat(legendItemText.getColor()).isEqualTo(propertyMap.get(Legend.LEGEND_ITEM_COLOR).getExpectedValue());
        assertThat(legendItemText.getFontWeight()).isEqualTo(propertyMap.get(Legend.LEGEND_ITEM_FONT_WEIGHT).getExpectedValue());
        assertTrue(legendItemText.getFontSize().equals(propertyMap.get(Legend.LEGEND_ITEM_FONT_SIZE).getExpectedValue()));
        assertThat(legendItemText.getFontFamily()).isEqualTo(propertyMap.get(Legend.LEGEND_ITEM_FONT_FAMILY).getExpectedValue());
    }

    //original method
    public void testLegendSymbolStyle(Map<String, Property> propertyMap, HighchartsPage page, String symbolWidth
            , String symbolPadding){

        CustomFluentWebElementComponent symbolElement = page.legendSymbol();
        assertThat(symbolElement.getHeight()).isEqualTo(propertyMap.get(Legend.LEGEND_SYMBOL_HEIGHT).getExpectedValue());
        assertThat(symbolElement.getBorderRadiusX()).isEqualTo(propertyMap.get(Legend.LEGEND_SYMBOL_RADIUS).getExpectedValue());
        assertThat(page.legendItemText().getPaddingOrWidth(symbolWidth)).isEqualTo(propertyMap.get(Legend.LEGEND_SYMBOL_PADDING).getExpectedValue());
        assertThat(page.legendItemText().getPaddingOrWidth(symbolPadding)).isEqualTo(propertyMap.get(Legend.LEGEND_SYMBOL_WIDTH).getExpectedValue());
    }

    public void testLegendStyle(Map<String, Property> propertyMap, HighchartsPage page) {
        CustomFluentWebElementComponent legendBackground = page.legendBackground();

        assertThat(legendBackground.getFillColor()).isEqualTo(propertyMap.get(Legend.LEGEND_BACKGROUNDCOLOR).getExpectedValue());
        assertThat(legendBackground.getStrokeColor()).isEqualTo(propertyMap.get(Legend.LEGEND_BORDER_COLOR).getExpectedValue());
        assertTrue(legendBackground.getStrokeWidth().equals(propertyMap.get(Legend.LEGEND_BORDER_WIDTH).getExpectedValue()));
        assertThat(legendBackground.getBorderRadiusX()).isEqualTo(propertyMap.get(Legend.LEGEND_BORDER_RADIUS).getExpectedValue());
    }


    public void testExportSymbolStyles(Map<String, Property> propertyMap, HighchartsPage page) {
        CustomFluentWebElementComponent exportSymbol = page.exportSymbol();

        assertThat(exportSymbol.getFillColor()).isEqualTo(propertyMap.get(Export.EXPORT_ICON_SYMBOL_FILL).getExpectedValue());
        assertThat(exportSymbol.getStrokeColor()).isEqualTo(propertyMap.get(Export.EXPORT_ICON_SYMBOL_STROKE).getExpectedValue());
        assertTrue(exportSymbol.getStrokeWidth().equals(propertyMap.get(Export.EXPORT_ICON_SYMBOL_STROKE_WIDTH).getExpectedValue()));
    }

    public void testExportBackGround(Map<String, Property> propertyMap, HighchartsPage page) {
        CustomFluentWebElementComponent backgroundElement = page.exportBackGround();

        assertThat(backgroundElement.getFillColor()).isEqualTo(propertyMap.get(Export.EXPORT_BACKGROUND_FILL).getExpectedValue());
        assertThat(backgroundElement.getBorderRadiusX()).isEqualTo(propertyMap.get(Export.EXPORT_BACKGROUND_RADIUS).getExpectedValue());

    }

    public void testExportIconEnabled(Map<String, Property> propertyMap, HighchartsPage page) {
        CustomFluentWebElementComponent backgroundElement = page.exportBackGround();

        assertThat(backgroundElement.present()).isEqualTo(false);
    }


    public void testExportDropDownStyles(Map<String, Property> propertyMap, HighchartsPage page) {

        //click the page
        page.exportSymbol().click();

        CustomFluentWebElementComponent dropDownMenu = page.exportDropDownMenu();
        CustomFluentWebElementComponent dropDownMenuFonts = page.exportDropDownMenuFonts();

        assertThat(dropDownMenu.getBackGroundColor()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_BACKGROUND_COLOR).getExpectedValue());
        assertThat(dropDownMenuFonts.getColor()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_TEXT_COLOR).getExpectedValue());
        assertThat(dropDownMenuFonts.getFontWeight()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_FONT_STYLE).getExpectedValue());

        //do the hovering
        page.hoverOnFirstDropDownMenu();

        //assertion for the hover
        //TODO: The color of the font after hovering so dynamic.
        //TODO: even though we expect a static value, it comes differently each time.
//        assertThat(dropDownMenuFonts.getColor()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_TEXT_HOVER_COLOR).getExpectedValue());
        assertThat(dropDownMenuFonts.getBackGroundColor()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_HOVER_STYLE_BACKGROUND).getExpectedValue());
        assertThat(dropDownMenuFonts.getFontWeight()).isEqualTo(propertyMap.get(Export.EXPORT_MENU_FONT_HOVER_STYLE).getExpectedValue());

    }

    public void testToolTipStyle(Map<String, Property> propertyMap, HighchartsPage page) throws Exception {
        page.generateTooltip();
        CustomFluentWebElementComponent toolTipPath = page.toolTipBox();
        CustomFluentWebElementComponent toolTipText = page.toolTipText();


        assertThat(toolTipPath.getFillColor()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_BACKGROUND_COLOR).getExpectedValue());
        assertThat(toolTipPath.getStrokeColor()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_BORDER_COLOR).getExpectedValue());
//         TODO: Path radius is not there.
//        assertThat(toolTipBox.getBorderRadiusX()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_BORDER_RADIUS).getExpectedValue());

        //The stroke width is visible only after hovering
        assertThat(toolTipPath.getStrokeWidth()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_BORDER_WIDTH).getExpectedValue());

        //text assertions
        assertThat(toolTipText.getFontWeight()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_FONT_WEIGHT).getExpectedValue());
        assertThat(toolTipText.getFontFamily()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_FONT_FAMILY).getExpectedValue());
        assertThat(toolTipText.getFontSize()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_FONT_SIZE).getExpectedValue()+"px");
        assertThat(toolTipText.getColor()).isEqualTo(propertyMap.get(Tooltip.TOOLTIP_TEXT_COLOR).getExpectedValue());

    }

    public void testToolTipNumberFormat(Map<String, Property> propertyMap, HighchartsPage page)
            throws Exception{
        page.generateTooltip();
        CustomFluentWebElementComponent toolTipText = page.toolTipText();


        Integer toolTipDecimalValue = getNoOfDecimals(toolTipText.getText());
        assertThat(toolTipDecimalValue).isEqualTo(Integer.parseInt(propertyMap.get(Tooltip.TOOLTIP_DECIMAL_VALUE).getExpectedValue()));
    }
    public void testNumberFormat(Map<String, Property> propertyMap, HighchartsPage page)
            throws Exception{
        //page.generateTooltip();
        //CustomFluentWebElementComponent toolTipText = page.toolTipText();

         String dataLabelText= page.dataLabelText().getValue();
        System.out.println(dataLabelText);
        String prefix = propertyMap.get(NumberFormat.PREFIX).getValue();
        String sufix = propertyMap.get(NumberFormat.SUFFIX).getValue();
        String decimalSapertor = propertyMap.get(NumberFormat.DECIMAL_SEPARATOR).getValue();
//        String thousandSaperator = propertyMap.get(NumberFormat.THOUSANDS_SEPARATOR).getValue();
         //String regex="^\\"+prefix+" .+\\"+thousandSaperator+"...+\\"+decimalSapertor+"... \\"+sufix+"$";
         String regex="^\\"+prefix+" .+\\"+decimalSapertor+"... \\"+sufix+"$";
         assertThat(dataLabelText).matches(regex);
          }


    public void testOnSelect(Map<String ,Property2> property2Map,HighchartsPage page) throws InterruptedException {
        page.highChartsPoint().present();
        Thread.sleep(1000);
        page.highChartsPoint().click();
        Thread.sleep(1000);
        String expectedValue=property2Map.get(Event.ON_SELECT).getExpectedValue();
        String actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
        if(actualValue.equals(""))
        {
            page.highChartsPoint().click();
            for (int i=0;i<5 && !actualValue.equals(expectedValue);i++) {
                actualValue = page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
                Thread.sleep(300);
            }
        }

        actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
        assertThat(actualValue).isEqualTo(expectedValue);

    }
    public void testOnAxisClick(Map<String ,Property2> property2Map,HighchartsPage page) throws InterruptedException {
       // page.highChartsPoint().present();
        //Thread.sleep(2000);
        page.axisLabel().click();
        String expectedValue=property2Map.get(Event.ON_AXIS_CLICK).getExpectedValue();
        String actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
        for (int i=0;i<5 && !actualValue.equals(expectedValue);i++) {
            actualValue = page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
            Thread.sleep(300);
        }
        assertThat(actualValue).isEqualTo(expectedValue);

    }
    public void testOnChartLoad(Map<String ,Property2> property2Map,HighchartsPage page) throws InterruptedException {

        String expectedValue=property2Map.get(Event.ON_CHART_LOAD).getExpectedValue();
        String actualValue=page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
        for (int i=0;i<5 && !actualValue.equals(expectedValue);i++) {
            actualValue = page.getElementByClass(VBIConfig.ZTL_SCRIPT_RESULT_CLASS).getValue();
            Thread.sleep(300);
        }

        assertThat(actualValue).isEqualTo(expectedValue);


    }

    /**
     * THis method takes the value like "(7678.00& Sales" a converts into 7678.00
     * @param data The real text eg."(7678.00& Sales"
     * @return Number between the prefix and suffix 7678.00
     */
    private Integer getNoOfDecimals(String data) {

        String value = null;
        Integer toolTipDecimalValue = null;
        Pattern pattern = Pattern.compile("\\{(.*?)&");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            value = matcher.group(1);
        }
        if(value != null){
            toolTipDecimalValue = value.split("\\.").length + 1;
        }
        return toolTipDecimalValue;
    }



}
