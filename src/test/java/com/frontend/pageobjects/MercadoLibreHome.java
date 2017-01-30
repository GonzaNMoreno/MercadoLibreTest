package com.frontend.pageobjects;

import com.frontend.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by GonzaMoreno on 31/12/16.
 */

public class MercadoLibreHome extends PageObjectBase{

    private static final String MERCADOLIBRE_URL = "http://www.mercadolibre.com.ar/";

    @FindBy(id= "login")
    private WebElement btnIngresar;

    @FindBy(id = "query")
    private WebElement textSearch;

    @FindBy(name = "mlSearchBtn")
    private WebElement btnSearch;

    public MercadoLibreHome(WebDriver driver){
        super(driver);
        driver.navigate().to(MERCADOLIBRE_URL);
    }

    public ItemResultPage typeSearch(String text){
        type(textSearch, text);
        click(btnSearch);
        return new ItemResultPage(getDriver());
    }

    public boolean isVisible(){
        return getDriver().getCurrentUrl().equals(MERCADOLIBRE_URL) && btnSearch.isDisplayed();
    }

    public LoginMercadoLibrePage goToLogin(){
        click(btnIngresar);
        return new LoginMercadoLibrePage(getDriver());
    }


}
