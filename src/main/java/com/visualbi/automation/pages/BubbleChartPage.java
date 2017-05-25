package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentList;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class BubbleChartPage extends HighchartsPage {

 @FindBy(css=".highcharts-data-labels div span")
 protected FluentWebElement dataLabelElement;

 public CustomFluentWebElementComponent dataLabel()
 {
  return dataLabelElement.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-bubble-series.highcharts-color-undefined.highcharts-tracker > path")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor() {  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class); }

 @FindBy(css=".highcharts-legend-item.highcharts-bubble-series.highcharts-color-undefined.highcharts-series-0 > path.highcharts-point")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem() {  return legendItem.as(CustomFluentWebElementComponent.class); }

 @FindBy(css=".highcharts-data-labels.highcharts-series-0.highcharts-bubble-series.highcharts-color-undefined > div > span")
 protected FluentWebElement highchartsHierarchyLabel;
 public CustomFluentWebElementComponent highchartsHierarchyLabel() {  return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class); }

 @FindBy(css=".highcharts-legend-item.highcharts-bubble-series.highcharts-color-undefined.highcharts-series-9 > text > tspan")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText() {  return highchartsTotalText.as(CustomFluentWebElementComponent.class); }

 @FindBy(css=".highcharts-series-group > g.highcharts-markers.highcharts-series-0.highcharts-line-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(3)")
 protected FluentWebElement highchartsMarkerColor;
 public CustomFluentWebElementComponent highchartsMarkerColor() {  return highchartsMarkerColor.as(CustomFluentWebElementComponent.class); }
}
