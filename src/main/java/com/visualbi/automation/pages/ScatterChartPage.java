package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class ScatterChartPage extends HighchartsPage {

 @FindBy(css=".highcharts-markers.highcharts-series-0.highcharts-scatter-series.highcharts-color-undefined.highcharts-tracker > path.highcharts-point")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor()    {        return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);    }

 @FindBy(css=".highcharts-legend-item.highcharts-scatter-series.highcharts-color-undefined.highcharts-series-0 > path.highcharts-point")
 protected FluentWebElement legendItem;
 public CustomFluentWebElementComponent legendItem()
 {
  return legendItem.as(CustomFluentWebElementComponent.class);
 }

 @FindBy(css=".highcharts-legend-item.highcharts-scatter-series.highcharts-color-undefined.highcharts-series-0 > span")
 protected FluentWebElement legendItemText;
 public CustomFluentWebElementComponent legendItemText(){    return legendItemText.as(CustomFluentWebElementComponent.class);    }

 @FindBy(css=".highcharts-data-labels.highcharts-series-0.highcharts-scatter-series.highcharts-color-undefined.highcharts-tracker > g > text > tspan")
 protected FluentWebElement highchartsHierarchyLabel;
 public CustomFluentWebElementComponent highchartsHierarchyLabel()  {      return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);  }

 @FindBy(css=".highcharts-legend-item.highcharts-scatter-series.highcharts-color-undefined.highcharts-series-9 > text > tspan")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()    {       return highchartsTotalText.as(CustomFluentWebElementComponent.class);    }


}
