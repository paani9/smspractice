package org.sms.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Practice3Test {
	@Test
	public void step3Test()
	{
		 String browser = System.getProperty("b");
		 String url=System.getProperty("url");
		 System.out.println(browser+url);
		Reporter.log("3",true);
	}

}
