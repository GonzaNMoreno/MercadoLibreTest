package com.bootcamp.pageobjects;

import com.bootcamp.framework.web.PageObjectBase;
import com.sun.tools.javac.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by GonzaMoreno on 11/1/17.
 */
public class ItemResultPage extends PageObjectBase {

    @FindBy(class = "results-item article")
    private List<WebElement> selectItems;

    public ItemResultPage(WebDriver driver){
        super(driver);
    }

    private void selectItem(int index){
        getWait().until(visibilityOfAllElements(selectItems));
        click(selectItems.get(index - 1));
    }


}
