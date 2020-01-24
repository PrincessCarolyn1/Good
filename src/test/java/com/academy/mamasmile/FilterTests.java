package com.academy.mamasmile;

import com.academy.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FilterTests extends BaseTest {
    private String baseUrl = "http://mamasmile.com.ua/products/category/19152";

    @Test
    public void testSlider() throws InterruptedException {
        driver.get(baseUrl);
        Actions actions = new Actions(driver);

        WebElement leftBtn = driver.findElement(By.cssSelector("#catalog_price_filter > div > div.noUi-origin.noUi-connect > div"));
        WebElement leftInput = driver.findElement(By.id("catalog_price_filter_min_cost"));
        while (getValue(leftInput) < 300) {
            actions.moveToElement(leftBtn)
                    .clickAndHold()
                    .moveByOffset(1, 0)
                    .release()
                    .build()
                    .perform();
        }
        Thread.sleep(5000);
    }

    private int getValue(WebElement element) {
        return Integer.valueOf(element.getAttribute("value"));
    }
}
