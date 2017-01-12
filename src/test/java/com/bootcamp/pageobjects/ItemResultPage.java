package com.bootcamp.pageobjects;

import com.bootcamp.framework.web.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by GonzaMoreno on 11/1/17.
 */
public class ItemResultPage extends PageObjectBase {

    @FindBy(css = "button[class='bookmarks favorite']")
    private List<WebElement> selectItems;

    public ItemResultPage(WebDriver driver){
        super(driver);
    }

    public void selectItem(int index){
        getWait().until(visibilityOfAllElements(selectItems));
        click(selectItems.get(index - 1));
    }

    public ReviewItemPage goToReview(int index){
        selectItem(index);
        return new ReviewItemPage(getDriver());
    }




}
