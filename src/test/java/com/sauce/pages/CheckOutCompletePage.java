package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends BasePage{
    @FindBy(tagName = "h2")
    public WebElement completeMsg;
}
