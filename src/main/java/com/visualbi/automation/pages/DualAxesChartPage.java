package com.visualbi.automation.pages;

import com.visualbi.automation.pages.base.CustomFluentWebElementComponent;
import com.visualbi.automation.pages.base.HighchartsPage;

/**
 * Created by Code Generation Tool on Fri Jan 13 04:23:56 CST 2017.
 */


 public class DualAxesChartPage extends HighchartsPage {

 public CustomFluentWebElementComponent plotBand(){
  return $(".highcharts-plot-band").get(2).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLine(){
  //return plotLine.as(CustomFluentWebElementComponent.class);
  return $(".highcharts-plot-lines-5 path").get(2).as(CustomFluentWebElementComponent.class);
 }
 public CustomFluentWebElementComponent plotLineLabel(){
  if($(".highcharts-plot-line-label").size()>2)
   return $(".highcharts-plot-line-label").get(2).as(CustomFluentWebElementComponent.class);

  return $(".highcharts-plot-line-label").get(0).as(CustomFluentWebElementComponent.class);
 }
}
