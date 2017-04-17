package com.visualbi.automation.utils;

/**
 * Created by arulkumars on 7/28/2016.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FolderZipper {
    private  String outputZipFile;
    private  String sourceFolder;
    List<String> fileList;



    public void zipIt() throws IOException {
        byte[] buffer = new byte[1024];
        this.generateFileList(new File(sourceFolder));
            FileOutputStream fos = new FileOutputStream(outputZipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (String file : this.fileList) {

                ZipEntry ze = new ZipEntry(file);
                zos.putNextEntry(ze);

                FileInputStream in =
                        new FileInputStream(sourceFolder + File.separator + file);
                int len;
                while ((len = in.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }
                in.close();
            }
            zos.closeEntry();

            zos.close();

        }

    /**
     * Traverse a directory and get all files,
     * and add the file into fileList
     *
     * @param node file or directory
     */
    public void generateFileList(File node) {


        if (node.isFile()) {
            fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
        }

        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename : subNote) {
                generateFileList(new File(node, filename));
            }
        }

    }

    /**
     * Format the file path for zip
     *
     * @param file file path
     * @return Formatted file path
     */
    private String generateZipEntry(String file) {
        return file.substring(sourceFolder.length() + 1, file.length());
    }


    public FolderZipper(String outputZipFile, String sourceFolder) {
        this.outputZipFile = outputZipFile;
        this.sourceFolder = sourceFolder;
        fileList = new ArrayList<String>();
    }
}
