package com.google.search.stepdefinitions;

import com.google.search.pages.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fluentlenium.core.annotation.Page;

public class SearchBookStepDefinition {

  @Page GoogleHomePage googleHomePage;

  @Given("^I am on google homepage$")
  public void openHomepage() {
    googleHomePage.open();
  }

  @When("^I search '(.*)' using (.*)$")
  public void searchItem(String string, String string2) {
    // TODO:
  }

  @When("I select the first result of the search")
  public void selectFirstResultSearch() {
    // TODO:
  }

  @When("I write '(.*)' into the search field")
  public void iWriteIntoTheSearchField(String string) {
    // TODO:
  }

  @Then("^the (.*) results page is dispayed$")
  public void verifyResultsPage(String string) {
    // TODO:
  }

  @Then("^the first result is '(.*)'$")
  public void verifyFirstResult(String string) {
    // TODO:
  }

  @Then("the '(.*)' page should be displayed")
  public void verifyBookPage(String string) {
    // TODO:
  }

  @Then("the suggestions list is dispayed")
  public void theSuggestionsListIsDispayed() {
    // TODO:
  }
}
