package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class BulletChartPage extends HighchartsPage {

 @FindBy(css =".highcharts-series-3 .highcharts-point")
 protected FluentWebElement highChartsPoint;

 public CustomFluentWebElementComponent highChartsPoint()
 {
  return highChartsPoint.as(CustomFluentWebElementComponent.class);
 }
 @FindBy(css=".highcharts-series.highcharts-series-3.highcharts-bar-series.highcharts-color-0.highcharts-tracker > rect:nth-child(1)")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-series rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }


 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > text:nth-child(10) > tspan")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()    {       return highchartsTotalText.as(CustomFluentWebElementComponent.class);    }

 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > text:first-child > tspan")
 protected FluentWebElement highchartsHierarchyLabel;

 public CustomFluentWebElementComponent highchartsHierarchyLabel()    {       return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);    }
}
