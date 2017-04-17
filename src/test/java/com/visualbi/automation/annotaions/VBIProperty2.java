package com.visualbi.automation.annotaions;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by praveenn on 1/10/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface VBIProperty2 {

    String name();
    String value();
    String expectedValue() default "";

}
