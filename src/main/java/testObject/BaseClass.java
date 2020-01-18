package testObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	//open browser
	
	public static WebDriver driver;
	public String browser="chrome";
	
	public BaseClass() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\NEETHI\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(	"http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public boolean elementFound(Object object) {
	
	boolean res = false;
		try {
			res=((WebElement) object).isDisplayed();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
		
			public String getTitle() {
				return driver.getTitle();


}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"Driver Server Path for Chrome");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/