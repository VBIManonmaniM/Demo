package com.visualbi.automation.pages;

import com.visualbi.automation.constants.Properties;
import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import com.visualbi.automation.xmlutils.models.Property;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class HeatMapChartPage extends HighchartsPage {
 @FindBy(css = ".highcharts-series.highcharts-series-0.highcharts-heatmap-series.highcharts-color-0.highcharts-tracker > rect:nth-child(10)")
 protected FluentWebElement minColor;

 public CustomFluentWebElementComponent minColor()
 {
  return minColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-series.highcharts-series-0.highcharts-heatmap-series.highcharts-color-0.highcharts-tracker > rect:nth-child(9)")
 protected FluentWebElement maxColor;

 public CustomFluentWebElementComponent maxColor()
 {
  return maxColor.as(CustomFluentWebElementComponent.class);
 }




}
