package org.sms.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2Test {
	@Test
	public void step2test()
	{
		 String browser = System.getProperty("b");
		 String url=System.getProperty("url");
		 System.out.println(browser+url);	
		Reporter.log("2",true);
	}

}
