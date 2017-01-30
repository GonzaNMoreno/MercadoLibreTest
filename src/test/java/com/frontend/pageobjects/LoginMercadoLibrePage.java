package com.frontend.pageobjects;

import com.frontend.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by g.moreno on 1/30/2017.
 */
public class LoginMercadoLibrePage extends PageObjectBase {

    @FindBy(id = "user_id")
    private WebElement textUserId;

    @FindBy(id = "password")
    private WebElement textPassword;

    @FindBy(id = "signInButton")
    private WebElement btnIngresar;

    public LoginMercadoLibrePage(WebDriver driver){
        super(driver);
    }

    public MercadoLibreHome loggin(String user, String pass){
        type(textUserId, user);
        type(textPassword, pass);
        click(btnIngresar);
        return new MercadoLibreHome(getDriver());
    }
}
