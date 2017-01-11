package com.bootcamp.framework.web;

import io.github.bonigarcia.wdm.Architecture;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;

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
    FIREFOX{
        @Override
        public Capabilities getCapabilities(){
            FirefoxDriverManager.getInstance().setup();
            return DesiredCapabilities.firefox();
        }
    },
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
