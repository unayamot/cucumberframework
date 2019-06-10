package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static utils.extensions.WebElementExtensions.*;

public class SearchResultsPage extends BasePage {
	@FindBy(how = How.ID, using = "links")
	public WebElement searchResultsContainer;
	
	@FindBy(how = How.CLASS_NAME, using = "result__a")
	public List<WebElement> searchResultsLinks;
	
	public void viewFirstResult() throws InterruptedException {
		assertSearchResultsDisplayed();
		selectFirstListedSearchResult();
	}
	
	private void assertSearchResultsDisplayed() {
		Assert.assertTrue(weElementIsDisplayed(searchResultsContainer));
	}
	
	private RedditPage selectFirstListedSearchResult() throws InterruptedException {
		weClick(searchResultsLinks.get(0));
		return instanceOf(RedditPage.class);
	}
}
