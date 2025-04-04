package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutSecondPage extends BasePage{
    @FindBy(className = "summary_total_label")
    public WebElement priceTotal;
    @FindBy(id = "finish")
    public WebElement finishBtn;

}
