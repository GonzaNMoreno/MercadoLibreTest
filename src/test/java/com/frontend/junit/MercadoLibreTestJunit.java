package com.frontend.junit;

import com.frontend.framework.runner.junit.WebAutomationJUnitSuite;
import com.frontend.pageobjects.ItemResultPage;
import com.frontend.pageobjects.MercadoLibreHome;
import com.frontend.pageobjects.ReviewItemPage;
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
