package com.google.search.pages;

import net.thucydides.core.pages.PageObject;

public class BookPage extends PageObject {

  public String getTittle() {
    return getDriver().getTitle();
  }
}
