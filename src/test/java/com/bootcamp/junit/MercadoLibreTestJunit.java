package com.bootcamp.junit;

import com.bootcamp.framework.runner.junit.WebAutomationJUnitSuite;
import com.bootcamp.pageobjects.MercadoLibreHome;
import org.junit.Test;

/**
 * Created by GonzaMoreno on 31/12/16.
 */
public class MercadoLibreTestJunit extends WebAutomationJUnitSuite<MercadoLibreHome>{

    @Test
    public void itemSearch(){
        MercadoLibreHome home = getStartingPage();

        MercadoLibreHome result = home.typeSearch("Drum kit");
    }
}
