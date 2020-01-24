package com.academy.automationpractice;

import com.academy.automationpractice.page.HomePage;
import com.academy.automationpractice.page.LoginPage;
import com.academy.core.AssertWithLogging;
import com.academy.core.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginTests extends BaseTest {
    private final static Logger LOG = LogManager.getLogger(LoginTests.class.getName());

    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String expectedErrMsg) {
//        LOG.info("start testIncorrectLogin");
//        driver.get(baseUrl);
//        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
//        signInButton.click();
//        driver.findElement(By.id("email")).click();
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys(login); // "qwerty"
//        driver.findElement(By.id("passwd")).click();
//        driver.findElement(By.id("passwd")).clear();
//        driver.findElement(By.id("passwd")).sendKeys(password);
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();

        // 1 способ - длинный
//        HomePage homePage = new HomePage(driver, baseUrl);
//        homePage = homePage.goToHome();
//        LoginPage loginPage = homePage.clickSignIn();
//        loginPage = loginPage.fillEmail(login);
//        loginPage = loginPage.fillPassword(password);
//        loginPage = loginPage.clickSubmit();
//        String actualErrMsg = loginPage.getErrMsg();
//
//        Assert.assertEquals(actualErrMsg, expectedErrMsg);

        // 2 способ - длинный
        LoginPage loginPage = new HomePage(driver, baseUrl)
                .goToHome()
//                .then()
                .clickSignIn()
                .fillEmail(login)
//                .and()
                .fillPassword(password)
                .clickSubmit();

        String actualErrMsg = loginPage.getErrMsg();
        AssertWithLogging.assertEquals(actualErrMsg, expectedErrMsg);

//        LOG.info("finished testIncorrectLogin");
    }

    @DataProvider(name = "incorrectAuthDataProvider")
    public Object[][] incorrectAuthDataProvider() throws IOException {
        String file = properties.getProperty("data.dir") + "/incorr_auth_test_data.csv";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> data = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().startsWith("#"))
                data.add(line);
        }
        br.close();
        fr.close();

        LOG.debug("****List****");
        LOG.debug(data);

        Object[][] result = new Object[data.size()][3];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i).split(",");
        }
        LOG.debug("****Array****");
        LOG.debug(Arrays.deepToString(result));
        return result;
    }
}
