package com.google.search.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {

  @FindBy(name = "q")
  WebElementFacade txtSearch;

  @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']/center/input[@name='btnK']")
  WebElementFacade btnSearch;

  @FindBy(xpath = "//div[@class='UUbT9' and (@style='display:none' or @style='display: none;')]")
  WebElementFacade cmbSuggestionsListUndisplayed;

  @FindBy(css = "ul.erkvQe > :first-child > div > div.sbtc")
  WebElementFacade firstOptionSuggestionsList;

  public void enterBookName(String bookName) {
    txtSearch.waitUntilPresent().type(bookName);
  }

  public void clickSearchButton() {
    JavascriptExecutor executor = (JavascriptExecutor) getDriver();
    executor.executeScript("arguments[0].click()", btnSearch);
  }

  public boolean isSuggestionsListUndisplayed() {
    return cmbSuggestionsListUndisplayed.isCurrentlyEnabled();
  }

  public void selectFirstOptionSuggestionsList() {
    firstOptionSuggestionsList.waitUntilClickable().click();
  }
}
