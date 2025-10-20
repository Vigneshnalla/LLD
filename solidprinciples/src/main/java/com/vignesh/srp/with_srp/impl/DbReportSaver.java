package com.vignesh.srp.with_srp.impl;

import com.vignesh.srp.with_srp.Report;
import com.vignesh.srp.with_srp.ReportSaver;

public class DbReportSaver implements ReportSaver {

    @Override
    public void saveReport(Report report) {
        System.out.println("Saving report '" + report.getName() + "' to database...");
    }
}
