package com.google.search.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class GoogleResultsPage extends PageObject {

  @FindBy(id = "result-stats")
  WebElementFacade lblResultStats;

  @FindBy(xpath = "//div[@id='rso']/div[1]//h3")
  WebElementFacade lblFirstResult;

  @FindBy(xpath = "//div[@id='rso']/div[1]/div/div[@class='r']/a")
  WebElementFacade lnkFirstResult;

  public boolean isResultsPageDisplayed() {
    return lblResultStats.isDisplayed();
  }

  public String getFirstResult() {
    return lblFirstResult.waitUntilPresent().getText();
  }

  public void selectFirstResult() {
    lnkFirstResult.waitUntilClickable().click();
  }
}
