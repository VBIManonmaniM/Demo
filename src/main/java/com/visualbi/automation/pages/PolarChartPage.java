package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class PolarChartPage extends HighchartsPage {

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > span")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){
  return legendItemText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > rect")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }
//.highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(10) > tspan
 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > span:nth-child(10)")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()
 {
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }
}
