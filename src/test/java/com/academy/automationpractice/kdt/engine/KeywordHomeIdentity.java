package com.academy.automationpractice.kdt.engine;

import com.academy.automationpractice.page.HomePage;
import org.openqa.selenium.WebDriver;

public class KeywordHomeIdentity {
    private WebDriver driver;

    public KeywordHomeIdentity(WebDriver driver) {
        this.driver = driver;
    }

    public void doAction(String action, String object, String value) {
        switch (action) {
            case "CLICK":
                click(object, value);
                break;

        }
    }

    private void click(String object, String value) {
        switch (object) {
            case "signInLink":
                new HomePage(driver, "").clickSignIn();
                break;
        }
    }
}
