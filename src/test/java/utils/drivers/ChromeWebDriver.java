package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeWebDriver {
	private static WebDriver driver;
	
	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().version("75.0.3770.8").setup();
	}
	
	public static WebDriver loadChromeDriver(String chromeArgument) {
		setupChromeDriver();
		
		ChromeDriverService driverService = ChromeDriverService.createDefaultService();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments(chromeArgument);
		
		driver = new ChromeDriver(driverService, options);
		
		return driver;
	}
}
