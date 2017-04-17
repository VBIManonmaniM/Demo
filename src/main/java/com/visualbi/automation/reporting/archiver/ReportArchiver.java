package com.visualbi.automation.reporting.archiver;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.utils.FolderZipper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by praveenn on 2/14/2017.
 */
public class ReportArchiver {
    public static void archiveReport(String dateString,String environment) throws ParseException, IOException {

        File archiveFolder =new File(VBIConfig.archiveFolderPath +"/"+getArchiveDirectory(dateString,environment,"folder"));
            archiveFolder.mkdirs();
        File testOutputFolder=new File(VBIConfig.TEST_OUTPUT);

        FileUtils.copyDirectory(testOutputFolder,archiveFolder);


        FolderZipper folderZipper=new FolderZipper(VBIConfig.ZIP_ARCHIVE_FOLDER_PATH+"/"+getArchiveDirectory(dateString,environment,"zip")+".zip",VBIConfig.TEST_OUTPUT);
         File  zipArchiveFolder=new File(VBIConfig.ZIP_ARCHIVE_FOLDER_PATH);
            zipArchiveFolder.mkdirs();
        folderZipper.zipIt();


    }

    public static String getArchiveDirectory(String dateString,String environment,String type) throws ParseException {
        Date date = null;
        DateFormat dateFormat= new SimpleDateFormat("yyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        date=dateFormat.parse(dateString);



        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        DateFormat dateFormatDateFolderName= new SimpleDateFormat("dd-MM-yyyy");
        dateFormatDateFolderName.setTimeZone(istTimeZone);
        String dateFolderName=dateFormatDateFolderName.format(date);

        DateFormat timeFormatTimeFolderName= new SimpleDateFormat("hh_mm_ss_a");
        timeFormatTimeFolderName.setTimeZone(istTimeZone);
        String timeFolderName=timeFormatTimeFolderName.format(date);
        if(type.equals("folder"))
            return (dateFolderName+"/"+timeFolderName+"("+environment+")").replaceAll(" ","_");
        DateFormat zipArchiveNameForamt= new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss_a");
        zipArchiveNameForamt.setTimeZone(istTimeZone);
        String zipArchiveName=zipArchiveNameForamt.format(date);
        return (zipArchiveName+"("+environment+")").replaceAll(" ","_");
    }
}
