package com.academy.automationpractice;

import com.academy.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MixedTests extends BaseTest {

    @Test
    @Ignore
    public void testSearchAndSort() throws InterruptedException {
        // Попасть на главную страницу
        driver.get(baseUrl);
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();

        driver.findElement(By.cssSelector("#list > a")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.attributeToBe(
                        By.id("list"), "class", "selected"
                ));
        // Сортировка
        Select select = new Select(driver.findElement(By.id("selectProductSort")));
        select.selectByValue("name:desc");

        // Подождать

        // Проверки
//        Thread.sleep(3000);
        WebElement titleElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div > h5 > a"));
        String titleText = titleElement.getText().trim();
        WebElement priceElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.right-block > div > div > span.price.product-price"));
        String priceText = priceElement.getText().trim();

        Assert.assertEquals(titleText, "Printed Summer Dress");
        Assert.assertEquals(priceText, "$28.98");
    }
}
