package com.visualbi.automation.pages;


import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class FixedColumnChartPage extends HighchartsPage {

 @FindBy(css =".highcharts-series-1 .highcharts-point")
 protected FluentWebElement highChartsPoint;

 public CustomFluentWebElementComponent highChartsPoint()
 {
  return highChartsPoint.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0 > rect")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-column-series rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }
}
