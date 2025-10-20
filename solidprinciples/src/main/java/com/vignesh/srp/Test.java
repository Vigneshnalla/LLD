package com.vignesh.srp;

import com.vignesh.srp.with_srp.ReportSaver;
import com.vignesh.srp.with_srp.impl.DbReportSaver;
import com.vignesh.srp.with_srp.impl.FileReportSaver;
import com.vignesh.srp.without_srp.Report;

public class Test {
    public static void main(String[] args) {

        // ----- Without SRP -----
        Report report = new Report("sample","Hello this is a sample report");
        report.generateReport();
        report.saveReportToDb();
        report.saveToFile("sample_report.txt");

        System.out.println("\n----- With SRP -----");

        // ----- With SRP -----
        com.vignesh.srp.with_srp.Report report1 = new com.vignesh.srp.with_srp.Report("sample1","Hello this is a sample report");
        report1.generateReport();

        // Save using DB implementation
        ReportSaver dbSaver = new DbReportSaver();
        dbSaver.saveReport(report1);

        // Save using File implementation
        ReportSaver fileSaver = new FileReportSaver("sample1_report.txt");
        fileSaver.saveReport(report1);
    }
}
