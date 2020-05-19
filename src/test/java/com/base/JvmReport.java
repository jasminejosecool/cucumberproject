package com.base;

	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;

	import net.masterthought.cucumber.Configuration;
	import net.masterthought.cucumber.ReportBuilder;

	public class JvmReport {
		public static void generateJvmreport(String jsonfile) {
			Configuration con = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports"),"Sample Project");
			List<String> li = new ArrayList<String>();
			li.add(jsonfile);
			ReportBuilder build = new ReportBuilder(li,con);
			build.generateReports();
			
		
		}

	}


