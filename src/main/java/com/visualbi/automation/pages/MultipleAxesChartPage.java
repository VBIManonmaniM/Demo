package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class MultipleAxesChartPage extends HighchartsPage {


 public CustomFluentWebElementComponent plotBand(){
  return $(".highcharts-plot-band").get(1).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLine(){
  //return plotLine.as(CustomFluentWebElementComponent.class);
  return $(".highcharts-plot-lines-5 path").get(1).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLineLabel(){
  if($(".highcharts-plot-line-label").size()>2)
   return $(".highcharts-plot-line-label").get(2).as(CustomFluentWebElementComponent.class);

  return $(".highcharts-plot-line-label").get(0).as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-column-series rect")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-column-series rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > span:last-child")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText(){
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }

}
