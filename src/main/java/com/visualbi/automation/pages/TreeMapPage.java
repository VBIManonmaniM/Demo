package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class TreeMapPage extends HighchartsPage {

 @FindBy(css=".highcharts-data-labels *:last-child text tspan")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){
  return legendItemText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-treemap-series.highcharts-color-0.highcharts-tracker.highcharts-series-hover > g.highcharts-levelGroup-2 > rect")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

}
