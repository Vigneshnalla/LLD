package com.vignesh.srp.with_srp.impl;

import com.vignesh.srp.with_srp.Report;
import com.vignesh.srp.with_srp.ReportSaver;

public class FileReportSaver implements ReportSaver {

    private String fileName;

    public FileReportSaver(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void saveReport(Report report) {
        System.out.println("Saving report '" + report.getName() + "' to file: " + fileName);
    }
}
