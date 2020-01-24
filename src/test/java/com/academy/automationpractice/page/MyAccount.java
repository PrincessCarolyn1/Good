package com.academy.automationpractice.page;

import com.academy.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {
    @FindBy(css = "div.header_user_info > a > span")
    private WebElement userName;

    @FindBy(css = "a.logout")
    private WebElement signOut;

    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userName.getText().trim();
    }

    public LoginPage logout() {
        signOut.click();
        return new LoginPage(driver);
    }
}
