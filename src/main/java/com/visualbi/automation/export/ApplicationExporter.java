package com.visualbi.automation.export;

import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.export.builder.ExportPropertiesBuilder;
import com.visualbi.automation.export.model.ExportProperties;
import com.visualbi.automation.utils.FolderZipper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by praveenn on 2/9/2017.
 */
public class ApplicationExporter {
    String applicationName;
    String testName;
    String platformVersion;

    public ApplicationExporter(String testName, String applicationName,String platformVersion) {
        this.testName = testName;
        this.applicationName = applicationName;
        this.platformVersion = platformVersion;
    }

    public void exportBiapp() throws IOException {
        ExportProperties exportProperties=new ExportProperties(applicationName+"_"+testName,platformVersion);
        ExportPropertiesBuilder exportPropertiesBuilder=new ExportPropertiesBuilder(exportProperties);
        String outputApplicationDirectoryPath= VBIConfig.EXPORT_PATH+"\\"+exportProperties.getApplicationName();
        File outputApplicationDirectory=new File(outputApplicationDirectoryPath);
        if (!outputApplicationDirectory.exists()) {
            outputApplicationDirectory.mkdir();
        }
        exportPropertiesBuilder.writeExportProperties();
        File soucreBaipp=new File(VBIConfig.ANALYSIS_WORKSPACE_PATH +"\\"+applicationName+"\\"+"content.biapp");
        File outputBiapp=new File(outputApplicationDirectoryPath+"\\"+"content.biapp");
        FileUtils.copyFile(soucreBaipp,outputBiapp);
        FolderZipper folderZipper =new FolderZipper(outputApplicationDirectoryPath+".zip",outputApplicationDirectoryPath);
        folderZipper.zipIt();
        FileUtils.deleteDirectory(outputApplicationDirectory);

    }


}
