package com.visualbi.automation.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * Created by praveenn on 3/1/2017.
 */
public class BrowserLog {
   public static void writeLogToFile(LogEntries logEntries,String fileName,String folderLocation) throws IOException {
       File logFile = new File(folderLocation+"/"+fileName);
       File logFolder= new File(folderLocation);
       if(!logFolder.exists())
       {
           logFolder.mkdirs();
       }
       String logLine="";
       for (LogEntry entry : logEntries) {

            logLine = logLine+ new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage()+"\n";
           //do something useful with the data

       }
       FileUtils.write(logFile,logLine, Charset.defaultCharset());
       logFile.createNewFile();
   }
}
