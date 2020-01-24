package com.academy.core;

import com.academy.core.listener.WebDriverEventListenerImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private final static Logger LOG = LogManager.getLogger(BaseTest.class.getName());

    protected EventFiringWebDriver driver;
    protected String baseUrl;
    protected Properties properties;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) throws IOException {
        properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        baseUrl = properties.getProperty("baseUrl");
        // Инициализируем драйвер
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
                driver = new EventFiringWebDriver(new ChromeDriver());
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("firefox.driver"));
                driver = new EventFiringWebDriver(new FirefoxDriver());
                break;

            case "safari":
                driver = new EventFiringWebDriver(new SafariDriver());
                break;
        }

        driver.register(new WebDriverEventListenerImpl(properties.getProperty("screenshot.dir")));

        // Неявное ожидание (Implicit Waits)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod(Method method, Object[] params) {
        LOG.info("Start test {} with parameters {}",
                method.getName(), Arrays.toString(params));
    }

    @AfterMethod
    public void afterMethod(Method method) {
        LOG.info("Finished test {}",
                method.getName());
    }

}
