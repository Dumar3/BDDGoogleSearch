package com.google.search.stepdefinitions;

import com.google.search.pages.BookPage;
import com.google.search.pages.GoogleHomePage;
import com.google.search.pages.GoogleResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

public class SearchBookStepDefinition {

  private static final String SEARCH_BUTTON_OPTION = "search button";
  private static final String SUGGESTIONS_LIST_OPTION = "suggestions list";

  @Page GoogleHomePage googleHomePage;
  @Page GoogleResultsPage googleResultsPage;
  @Page BookPage bookPage;

  @Given("^I am on google homepage$")
  public void openHomepage() {
    googleHomePage.open();
  }

  @When("^I search '(.*)' using (.*)$")
  public void searchItem(String bookName, String searchOption) {
    googleHomePage.enterBookName(bookName);
    if (searchOption.equals(SEARCH_BUTTON_OPTION)) {
      googleHomePage.clickSearchButton();
    }
  }

  @When("I select the first result of the search")
  public void selectFirstResultSearch() {
    googleResultsPage.selectFirstResult();
  }

  @When("I write '(.*)' into the search field")
  public void iWriteIntoTheSearchField(String string) {
    // TODO:
  }

  @Then("^the (.*) results page is dispayed$")
  public void verifyResultsPage(String string) {
    MatcherAssert.assertThat(
        "The google results page was not displayed", googleResultsPage.isResultsPageDisplayed());
  }

  @Then("^the first result is '(.*)'$")
  public void verifyFirstResult(String expectedResult) {
    MatcherAssert.assertThat(
        String.format(
            "The expected result is '%s' but was '%s'",
            expectedResult, googleResultsPage.getFirstResult()),
        expectedResult.equals(googleResultsPage.getFirstResult()));
  }

  @Then("the '(.*)' page should be displayed")
  public void verifyBookPage(String bookPageName) {
    MatcherAssert.assertThat(
        String.format(
            "The expected page name is '%s' but was '%s'", bookPageName, bookPage.getTittle()),
        bookPageName.equals(bookPage.getTittle()));
  }

  @Then("the suggestions list is dispayed")
  public void theSuggestionsListIsDispayed() {
    // TODO:
  }
}
