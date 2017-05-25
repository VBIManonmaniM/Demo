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


 public class FunnelPyramidChartPage extends HighchartsPage {
 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-funnel-series.highcharts-color-undefined.highcharts-tracker > path:last-child")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend > g > g > g:first-child rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-funnel-series.highcharts-color-0 > span")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){
  return legendItemText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend > div > div > div:last-child > span")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()
 {
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend > div > div > div:nth-child(1) > span")
 protected FluentWebElement highchartsTotalTextDB;
 public CustomFluentWebElementComponent highchartsTotalTextDB()
 {
  return highchartsTotalTextDB.as(CustomFluentWebElementComponent.class);
 }

 public void testDSShowTotalDatabase(Map<String, Property> propertyMap, HighchartsPage page){
  assertThat(page.highchartsTotalTextDB().getText()).isEqualTo(propertyMap.get(Properties.DataSeriesHierarcyLables.SHOWTOTAL_DB).getExpectedValue());
  assertThat(page.highchartsTotalTextDB().getColor()).isEqualTo(propertyMap.get(Properties.DataSeriesHierarcyLables.COLOR).getExpectedValue());
  assertThat(page.highchartsTotalTextDB().getFontSize()).isEqualTo(propertyMap.get(Properties.DataSeriesHierarcyLables.FONTSIZE).getExpectedValue());

 }

}
