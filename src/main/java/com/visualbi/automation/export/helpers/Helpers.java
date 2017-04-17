package com.visualbi.automation.export.helpers;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by praveenn on 2/9/2017.
 */
public class Helpers {

    private Handlebars handlebar;

    public Helpers(Handlebars handlebar) {
        this.handlebar = handlebar;
    }
    public Handlebars registerHelpers() {
        handlebar.registerHelper("now", new Helper<String>() {
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("E dd MM yyyy  hh:mm:ss a zzz");
                switch (arg0)
                {
                    case "DATETIME":
                        return dateFormat.format(date);
                    case "SECONDS":
                        return  Long.toString(date.getTime());

                }
                return  Long.toString(date.getTime());

            }
        });
        handlebar.registerHelper("formatApplicationName", new Helper<String>() {
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_a_zzz");
                return arg0+"_"+dateFormat.format(date);

            }
        });
        return handlebar;
    }
}
