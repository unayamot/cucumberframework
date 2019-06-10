package steps;

import cucumber.api.java.en.And;
import pages.SearchResultsPage;

public class ReturnClickSteps extends BaseSteps {


	@And("^I view the first result$")
	public void iViewTheFirstResult() throws Throwable {
		instanceOf(SearchResultsPage.class).viewFirstResult();
	}
}
