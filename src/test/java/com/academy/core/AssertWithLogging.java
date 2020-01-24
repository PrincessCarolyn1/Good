package com.academy.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class AssertWithLogging {
    private final static Logger LOG = LogManager.getLogger(AssertWithLogging.class.getName());

    public static void assertEquals(String actual, String expected) {
        LOG.info("Try assert actual {} with expected {}", actual, expected);
        try {
            Assert.assertEquals(actual, expected, null);
        } catch (AssertionError e) {
            LOG.error("Error comparing actual {} with expected {}", actual, expected);
            throw new AssertionError(e);
        }
    }
}
