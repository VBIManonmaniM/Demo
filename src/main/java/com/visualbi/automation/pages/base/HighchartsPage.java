package com.visualbi.automation.pages.base;

import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.fluentlenium.core.hook.wait.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by praveenn on 1/12/2017.
 */
@Wait(timeout = 30, timeUnit = TimeUnit.SECONDS)
public class HighchartsPage extends ApplicationPage {

    @FindBy(css = ".highcharts-title")
    protected FluentWebElement titleElement;

    @FindBy(css = ".highcharts-subtitle")
    protected FluentWebElement subtitleElement;

    @FindBy(css = ".highcharts-background")
    protected FluentWebElement backgroundElement;


    @FindBy(css = ".highcharts-plot-background")
    protected FluentWebElement plotBackgroundElement;

    @FindBy(css =".highcharts-series-0 .highcharts-point")
    protected FluentWebElement highChartsPoint;

    @FindBy(css = ".highcharts-plot-border")
    protected FluentWebElement plotBorderElement;

    @FindBy(css = ".highcharts-data-labels text")
    protected FluentWebElement dataLabelElement;

    @FindBy(css = ".highcharts-xaxis .highcharts-axis-title")
    protected FluentWebElement xAxisTitleElement;

    @FindBy(css = ".highcharts-yaxis .highcharts-axis-title")
    protected FluentWebElement yAxisTitleElement;

    @FindBy(css = ".highcharts-xaxis-labels text")  //.highcharts-xaxis-labels span
    protected FluentWebElement xAxisFirstLabel;

    @FindBy(css = ".highcharts-xaxis-labels span")  //.highcharts-xaxis-labels span
    protected FluentWebElement xAxisFirstLabelSpan;

    @FindBy(css = ".highcharts-xaxis-labels text:last-child")  //.highcharts-xaxis-labels span:last-child
    protected FluentWebElement xAxisLastLabel;

    @FindBy(css = ".highcharts-xaxis-labels span:last-child")
    protected FluentWebElement xAxisLastLabelSpan;

    @FindBy(css = ".highcharts-yaxis-labels text:last-child")
    protected FluentWebElement yAxisLastLabel;

    @FindBy(css = ".highcharts-xaxis-labels text:nth-child(2) tspan")
    protected FluentWebElement xAxisLabelText;

    @FindBy(css = ".highcharts-xaxis-labels span:nth-child(2)") //.highcharts-xaxis-labels span:nth-child(2)
    protected FluentWebElement xAxisLabelSpan;


    @FindBy(css = ".highcharts-xaxis-labels text:nth-child(2)")
    protected FluentWebElement xAxisSecondLabel;

    @FindBy(css = ".highcharts-xaxis-labels span:nth-child(2)")
    protected FluentWebElement xAxisSecondLabelSpan;

    @FindBy(css = ".highcharts-yaxis-labels text:nth-child(1)")
    protected FluentWebElement yAxisFirstLabel;

    @FindBy(css = ".highcharts-yaxis-labels text:nth-child(1) tspan")
    protected FluentWebElement yAxisFirstLabelText;



    @FindBy(css = ".highcharts-yaxis-labels text:nth-child(2) tspan")
    protected FluentWebElement yAxisSecondLabelText;

    @FindBy(css = ".highcharts-yaxis-labels text:nth-child(2)")
    protected FluentWebElement yAxisSecondLabel;

    @FindBy(css = ".highcharts-xaxis .highcharts-axis-line")
    protected FluentWebElement xAxisLine;

    @FindBy(css = ".highcharts-yaxis .highcharts-axis-line")
    protected FluentWebElement yAxisLine;

    @FindBy(css = ".highcharts-xaxis-grid .highcharts-grid-line")
    protected FluentWebElement xAxisGridLine;

    @FindBy(css = ".highcharts-xaxis .highcharts-tick")
    protected FluentWebElement xAxisTick;

    @FindBy(css = ".highcharts-yaxis-grid .highcharts-grid-line")
    protected FluentWebElement yAxisGridLine;

    @FindBy(css = ".highcharts-yaxis .highcharts-tick")
    protected FluentWebElement yAxisTick;

    @FindBy(css = ".highcharts-plot-band ")
    protected FluentWebElement plotBand;




    @FindBy(css = ".highcharts-plot-band-label")
    protected FluentWebElement plotBandLabel;

    @FindBy(css = ".highcharts-plot-lines-5 path")
    protected FluentWebElement plotLine;

    @FindBy(css = ".highcharts-plot-line-label")
    protected FluentWebElement plotLineLabel;

    @FindBy(css = ".highcharts-data-labels tspan")
    protected FluentWebElement dataLabelTextElement;

    @FindBy(css = ".highcharts-credits")
    protected FluentWebElement creditsElemnt;

    @FindBy(css=".highcharts-label.highcharts-legend-title span")
    protected FluentWebElement legendTitle;

    @FindBy(css=".highcharts-legend-item text")
    protected FluentWebElement legendItemText;

    @FindBy(css=".highcharts-legend-item span")
    protected FluentWebElement legendItemSpan;

