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


 public class BoxPlotChartPage extends HighchartsPage {

  @FindBy(css = ".highcharts-boxplot-series path.highcharts-boxplot-box")
  protected FluentWebElement boxPlotFillColor;

 public CustomFluentWebElementComponent boxPlotFillColor(){
  return boxPlotFillColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-boxplot-series path.highcharts-boxplot-median")
 protected FluentWebElement boxPlotMedianColor;

 public CustomFluentWebElementComponent boxPlotMedianColor(){
  return boxPlotMedianColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-boxplot-series path.highcharts-boxplot-stem")
 protected FluentWebElement boxPlotStemColor;

 public CustomFluentWebElementComponent boxPlotStemColor(){
  return boxPlotStemColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-boxplot-series path.highcharts-boxplot-whisker")
 protected FluentWebElement boxPlotWhiskerColor;

 public CustomFluentWebElementComponent boxPlotWhiskerColor(){
  return boxPlotWhiskerColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-boxplot-series path.highcharts-boxplot-box")
 protected FluentWebElement boxPlotSeriesColor;

 public CustomFluentWebElementComponent boxPlotSeriesColor(){
  return boxPlotSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css = ".highcharts-markers.highcharts-series-1.highcharts-scatter-series path.highcharts-point.highcharts-point-hover")
 protected FluentWebElement boxPlotOutlierColor;

 public CustomFluentWebElementComponent boxPlotOutlierColor(){
  return boxPlotOutlierColor.as(CustomFluentWebElementComponent.class);
 }



}
