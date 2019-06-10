package steps;

import java.util.List;

import cucumber.api.java.en.Then;
import pages.BasePage;
import pages.RedditPage;

public class ValidationSteps extends BaseSteps {
	@Then("^I can see the page title contains \"([^\"]*)\"$")
	public void i_see_the_base_page_title_contains(String expectedTitle) {
		instanceOf(BasePage.class).validatePageTitle(expectedTitle);
	}

	@Then("^I see the page Url contains \"([^\"]*)\"$")
	public void iSeeThePageUrlContains(String expectedUrl) {
		instanceOf(BasePage.class).validatePageUrl(expectedUrl);
	}

	@Then("^I see \"([^\"]*)\" in the PageSource$")
	public void iSeeInThePageSource(String expectedPageSource) {
		instanceOf(BasePage.class).validatePageSource(expectedPageSource);
	}

	@Then("^I see$")
	public void iSee(List<String> existsInPageSource) {
		instanceOf(BasePage.class).validateMultiplePageSource(existsInPageSource);
	}

	@Then("^I see the Reddit homepage$")
	public void iSeeTheRedditHomepage() throws Throwable {
		instanceOf(RedditPage.class).assertIamOnRedditPage();
	}
}
