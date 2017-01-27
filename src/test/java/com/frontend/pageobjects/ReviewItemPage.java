package com.frontend.pageobjects;

import com.frontend.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

/**
 * Created by GonzaMoreno on 11/1/17.
 */
public class ReviewItemPage extends PageObjectBase {

    // private static final String
    @FindBy(id = "BidButtonTop")
    private WebElement comprarBtn;

    public ReviewItemPage(WebDriver driver){
        super(driver);

        getWait().until(numberOfWindowsToBe(2));
        final String currentHandler = driver.getWindowHandle();
        driver.getWindowHandles().forEach(h -> {
            if(!h.equals(currentHandler)){
                driver.switchTo().window(h);
            } //PAGE TITLE ??)
        });
    }

    public void buttonClick(){
        click(comprarBtn);
    }
}
