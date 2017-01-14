package com.bootcamp.junit;

import com.bootcamp.framework.runner.junit.WebAutomationJUnitSuite;
import com.bootcamp.pageobjects.ItemResultPage;
import com.bootcamp.pageobjects.MercadoLibreHome;
import com.bootcamp.pageobjects.ReviewItemPage;
import org.junit.Test;

/**
 * Created by GonzaMoreno on 31/12/16.
 */
public class MercadoLibreTestJunit extends WebAutomationJUnitSuite<MercadoLibreHome>{

    @Test
    public void itemSearch(){

        MercadoLibreHome home = getStartingPage();

        ItemResultPage resultList = home.typeSearch("Juegos PS4");

        ReviewItemPage selectItem = resultList.goToReview(6);


    }
}
