package com.academy.rozetka;

import com.academy.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FilterTests extends BaseTest {
    private String baseUrl = "http://rozetka.com.ua";

    @Test
    @Ignore
    public void testSlider() {
        driver.get(baseUrl);
        WebElement menuItem = driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > app-rz-main-page > div > aside > main-page-sidebar > sidebar-fat-menu > div > ul > li:nth-child(1) > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuItem).perform();
        driver.findElement(By.partialLinkText("Мониторы")).click();

        WebElement leftBtn = driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > rz-catalog > div > main > ivv-catalog > div.layout.layout_with_sidebar > aside > ivv-filter-stack > div:nth-child(3) > div > div > div > div > ivv-filter-slider > form > range-slider > div > div > button.rz-slider__range-button.rz-slider__range-button_type_left"));
        actions.moveToElement(leftBtn)
                .clickAndHold()
                .moveByOffset(15, 0)
                .perform();
    }
}
