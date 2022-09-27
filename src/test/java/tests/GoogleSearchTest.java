package tests;

import org.junit.jupiter.api.Test;
import pages.GoogleHomePage;
import pages.GoogleSearchPage;
import utils.PropertiesHandling;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest {

    private final String googleHomepageUrl = PropertiesHandling.getGoogleHomepageUrl();
    @Test
    public void userCanSearch(){
        open(googleHomepageUrl);
        new GoogleHomePage().acceptCookies().searchFor("producthunt");
        GoogleSearchPage results = new GoogleSearchPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Product Hunt - The best products in tech."));

    }
}
