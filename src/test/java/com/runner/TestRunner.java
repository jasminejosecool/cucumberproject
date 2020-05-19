package com.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Features\\login.feature"},glue={"com.stepdefinition"},dryRun=false,
plugin = {"pretty", "json:src\\test\\resources\\Reports\\tobireport.json"},monochrome = true)
public class TestRunner {

@AfterClass
public static void afterTestRunner() {
JvmReport.generateJvmreport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\tobireport.json");
}


}
