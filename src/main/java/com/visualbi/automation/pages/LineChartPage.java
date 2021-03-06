package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class LineChartPage extends HighchartsPage {

 @FindBy(css="g.highcharts-axis-labels:nth-child(21) > text:nth-child(2) > tspan:nth-child(1)")
 protected FluentWebElement axisLabel;
 public CustomFluentWebElementComponent axisLabel(){
  return axisLabel.as(CustomFluentWebElementComponent.class);
 }


 @FindBy(css=".highcharts-legend-item.highcharts-line-series.highcharts-color-undefined.highcharts-series-0 path")
 protected FluentWebElement legendItem;

 public CustomFluentWebElementComponent legendItem(){  return legendItem.as(CustomFluentWebElementComponent.class); }

 @FindBy(css=".highcharts-legend-item.highcharts-line-series path.highcharts-point")
 protected FluentWebElement highchartsDataSeriesColor;

 public CustomFluentWebElementComponent highchartsDataSeriesColor()
 {
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css="span:first-child")
 protected FluentWebElement highchartsHierarchyLabel;
 public CustomFluentWebElementComponent highchartsHierarchyLabel()
 {
  return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > span:last-child")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()
 {
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-series-group > g.highcharts-markers.highcharts-series-0.highcharts-line-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(3)")
 protected FluentWebElement highchartsMarkerColor;

 public CustomFluentWebElementComponent highchartsMarkerColor()
 {
  return highchartsMarkerColor.as(CustomFluentWebElementComponent.class);
 }

}
