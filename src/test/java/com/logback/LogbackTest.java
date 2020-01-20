package com.logback;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);
    public static void main(String[] args) {

        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();

        //StatusPrinter.print(lc);
        LOGGER.info("Entering application.");
    }
}
