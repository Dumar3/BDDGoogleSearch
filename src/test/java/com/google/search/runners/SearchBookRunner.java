package com.google.search.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features/search_book.feature"},
    glue = {"com.google.search.stepdefinitions"})
public class SearchBookRunner {}
