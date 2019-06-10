package steps;

import cucumber.api.java.en.When;
import pages.SearchResultsPage;

public class SendKeysSteps extends BaseSteps {


	@When("^I search for \"([^\"]*)\"$")
	public void iSearchFor(String searchTerm) throws Throwable {
		instanceOf(SearchResultsPage.class).searchFor(searchTerm);
	}
}
