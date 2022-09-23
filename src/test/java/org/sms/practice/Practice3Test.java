package org.sms.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Practice3Test {
	@Test
	public void step3Test()
	{
	
		Reporter.log("3",true);
		Reporter.log("4",true);
	}

}
