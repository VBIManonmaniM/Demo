package com.visualbi.automation.pages.base;

import org.apache.commons.lang3.math.NumberUtils;
import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.WebElement;

/**
 * Created by praveenn on 1/13/2017.
 */
public class CustomFluentWebElementComponent extends FluentWebElement {

    public CustomFluentWebElementComponent(WebElement element, FluentControl control, ComponentInstantiator instantiator) {
        super(element, control, instantiator);
    }

    public String getFont(){
        return this.cssValue("font-size");
    }
    public String getText()
    {
        return this.text();
    }
    public String getFontSize()
    {
        return this.cssValue("font-size");
    }
    public String getFontFamily()
    {
        return this.cssValue("font-family").toLowerCase();
    }
    public String getColor()
    {
        return toHex(this.cssValue("color"));
    }
    public String getValue()
    {
        return this.html().toString();
    }
    public String getTextAnchor()
    {
        return this.cssValue("text-anchor");
    }
    public String getFontWeight()
    {
        if(this.cssValue("font-weight").equals("700"))
            return "bold";
        return this.cssValue("font-weight");
    }
    public String getFillColor(){return toHex(this.attribute("fill").toUpperCase());}
    public String getStrokeColor(){return toHex(this.attribute("stroke").toUpperCase());}
    public String getBorderRadiusX(){return this.attribute("rx");}
    public String getBorderRadiusY(){return this.attribute("ry");}
    public String getStrokeWidth(){return this.attribute("stroke-width");}
    public String getStrokeDashArray(){return this.attribute("stroke-dasharray");}
    public String getXValue(){return this.attribute("x");}
    public float getXValueAsFloat(){
        if(NumberUtils.isNumber(this.attribute("x")))
        return Float.parseFloat(this.attribute("x"));
    return (float) 0.00;
    }
    public String getYValue(){return this.attribute("y");}
    public float getYValueAsFloat(){ if(NumberUtils.isNumber(this.attribute("y")))
        return Float.parseFloat(this.attribute("y"));
        return (float) 0.00;}
    public String getCursor(){return this.cssValue("cursor");}
    public String getTransform(){return this.attribute("transform");}




    public String getHeight() {
        return this.attribute("height");
    }

    public String getPaddingOrWidth(String symbolWidth) {
        int textXPosition = Integer.parseInt(this.attribute("x"));
        return "" + Math.round(textXPosition - Integer.parseInt(symbolWidth));
    }

    public String getBackGroundColor() {
        return this.toHex(cssValue("background-color"));
    }

//    public void hover() {
//        this.mouseOver();
//    }
    public static String toHex(String color) {
        if(color.contains("#"))
            return color;
        String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
        int r = Integer.parseInt(numbers[0].trim());
        int g = Integer.parseInt(numbers[1].trim());
        int b = Integer.parseInt(numbers[2].trim());

        return "#" + checkLength(Integer.toHexString(r)) + checkLength(Integer.toHexString(g)) + checkLength(Integer.toHexString(b));
    }
    private static final String checkLength(String s) {

        return (s.length() == 1) ? "0" + s.toUpperCase() : s.toUpperCase();
    }
}
