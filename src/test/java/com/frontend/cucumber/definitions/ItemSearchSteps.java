package com.frontend.cucumber.definitions;

import com.frontend.framework.runner.GenericWebAutomationTest;
import com.frontend.framework.web.Browser;
import com.frontend.pageobjects.ItemResultPage;
import com.frontend.pageobjects.MercadoLibreHome;
import com.frontend.pageobjects.ReviewItemPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by GonzaMoreno on 12/1/17.
 */
public class ItemSearchSteps extends GenericWebAutomationTest<MercadoLibreHome>{

    private MercadoLibreHome home;
    private ItemResultPage itemResultPage;
    private ReviewItemPage reviewItemPage;

    @Before
    public void setUp(){
        super.setUp(Browser.valueOf(Optional.ofNullable(System.getenv("CUCUMBER_BROWSER")).orElse("CHROME")));
    }

    @After
    public void tearDown(){
        super.tearDown();
    }

    @Given("^I am at MercadoLibre home page$")
    public void iAmAtMercadoLibreHomePage() throws Throwable{
        assertTrue("MercadoLibre home page is not visible", getStartingPage().isVisible());
    }

    @When("^I perform a item search from \"([^\"]*)\"$")
    public void iPerformAItemSearchFrom(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    /*@Then("^I can see the review of the item$")
    public void iCanSeeTheReviewOfTheItem() throws Throwable {
        assertTrue("Item Review Can't Been Seen", );


    }*/


    }
}
