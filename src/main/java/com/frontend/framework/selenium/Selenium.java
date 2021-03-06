package com.frontend.framework.selenium;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.openqa.grid.internal.utils.configuration.StandaloneConfiguration;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

/**
 * Created by GonzaMoreno on 31/12/16.
 */
public enum Selenium {

    SERVER;

    private SeleniumServer seleniumServer = new SeleniumServer(new StandaloneConfiguration());

    Selenium(){
        // Turn off verbose logging from Selenium Server...(default is ON)
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.OFF);
        LogManager.getLogManager().getLogger("").setLevel(java.util.logging.Level.OFF);

        //Start Selenium Server programmatically
        try{
            seleniumServer.boot();
        }catch (RuntimeException re){
            System.out.println("Selenium Server already running. Reusing...");
        }
    }

    public void stop(){
        //Stop Selenium Server
        try{
            seleniumServer.stop();
        }catch (RuntimeException re){
            //Do nothing: Shutdown in progress
        }
    }

}
