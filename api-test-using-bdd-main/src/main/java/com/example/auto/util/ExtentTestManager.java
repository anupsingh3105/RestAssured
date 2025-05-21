package com.example.auto.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    private static ExtentReports extent;

    public static synchronized ExtentReports getInstance(String filename) {
        if (extent == null) {
            extent = ExtentManager.createInstance(filename);
        }
        return extent;
    }

    public static synchronized ExtentTest getTest() {
        return extentTestMap.get((int) (Thread.currentThread().getId()));
    }

    public static synchronized void endTest() {
        extent.flush();
    }

    public static synchronized ExtentTest startTest(String testName, String fileName) {
        extent = getInstance(fileName);
        ExtentTest test = extent.createTest(testName);
        extentTestMap.put((int) (Thread.currentThread().getId()), test);
        return test;
    }
}
