package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class LineChartPage extends HighchartsPage {

 @FindBy(css="g.highcharts-axis-labels:nth-child(21) > text:nth-child(2) > tspan:nth-child(1)")
 protected FluentWebElement axisLabel;
 public CustomFluentWebElementComponent axisLabel(){
  return axisLabel.as(CustomFluentWebElementComponent.class);
 }
}
