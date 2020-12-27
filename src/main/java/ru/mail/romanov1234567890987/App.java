package ru.mail.romanov1234567890987;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.lang.invoke.MethodHandles;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = (Logger) LogManager.getLogger(MethodHandles.lookup().lookupClass());
    public static void main( String[] args )
    {
        logger.info("Log info");
        logger.debug("Log debug");
        logger.error("Log error");
    }
}
