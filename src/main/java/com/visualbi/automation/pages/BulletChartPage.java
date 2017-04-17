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
}
