package com.frontend.framework.web;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by GonzaMoreno on 31/12/16.
 */

public enum Browser {

    CHROME{
        @Override
        public Capabilities getCapabilities(){
            ChromeDriverManager.getInstance().setup();
            return DesiredCapabilities.chrome();
        }
    },
    /*FIREFOX{
        @Override
        public Capabilities getCapabilities(){
            FirefoxDriverManager.getInstance().setup();
            return DesiredCapabilities.firefox();
        }
    },*/
/*    SAFARI{
        @Override
        public Capabilities getCapabilities(){
            SafariDriver;
            return DesiredCapabilities.safari();
        }
    }*/
    ;

    public abstract Capabilities getCapabilities();
}
