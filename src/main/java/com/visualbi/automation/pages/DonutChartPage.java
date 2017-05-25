package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class DonutChartPage extends HighchartsPage {
 @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-pie-series.highcharts-color-undefined.highcharts-tracker > path:nth-child(1)")
 protected FluentWebElement highchartsDataSeriesColor;
 public CustomFluentWebElementComponent highchartsDataSeriesColor()    {        return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);    }

 @FindBy(css=".highcharts-label.highcharts-data-label.highcharts-data-label-color-0.highcharts-drilldown-data-label > text > tspan")
 protected FluentWebElement highchartsHierarchyLabel;
 public CustomFluentWebElementComponent highchartsHierarchyLabel()  {      return highchartsHierarchyLabel.as(CustomFluentWebElementComponent.class);  }

 @FindBy(css=".highcharts-legend-item.highcharts-pie-series.highcharts-color-9 > span")
 protected FluentWebElement highchartsTotalText;
 public CustomFluentWebElementComponent highchartsTotalText()    {       return highchartsTotalText.as(CustomFluentWebElementComponent.class);    }


}