    @FindBy(css=".highcharts-legend-item rect")
    protected FluentWebElement legendItem;

    @FindBy(css=".highcharts-legend rect:nth-child(1)")
    protected FluentWebElement legendItemBackGround;

    @FindBy(css=".highcharts-legend .highcharts-point")
    protected FluentWebElement legendSymbol;




    /*
     */

    @FindBy(css=".highcharts-button-symbol")
    protected FluentWebElement exportSymbol;

    @FindBy(css=".highcharts-button-box")
    protected FluentWebElement exportBackGround;

    @FindBy(css=".highcharts-menu")
    protected FluentWebElement exportDropDownMenu;

    @FindBy(css=".highcharts-menu-item")
     
    protected FluentWebElement exportDropDownFonts;

    @FindBy(css=".highcharts-axis-labels tspan")
    protected FluentWebElement axisLabel;

    @FindBy(css=".highcharts-tooltip-box")
    protected FluentWebElement toolTipBox;


    @FindBy(css=".highcharts-tooltip text")
    protected FluentWebElement toolTipText;

    @FindBy(css=".highcharts-tooltip span")
    protected FluentWebElement toolTipSpan;

    @FindBy(css=".highcharts-container")
    protected FluentWebElement highchartsContainer;

    // DATA Series

    @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels text:first-child") //.highcharts-axis-labels.highcharts-xaxis-labels span:first-child
    protected FluentWebElement highchartsHierarchyLabel;

    @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > text")
    protected FluentWebElement dataSeriesLabel;


    @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels span:last-child")
    protected FluentWebElement highchartsTotalText;

    @FindBy(css=".highcharts-legend > g > g > g:first-child text")
    protected FluentWebElement highchartsTotalTextDB;

    @FindBy(css=".highcharts-legend-item.highcharts-area-series rect")
    protected FluentWebElement highchartsDataSeriesColor;

    @FindBy(css=".highcharts-markers.highcharts-series-0.highcharts-area-series.highcharts-color-undefined.highcharts-tracker path:first-child")
    protected FluentWebElement highchartsMarkerColor;

    @FindBy(css=".highcharts-markers.highcharts-series-0.highcharts-area-series.highcharts-color-undefined.highcharts-tracker *:last-child path")
    protected FluentWebElement highchartsMarkerPoint;

    @FindBy(css=".highcharts-series.highcharts-series-7.highcharts-line-series path")
    protected FluentWebElement highchartsTrendLine;


    @FindBy(css=".highcharts-legend-item.highcharts-line-series.highcharts-color-undefined.highcharts-series-7 text")  //span
    protected FluentWebElement highchartsTrendLineEquation;

    @FindBy(css=".highcharts-legend-item.highcharts-line-series.highcharts-color-undefined.highcharts-series-7 path")
    protected FluentWebElement highchartsTrendLineLegendItem;













