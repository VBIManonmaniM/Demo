package com.visualbi.automation.reporting.helpers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import com.google.common.base.Splitter;
import org.omg.CORBA.FloatSeqHelper;

public class Helpers {
    public static int count=0;
    public static final String PROBLEM_SETTING_STATUS =
        "there was a problem setting the tooltip of the test, status might differ, investigate";

    private Handlebars handlebar;

    public Helpers(Handlebars handlebar) {
        this.handlebar = handlebar;
    }

    public Handlebars registerHelpers() {
        handlebar.registerHelper("date", new Helper<Long>() {
            public CharSequence apply(Long arg0, Options arg1) throws IOException {
                int totalSecs = (int) arg0.doubleValue() / 1000;
                int hours = totalSecs / 3600;
                int minutes = (totalSecs % 3600) / 60;
                int seconds = totalSecs % 60;
                int miliSec = (int) arg0.doubleValue() % 1000;

                return String.format("%02d h : %02d m : %02d s : %02d ms", hours, minutes, seconds, miliSec);
            }
        });
        handlebar.registerHelper("duration", new Helper<Long>() {
            public CharSequence apply(Long arg0, Options arg1) throws IOException {
                int totalSecs = (int) arg0.doubleValue() / 1000;
                int hours = totalSecs / 3600;
                int minutes = (totalSecs % 3600) / 60;
                return String.format("%02d hrs  %02d mins", hours, minutes);
            }
        });

        handlebar.registerHelper("result-color", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                return checkStatus(arg0.toLowerCase(), "info", "success2", "danger", null);
            }
        });

        handlebar.registerHelper("is-config", new Helper<Boolean>() {
            @Override
            public CharSequence apply(Boolean arg0, Options arg1) throws IOException {
                return getIsConfigApplyResult(arg0);
            }
        });

        handlebar.registerHelper("resolve-tooltip", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                return checkStatus(arg0.toLowerCase(), "This test has been skipped", "This test has passed",
                    "This test has failed", PROBLEM_SETTING_STATUS);
            }
        });

        handlebar.registerHelper("resolve-title", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                return checkStatus(arg0.toLowerCase(), "This step has been skipped", "This step has passed",
                    "This step has failed", null);
            }
        });

        handlebar.registerHelper("is-collapsed", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                return checkStatus(arg0.toLowerCase(), null, "collapse", "collapse in", null);
            }
        });
        handlebar.registerHelper("convert-param", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
                Map<String, String> map = splitToMap(arg0);
                return map.values().toString();
            }
        });
        handlebar.registerHelper("format-class", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {

                return arg0.replace("com.visualbi.automation","");
            }
        });
        handlebar.registerHelper("format-testmethod", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {

                return arg0.replace("test","");
            }
        });
        handlebar.registerHelper("filename", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {
               // System.out.println(arg0);
               // System.out.println(arg1.param(0).toString());


                return arg0.trim().toUpperCase().replace("TEST","")+"_"+arg1.param(0).toString();
            }
        });
        handlebar.registerHelper("if_passed", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options arg1) throws IOException {

                 if(arg0.equals("PASS"))
                     return "checked";
                return "";

            }
        });
        handlebar.registerHelper("if_eq", new Helper<String>() {
            @Override
            public CharSequence apply(String arg0, Options options) throws IOException {

                Object obj2 = options.param(0);
                return arg0.equals(obj2) ? options.fn() : options.inverse();

            }
        });
        handlebar.registerHelper("if_critical", new Helper<Integer>() {
            @Override
            public CharSequence apply(Integer arg0, Options options) throws IOException {


                if(arg0>70)
                    return options.fn();
                return options.inverse();

            }
        });
        handlebar.registerHelper("if_first", new Helper<Object>() {
            @Override
            public CharSequence apply(Object arg0, Options options) throws IOException {


                if(count==0)
                    return options.fn();
                return options.inverse();

            }
        });
        handlebar.registerHelper("listLength", new Helper<Object>() {
            @Override
            public CharSequence apply(Object arg0, Options arg1) throws IOException {
                //System.out.println(arg0);
                // System.out.println(arg1.param(0).toString());


                return "";
            }
        });

        handlebar.registerHelper("count", new Helper<Object>() {
                    @Override
                    public CharSequence apply(Object context, Options options) throws IOException {
                        count++;
                        return count+"";
                    }
                });
        handlebar.registerHelper("now", new Helper<Object>() {
            @Override
            public CharSequence apply(Object context, Options options) throws IOException {
                Calendar cal = Calendar.getInstance();
                Date date = cal.getTime();
                TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
                DateFormat dateFormatDateFolderName= new SimpleDateFormat("dd-MM-yyyy hh:mm a");
                dateFormatDateFolderName.setTimeZone(istTimeZone);
                String now = dateFormatDateFolderName.format(date);

                return now + " IST";
            }
        });
        handlebar.registerHelper("data-foramt", new Helper<String>() {
            @Override
            public CharSequence apply(String context, Options options) throws IOException {
                Date date = null;

                try {
                    DateFormat dateFormat= new SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss'Z'");
                    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    date=dateFormat.parse(context);

                } catch (ParseException e) {
                    e.printStackTrace();
                }

                TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
                DateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy HH:mm");
                dateFormat.setTimeZone(istTimeZone);


                return dateFormat.format(date);
            }
        });

        return handlebar;
    }

    private CharSequence getIsConfigApplyResult(Boolean arg0) {
        if (arg0) {
            return "collapseMagic2 collapse";
        } else {
            return "nada";
        }
    }

    private CharSequence checkStatus(String arg0, String retValue1, String retValue2, String retValue3,
        String retValue4) {
        switch (arg0.toUpperCase()) {
            case Constants.SKIPPED:
                return retValue1;
            case Constants.FAILED:
                return retValue3;
            case Constants.PASSED:
                return retValue2;
            default:
                break;
        }
        return retValue4 == null ? Constants.UNDEFINED : retValue4;
    }

    private Map<String, String> splitToMap(String in) {
        return Splitter.on(", ").withKeyValueSeparator("=").split(in);
    }
}
