package com.bootcamp.cucumber.definitions;

import com.bootcamp.framework.runner.GenericWebAutomationTest;
import com.bootcamp.framework.web.Browser;
import com.bootcamp.pageobjects.MercadoLibreHome;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.Optional;

/**
 * Created by GonzaMoreno on 12/1/17.
 */
public class ItemSearchSteps extends GenericWebAutomationTest<MercadoLibreHome>{

    private;
    private;

    @Before
    public void setUp(){
        super.setUp(Browser.valueOf(Optional.ofNullable(System.getenv("CUCUMBER_BROWSER")).orElse("CHROME")));
    }

    @After
    public void tearDown(){
        super.tearDown();
    }


}
