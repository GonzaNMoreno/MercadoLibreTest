package com.frontend.framework.runner;

import com.frontend.framework.logging.Logging;
import com.frontend.framework.selenium.Selenium;
import com.frontend.framework.web.Browser;
import com.frontend.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.ParameterizedType;

import static java.lang.String.format;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by GonzaMoreno on 31/12/16.
 */

public abstract class GenericWebAutomationTest<T extends PageObjectBase> implements Logging {

    static{
        Runtime.getRuntime().addShutdownHook(new Thread(Selenium.SERVER::stop));
    }

    private T startingPage;

    /**
     * Calculates the value of parameter type "T" of this WebAutomationJUnitSuite instance.
     * <p>
     * Uses reflection to do so.
     *
     * @return parameter type "T" of this WebAutomationJUnitSuite instance
     */
    @SuppressWarnings("unchecked")
    private Class<T> getParameterizedType() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    protected T getStartingPage() {
        return startingPage;
    }

    public void setUp(Browser browser){
        //Create the driver to inject into Page Object...
        WebDriver driver = new RemoteWebDriver(browser.getCapabilities());
        driver.manage().timeouts().implicitlyWait(1, SECONDS);
        driver.manage().window().maximize();

        //Instantiate Page Object calculated from parameterized type...
        //This is equal to: new PageObjectType(driver);
        Class<T> pageObjectType = getParameterizedType();
        try{
            getLogger().debug(format("Creating instance of [%s] with browser [%s]...", pageObjectType.getSimpleName(), browser));
            this.startingPage = pageObjectType.getConstructor(WebDriver.class).newInstance(driver);
        }catch (Exception e){
            getLogger().error(format("Could not instantiate Page Object [%s]...", pageObjectType.getName()), e);
        }
    }

    public void tearDown() {
        getLogger().debug("Tearing down browser...");
        if (startingPage != null) {
            startingPage.dispose();
        }
    }
}
