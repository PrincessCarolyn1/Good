package com.academy.automationpractice;

import com.academy.automationpractice.page.HomePage;
import com.academy.core.BaseTest;
import org.testng.annotations.Test;

public class AddressTests extends BaseTest {

    @Test
    public void addAddressTest() {
        new HomePage(driver, baseUrl)
                .goToHome()
                .clickSignIn()
                .fillEmail("oleg.kh81@gmail.com")
                .fillPassword("123qwerty")
                .clickSubmit();
    }
}
