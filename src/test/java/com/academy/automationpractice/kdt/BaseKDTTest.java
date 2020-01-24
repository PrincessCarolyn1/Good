package com.academy.automationpractice.kdt;

import com.academy.automationpractice.kdt.engine.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BaseKDTTest {
    protected static final Logger LOG = LogManager.getLogger(BaseKDTTest.class);

    private KeywordIdentity baseKW;
    private KeywordHomeIdentity homeKW;
    private KeywordLoginIdentity loginKW;
    private KeywordAccountIdentity accountKW;

    public BaseKDTTest(WebDriver driver) {
        baseKW = new KeywordIdentity(driver);
        homeKW = new KeywordHomeIdentity(driver);
        loginKW = new KeywordLoginIdentity(driver);
        accountKW = new KeywordAccountIdentity(driver);
    }

    public void kdtTest(List<KeywordStep> steps) {
        for (KeywordStep step : steps) {
            LOG.info("page: {}, action: {}, obj: {}, value: {}",
                    step.getPage(), step.getAction(), step.getObject(), step.getValue());

            baseKW.doAction(step.getPage(), step.getAction(), step.getObject(), step.getValue());
        }
    }
}
