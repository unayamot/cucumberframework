package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxWebDriver {
	private static WebDriver driver;
	
	private static void setupFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
	}
	
	public static WebDriver laodFirefoxDriver(String firefoxArgument) {
		setupFirefoxDriver();
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments(firefoxArgument);
		
		driver = new FirefoxDriver(options);
		return driver;
	}
}
