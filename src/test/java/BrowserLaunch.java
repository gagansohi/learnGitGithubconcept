 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch 
{
	
	public static WebDriver driver;
	@Test
	public void Launch()
	{
		String driverPath=System.getProperty("user.dir")+"\\src\\test\\java\\chrome126\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	}

}