    public CustomFluentWebElementComponent title(){
        return titleElement.as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent subtitle(){
        return subtitleElement.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent axisLabel(){
        return axisLabel.as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent background(){
        return backgroundElement.as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent plotBackground(){
        return plotBackgroundElement.as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent plotBorder(){
        return plotBorderElement.as(CustomFluentWebElementComponent.class);
    }



    public CustomFluentWebElementComponent dataLabel(){
        return dataLabelElement.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent dataLabelText(){
        return dataLabelTextElement.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent xAxisTitle(){
        return xAxisTitleElement.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent yAxisTitle(){
        return yAxisTitleElement.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent xAxisFirstLabel(){
        if(xAxisFirstLabel.present())
            return xAxisFirstLabel.as(CustomFluentWebElementComponent.class);
        else
            return xAxisFirstLabelSpan.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent xAxisLastLabel(){
        if(xAxisLastLabel.present())
            return xAxisLastLabel.as(CustomFluentWebElementComponent.class);
        else
            return xAxisLastLabelSpan.as(CustomFluentWebElementComponent.class);

    }
    public CustomFluentWebElementComponent yAxisLastLabel(){
        return yAxisLastLabel.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent xAxisLabelText(){
        if(xAxisLabelText.present())
            return xAxisLabelText.as(CustomFluentWebElementComponent.class);
        else
            return xAxisLabelSpan.as(CustomFluentWebElementComponent.class);

    }
    public CustomFluentWebElementComponent xAxisSecondLabel(){
        if(xAxisSecondLabel.present())
            return xAxisSecondLabel.as(CustomFluentWebElementComponent.class);
        else
            return xAxisSecondLabelSpan.as(CustomFluentWebElementComponent.class);

    }

    public CustomFluentWebElementComponent yAxisSecondLabelText(){
        return yAxisSecondLabelText.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent yAxisSecondLabel(){
        return yAxisSecondLabel.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent yAxisFirstLabelText(){
        return yAxisFirstLabelText.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent yAxisFirstLabel(){
        return yAxisFirstLabel.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent xAxisLine(){
        return xAxisLine.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent yAxisLine(){
        return yAxisLine.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent xAxisGridLine(){ return xAxisGridLine.as(CustomFluentWebElementComponent.class);  }

    public CustomFluentWebElementComponent yAxisGridLine(){ return yAxisGridLine.as(CustomFluentWebElementComponent.class);  }
    public CustomFluentWebElementComponent xAxisTick(){
        return xAxisTick.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent yAxisTick(){
        return yAxisTick.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent plotBand(){
        return plotBand.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent yAxisPlotBand(){
       // return yAxisPlotBand.as(CustomFluentWebElementComponent.class);
        return $(".highcharts-plot-bands-0 .highcharts-plot-band").get(1).as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent plotBandLabel(){ return plotBandLabel.as(CustomFluentWebElementComponent.class);    }
    public CustomFluentWebElementComponent yAxisPlotBandLabel(){

                if($(".highcharts-plot-band-label").size()>1)
                {

                    return $(".highcharts-plot-band-label").get(1).as(CustomFluentWebElementComponent.class);
                }
        return $(".highcharts-plot-band-label").get(0).as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent plotLine(){
        return plotLine.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent yAxisPlotLine(){
        //return plotLine.as(CustomFluentWebElementComponent.class);
        return $(".highcharts-plot-lines-5 path").get(1).as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent plotLineLabel(){ return plotLineLabel.as(CustomFluentWebElementComponent.class); }
    public CustomFluentWebElementComponent yAxisPlotLineLabel(){
        if($(".highcharts-plot-line-label").size()>1)
             return $(".highcharts-plot-line-label").get(1).as(CustomFluentWebElementComponent.class);

        return $(".highcharts-plot-line-label").get(0).as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent credits(){
        return creditsElemnt.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent legendTitle(){ return legendTitle.as(CustomFluentWebElementComponent.class);  }

    public CustomFluentWebElementComponent legendItemText(){
    if(legendItemText.present())
        return legendItemText.as(CustomFluentWebElementComponent.class);
    else
        return legendItemSpan.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent legendItem(){
        return legendItem.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent legendBackground(){ return legendItemBackGround.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent legendSymbol(){
        return legendSymbol.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent exportSymbol(){
        return exportSymbol.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent exportBackGround(){
        return exportBackGround.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent exportDropDownMenu(){
        return exportDropDownMenu.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent exportDropDownMenuFonts(){
        return exportDropDownFonts.as(CustomFluentWebElementComponent.class);
    }



    public CustomFluentWebElementComponent toolTipBox(){
        return toolTipBox.as(CustomFluentWebElementComponent.class);

    }
    public CustomFluentWebElementComponent highChartsPoint()
    {
        return highChartsPoint.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent highchartsContainer()
    {
        return highchartsContainer.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent toolTipText(){
        if(toolTipText.present())
            return toolTipText.as(CustomFluentWebElementComponent.class);
        else
            return toolTipSpan.as(CustomFluentWebElementComponent.class);
    }



    public void generateTooltip() {
        highchartsContainer.present();
        executeScript("$('.highcharts-container').parent().highcharts().tooltip.refresh($('.highcharts-container').parent().highcharts().series[0].data[0]);");

    }

    public void generateTooltipOnTrendLine() {
        highchartsContainer.present();
        executeScript("$('.highcharts-container').parent().highcharts().tooltip.refresh($('.highcharts-container').parent().highcharts().series[7].data[7]);");

    }


    public void hoverOnFirstDropDownMenu() {

        //falling back to selenium, as using fluent element
        //against Actions is throwing the following error
        //object is not an instance of declaring class

        Actions builder = new Actions(this.getDriver());
        builder.moveToElement(this.getDriver().findElement(By.cssSelector("div.highcharts-menu div:nth-child(1)"))).perform();
       // Actions builder = new Actions(this.getDriver());
       // builder.moveToElement(this.getDriver().findElement(By.cssSelector("div.highcharts-menu div:nth-child(1)"))).perform();
    }


    /* Data Series */
    public CustomFluentWebElementComponent highchartsHierarchyLabel()
    {
        return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent dataSeriesLabel()
    {
        return dataSeriesLabel.as(CustomFluentWebElementComponent.class);
    }



    public CustomFluentWebElementComponent highchartsTotalText()
    {
        return highchartsTotalText.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent highchartsTotalTextDB()
    {
        return highchartsTotalTextDB.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent highchartsDataSeriesColor()
    {
        return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
    }
    public CustomFluentWebElementComponent highchartsMarkerColor()
    {
        return highchartsMarkerColor.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent highchartsMarkerPoint()
    {
        return highchartsMarkerPoint.as(CustomFluentWebElementComponent.class);
    }


    public CustomFluentWebElementComponent highchartsTrendLineEquation()
    {
        return highchartsTrendLineEquation.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent highchartsTrendLine()
    {
        return highchartsTrendLine.as(CustomFluentWebElementComponent.class);
    }

    public CustomFluentWebElementComponent highchartsTrendLineLegendItem()
    {
        return highchartsTrendLineLegendItem.as(CustomFluentWebElementComponent.class);
    }
}
