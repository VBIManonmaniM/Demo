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


 public class FunnelPyramidDrilldownChartPage extends HighchartsPage {

 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-funnel-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(1)")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor(){
  return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend > g > g > g:nth-child(1) > rect")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem(){
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-funnel-series.highcharts-color-0 > span")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){
  return legendItemText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-funnel-series.highcharts-color-9 > span")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()
 {
  return highchartsTotalText.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend > div > div > div:nth-child(1) > span")
 protected FluentWebElement highchartsHierarchyLabel;

 public CustomFluentWebElementComponent highchartsHierarchyLabel()    {       return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);    }

 public void testDataSeriesLabels(Map<String, Property> propertyMap, HighchartsPage page){
  page.generateTooltip();
  CustomFluentWebElementComponent dataSeriesLabel = page.toolTipText();
  //tooltip.getText()


 // CustomFluentWebElementComponent dataSeriesLabel = page.legendItemText();
  assertThat(dataSeriesLabel.getText()).isEqualTo(propertyMap.get(Properties.Datalabel.TEXT).getExpectedValue());
  assertThat(dataSeriesLabel.getColor()).isEqualTo(propertyMap.get(Properties.Datalabel.COLOR).getExpectedValue());
  assertThat(dataSeriesLabel.getFontSize()).isEqualTo(propertyMap.get(Properties.Datalabel.FONTSIZE).getExpectedValue());
 }
}
