package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GoogleHomePage {

    private SelenideElement searchField = $(byName("q"));

    public GoogleSearchPage searchFor(String text) {
        searchField.val(text).pressEnter();
        return new GoogleSearchPage();
    }

}
