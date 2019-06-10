package pages;

import static utils.selenium.Driver.browser;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	public static <T extends BasePage> T instanceOf(Class <T> clazz) {
		return PageFactory.initElements(browser(), clazz);
	}
}
