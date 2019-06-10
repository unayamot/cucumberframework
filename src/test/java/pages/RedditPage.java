package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static utils.extensions.WebElementExtensions.*;

public class RedditPage extends SearchResultsPage {
	@FindBy(how = How.ID, using = "SHORTCUT_FOCUSABLE_DIV")
	private WebElement redditContentArea;
	
	public void assertIamOnRedditPage() {
		weElementIsDisplayed(redditContentArea);
		validatePageTitle("reddit:");
		validatePageUrl("https://www.reddit.com");
		validatePageSource("Reddit");
	}
}
