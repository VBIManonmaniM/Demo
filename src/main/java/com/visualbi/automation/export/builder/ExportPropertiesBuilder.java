package com.visualbi.automation.export.builder;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.visualbi.automation.VBIConfig;
import com.visualbi.automation.export.helpers.Helpers;
import com.visualbi.automation.export.model.ExportProperties;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by praveenn on 2/9/2017.
 */
public class ExportPropertiesBuilder {

    private final String exportPropertiesTemplate = "export/export.properties";
    private ExportProperties exportProperties;

    public void writeExportProperties() throws IOException {
        Template template = new Helpers(new Handlebars()).registerHelpers().compile(exportPropertiesTemplate);
        String outputApplicationDirectoryPath= VBIConfig.EXPORT_PATH+"\\"+exportProperties.getApplicationName();
        FileUtils.writeStringToFile(new File(outputApplicationDirectoryPath+"\\"+"export.properties"),template.apply(exportProperties));
    }

    public ExportPropertiesBuilder(ExportProperties exportProperties) {
        this.exportProperties = exportProperties;
    }
}
