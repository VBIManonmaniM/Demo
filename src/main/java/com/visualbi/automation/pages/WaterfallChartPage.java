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
public class WaterfallChartPage extends HighchartsPage {

    @FindBy(css=".highcharts-series.highcharts-series-0.highcharts-waterfall-series.highcharts-color-0.highcharts-tracker > rect:nth-child(1)")
    protected FluentWebElement highchartsDataSeriesColor;
    public CustomFluentWebElementComponent highchartsDataSeriesColor(){
        return highchartsDataSeriesColor.as(CustomFluentWebElementComponent.class);
    }
    public void testDataSeriesColor(Map<String, Property> propertyMap, HighchartsPage page) throws InterruptedException{
        String  dsActual= page.highchartsDataSeriesColor().getFillColor();
        String dsExpected =propertyMap.get(Properties.DataSeries.SERIES_COLOR).getExpectedValue();
     //   assertThat(page.legendItem().getText()).isEqualTo(propertyMap.get(Properties.Legend.LEGEND_ITEM_TEXT).getExpectedValue());
   //     assertThat(page.legendItem().getFontSize()).isEqualTo(propertyMap.get(Properties.Legend.LEGEND_ITEM_FONT_SIZE).getExpectedValue());
        assertThat(dsActual).isEqualTo(dsExpected);

    }
}
