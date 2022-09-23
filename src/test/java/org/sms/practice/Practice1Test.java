package org.sms.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1Test {
@Test
public void step1Test()
{
	 String browser = System.getProperty("b");
	 String url=System.getProperty("url");
	 System.out.println(browser+url);
	Reporter.log("1",true);
}
}
