package testngexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1Test {
	
@Parameters("browser")
@Test
public void step1Test(String browser)
{
	WebDriver driver=null;
	switch(browser)
	{case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "ie":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
 default:
	 System.out.println("you entered wrong browser key in the property file");
	 break;
	
	}
}
}
	
	
	
	

