package tests;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GoogleHomePage;
import pages.GoogleSearchPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleHomepageTest extends GoogleBaseTest {

    private final String googleHomepageTitle = "Google";
    GoogleHomePage googleHomePage;
    GoogleSearchPage googleSearchResultsPage = new GoogleSearchPage();

    @BeforeEach
    public void openHomePage(){
        googleHomePage = new GoogleHomePage();
        googleHomePage.open();
    }
    @Test
    @DisplayName("Google Homepage has correct tittle.")
    public void pageUrlAndTitleTest() {
        googleHomePage.open();

        //Verify page tittle
        String title = title();
        assertEquals(googleHomepageTitle, title);
    }

    @Test
    @DisplayName("Sign in button on Google homepage correctly redirect user to service login page.")
    public void signInOptionTest() {
        googleHomePage.acceptCookies().clickSignInButton();
    }
}
