package com.visualbi.automation.pages.base;

import com.visualbi.automation.VBIConfig;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.fluentlenium.core.hook.wait.Wait;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by praveenn on 1/11/2017.
 */
@Wait(timeout = 30, timeUnit = TimeUnit.SECONDS)
public class ApplicationPage extends FluentPage {

    public void clickButton(String className)
    {
      el("."+className).click();
    }

    public CustomFluentWebElementComponent getElementByClass(String className)
    {
        return el("."+className).as(CustomFluentWebElementComponent.class);
    }

    @Override
    public String getUrl() {
        return VBIConfig.URL_PATH;
    }

}
