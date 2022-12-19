package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.*;

import static org.junit.Assert.assertEquals;

public class SearchStepDef {

    FirstPage firstPage;

    SearchResultPage searchResultPage;

    NumberPlatePage numberPlatePage;

    ServiceCentrePage serviceCentrePage;

    MarrickvillePage marrickvillePage;

    @Given("User already on home page")
    public void userAlreadyOnHomePage() {
        firstPage.open();
    }

    @When("I input search {string}")
    public void iInputSearch(String numberplate) {
        firstPage.InputSearch(numberplate);
    }

    @And("I click button search")
    public void iClickButtonSearch() {
        firstPage.ClickButtonSearch();
    }

    @Then("I redirected to search result page")
    public void iRedirectedToSearchResultPage() {
        assertEquals("https://www.service.nsw.gov.au/search-results?q=Apply+for+a+number+plate",searchResultPage.getUrl());
        assertEquals("Search",searchResultPage.getHeaderTitle());
    }

    @When("I click Apply to collect number plates from another service centre")
    public void iClickApplyToCollectNumberPlatesFromAnotherServiceCentre() {
        searchResultPage.ClickFirstLink();
    }

    @Then("I redirected to number plates page")
    public void iRedirectedToNumberPlatesPage() {
        assertEquals("https://www.service.nsw.gov.au/transaction/apply-collect-number-plates-another-service-centre",numberPlatePage.getUrl());
        assertEquals("Apply to collect number plates from another service centre",numberPlatePage.getHeaderTitle());
    }

    @When("I click button find a service centre")
    public void iClickButtonFindAServiceCentre() {
        numberPlatePage.ClickButtonService();
    }

    @Then("I redirected to Find a Service NSW location page")
    public void iRedirectedToFindAServiceNSWLocationPage() {
        assertEquals("https://www.service.nsw.gov.au/service-centre",serviceCentrePage.getUrl());
        assertEquals("Find a Service NSW location",serviceCentrePage.getHeaderTitle());
    }

    @When("I click search by suburb, postcode or current location field")
    public void iClickSearchBySuburbPostcodeOrCurrentLocationField() {
        serviceCentrePage.ClickSearchField();
    }


    @And("I input {string}")
    public void iInput(String keyword) {
        serviceCentrePage.InputKeyword(keyword);
    }

    @And("I click button search service location")
    public void iClickButtonSearchServiceLocation() {
        serviceCentrePage.ClickButtonSearchService();
    }

    @And("I click Marrickville Service Centre")
    public void iClickMarrickvilleServiceCentre() {
        serviceCentrePage.ClickMarrickVilleService();
    }

    @Then("I redirected to Marrickville Service Centre")
    public void iRedirectedToMarrickvilleServiceCentre() {
        assertEquals("https://www.service.nsw.gov.au/service-centre/marrickville-service-centre",marrickvillePage.getUrl());
        assertEquals("Marrickville Service Centre",marrickvillePage.getHeaderTitle());
    }
}
