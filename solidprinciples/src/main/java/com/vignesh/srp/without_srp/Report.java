package com.vignesh.srp.without_srp;

import java.util.Date;

public class Report {
    private String name;
    private String content;
    private Date createdAt;

    public Report(String name, String content) {
        System.out.println("Creating report: " + name);
        this.name = name;
        this.content = content;
        this.createdAt = new Date();
    }

    public void generateReport() {
        System.out.println("Generating report for: " + name);
        System.out.println("Report content: " + content);
        System.out.println("Generated on: " + createdAt);
    }

    public void saveReportToDb() {
        System.out.println("Saving report '" + name + "' to database...");
    }

    public void saveToFile(String fileName) {
        System.out.println("Saving report '" + name + "' to file: " + fileName);
    }

    // Optional: getter for better code structure
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
