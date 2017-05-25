package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class DualAxesChartPage extends HighchartsPage {

 public CustomFluentWebElementComponent plotBand(){
  return $(".highcharts-plot-band").get(2).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLine(){
  //return plotLine.as(CustomFluentWebElementComponent.class);
  return $(".highcharts-plot-lines-5 path").get(2).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLineLabel(){
  if($(".highcharts-plot-line-label").size()>2)
   return $(".highcharts-plot-line-label").get(2).as(CustomFluentWebElementComponent.class);

  return $(".highcharts-plot-line-label").get(0).as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css =".highcharts-series.highcharts-series-0.highcharts-column-series.highcharts-color-undefined.highcharts-tracker > rect:nth-child(1)")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor()
 {
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }


 @FindBy(css=".highcharts-markers.highcharts-series-1.highcharts-line-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(2)")
 protected FluentWebElement highchartsMarkerColor;

 public CustomFluentWebElementComponent highchartsMarkerColor()
 {
  return highchartsMarkerColor.as(CustomFluentWebElementComponent.class);
 }
}
