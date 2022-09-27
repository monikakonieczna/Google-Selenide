package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleHomepageTest {

    private final String googleHomepageUrl = "https://www.google.com/";
    private final String googleHomepageTitle = "Google";

    @Test
    public void PageUrlAndTitleTest(){
        //Open page url
        open(googleHomepageUrl);

        //Verify page url
        String url = WebDriverRunner.url();
        assertEquals(googleHomepageUrl, url);

        //Verify page tittle
        String title = title();
        assertEquals(googleHomepageTitle, title);
    }
}
