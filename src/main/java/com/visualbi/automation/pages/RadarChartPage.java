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


 public class RadarChartPage extends HighchartsPage {

 @FindBy(css =".highcharts-series-2 .highcharts-point")
 protected FluentWebElement highChartsPoint;

 public CustomFluentWebElementComponent highChartsPoint()
 {
  return highChartsPoint.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-bar-series.highcharts-color-undefined.highcharts-dense-data.highcharts-tracker > path:nth-child(9)")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > span")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){
  return legendItemText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-axis-labels.highcharts-xaxis-labels > span:nth-child(10)")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()
 {
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-bar-series.highcharts-color-undefined.highcharts-series-0 > span")
 protected FluentWebElement dataSeriesLabel;

 public CustomFluentWebElementComponent dataSeriesLabel()
 {
  return dataSeriesLabel.as(CustomFluentWebElementComponent.class);
 }

 public void testDataSeriesLabels(Map<String, Property> propertyMap, HighchartsPage page){
  CustomFluentWebElementComponent dataSeriesLabel = page.dataSeriesLabel();
  assertThat(dataSeriesLabel.getText()).isEqualTo(propertyMap.get(Properties.Datalabel.TEXT).getExpectedValue());
  assertThat(dataSeriesLabel.getColor()).isEqualTo(propertyMap.get(Properties.Datalabel.COLOR).getExpectedValue());
  assertThat(dataSeriesLabel.getFontSize()).isEqualTo(propertyMap.get(Properties.Datalabel.FONTSIZE).getExpectedValue());
 }
}
