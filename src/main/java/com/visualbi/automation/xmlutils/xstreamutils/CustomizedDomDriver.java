package com.visualbi.automation.xmlutils.xstreamutils;

import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveenn on 3/2/2017.
 */
public class CustomizedDomDriver extends DomDriver
{
    /**The list that contains the field names that would contain a CDATA in the xml.*/
    private static final List CDATA_FIELDS;

    static
    {
        CDATA_FIELDS = new ArrayList();
        CDATA_FIELDS.add("bi:value");
    }


    @Override
    public HierarchicalStreamWriter createWriter(Writer out)
    {
        return new PrettyPrintWriter(out,new NoNameCoder())
        {
            boolean cdata = false;

            public void startNode(String name)
            {
                super.startNode(name);
                cdata = CDATA_FIELDS.contains(name);

            }

            protected void writeText(QuickWriter writer, String text)
            {
                if (cdata)
                {
                    writer.write("<![CDATA[");  writer.write(text);  writer.write("]]>");

                }
                else
                {
                    writer.write(text);
                }
            }


        };

    }




}