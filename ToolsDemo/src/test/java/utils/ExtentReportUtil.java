package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtil {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    public static void log(String message) {
        test.info(message);
    }

    public static void finalizeReport() {
        extent.flush();
    }
}
