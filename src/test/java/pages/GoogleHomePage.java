package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleHomePage{

    private SelenideElement searchField = $(byName("q"));
    private SelenideElement cookiesAcceptanceButton = $("#L2AGLb");
    private SelenideElement signInButton = $(By.xpath("//a[contains(@href, 'accounts.google.com')]"));

    @Step("User can open a Google Homepage.")
    public GoogleHomePage open() {
        Selenide.open("/");
        return this;
    }
    @Step("User can put text into search field and click search button.")
    public GoogleSearchPage searchFor(String text) {
        searchField.val(text).pressEnter();
        return new GoogleSearchPage();
    }

    @Step("User can accept cookies.")
    public GoogleHomePage acceptCookies(){
        cookiesAcceptanceButton.click();
        return this;
    }

    @Step("User can click Sign In button and will be redirected to Service Login Page.")
    public GoogleServiceLoginPage clickSignInButton(){
        signInButton.click();
        return new GoogleServiceLoginPage();
    }

}
