package utils.extensions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.selenium.Driver.browser;
import static utils.selenium.Settings.weHighlightedColor;

public class WebElementExtensions {
	
	public static String weGetAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}
	
	public static boolean weElementIsInvisible(WebElement element) {
		weWaitForSeconds().until(ExpectedConditions.invisibilityOf(element));
		return !element.isDisplayed();
	}
	
	public static void weSendKeys(WebElement element, String text, boolean clearFirst) {
		weElementIsDisplayed(element);
		if(clearFirst) weClick(element);
		element.sendKeys(text);
	}
	
	public static void wePressEnter(WebElement element) {
		element.sendKeys(Keys.RETURN);
	}
	
	public static void weClick(WebElement element) {
		weElementToBeClickable(element);
		weHighlightElement(element);
		element.click();
	}
	
	public static void weHighlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) browser();
		js.executeScript(weHighlightedColor, element);
	}
	
	public static boolean weElementToBeClickable(WebElement element) {
		weWaitForSeconds().until(ExpectedConditions.elementToBeClickable(element));
		return element.isEnabled();
	}
	
	public static boolean weElementIsDisplayed(WebElement element) {
		weWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
	
	private static int sec = 10;
	public static WebDriverWait weWaitForSeconds() {
		WebDriverWait wait = new WebDriverWait(browser(), sec);
		return wait;
	}
}
