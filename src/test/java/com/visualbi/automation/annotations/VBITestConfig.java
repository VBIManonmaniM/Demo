package com.visualbi.automation.annotaions;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Created by praveenn on 1/10/2017.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface VBITestConfig {

    VBIProperty[] properties() default {};
    VBIProperty2[] properties2() default {};
    String testType() default "propertyTest";
    String dataSource() default  "Mul Mes 1 Dim";
}
