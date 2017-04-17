package com.visualbi.test;


import com.visualbi.automation.xmlutils.biapp.BiappXStreamWriter;
import com.visualbi.automation.xmlutils.biapp.IBiappWriter;
import org.testng.annotations.Test;

/**
 * Created by praveenn on 1/10/2017.
 */
public class BiappXStreamWriterTest {
    @Test
    public  void testCreateBIAppFile(){
        IBiappWriter biappXStreamWriter= new BiappXStreamWriter();

        biappXStreamWriter.createBIAppFile("",null,"","");
        //assert if the file is created
        //assert if the xml contains the right sdk version


    }
}
