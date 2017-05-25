package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class TreeMapDrilldownPage extends HighchartsPage {

@FindBy(css = ".highcharts-series.highcharts-series-0.highcharts-treemap-series.highcharts-color-0.highcharts-tracker > g.highcharts-levelGroup-1 > rect:nth-child(6)")
protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor()
 {
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }
}
