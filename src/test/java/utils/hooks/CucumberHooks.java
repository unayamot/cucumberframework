package utils.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.selenium.DriverController;

public class CucumberHooks {
	
	@Before("@Chrome")
	public void beforeChrome() {
		DriverController.instance.startChrome("--disable-extensions");
	}

	@Before("@Firefox")
	public void beforeFirefox() {
		DriverController.instance.startFirefox("--diable-extensions");
	}

	@Before("@HeadlessChrome")
	public void beforeChromeHeadless() {
		DriverController.instance.startChrome("--headless");
	}
	
	@Before("@HeadlessFirefox")
	public void beforeFirefoxHeadless() {
		DriverController.instance.startFirefox("--headless");
	}
	
	@After
	public void stopWebDriver() {
		DriverController.instance.stopWebDriver();
	}
}
