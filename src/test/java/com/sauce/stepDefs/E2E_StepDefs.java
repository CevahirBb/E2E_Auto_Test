package com.sauce.stepDefs;

import com.sauce.pages.*;
import com.sauce.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class E2E_StepDefs {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage=new CartPage();
    CheckoutFirstPage checkoutFirstPage=new CheckoutFirstPage();
    CheckoutSecondPage checkoutSecondPage=new CheckoutSecondPage();
    CheckOutCompletePage checkOutCompletePage=new CheckOutCompletePage();
    private String text;

    @When("The user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {

        loginPage.login(username, password);
    }

    @Then("The user should be able to login and see {string} header")
    public void theUserShouldBeAbleToLoginAndSeeHeader(String expectedHeader) {
        assertEquals(expectedHeader,productsPage.productsText.getText());
    }
    @When("The user sorts the products by {string}")
    public void theUserSortsTheProductsBy(String sortType) {
        BrowserUtils.waitFor(1);
        productsPage.sortProduct(sortType);
    }
    @And("The user adds the cheapest product as {string} and the second costliest product as {string}")
    public void theUserAddsTheCheapestProductAsAndTheSecondCostliestProductAs(String cheapest, String secondCost) {
        productsPage.addProduct(cheapest);
        productsPage.addProduct(secondCost);
    }
    @And("The user opens the basket")
    public void theUserOpensTheBasket() {
        productsPage.cartBtn.click();
    }
    @And("The user clicks on checkout button")
    public void theUserClicksOnCheckoutButton() {
        cartPage.checkoutBtn.click();
    }

    @And("The user enters details as {string} and {string} and {string} and clicks continue button")
    public void theUserEntersDetailsAsAndAndAndClicksContinueButton(String firstName, String lastName,String postalCode){
        checkoutFirstPage.enterDetails(firstName,lastName,postalCode);
    }

    @Then("The user verifies that the total price is{string}")
    public void theUserVerifiesThatTheTotalPriceIs(String expectedPrice) {
        checkoutSecondPage.priceTotal.click();
    }

    @When("The user clicks on finish button")
    public void theUserClicksOnFinishButton() {
        checkoutSecondPage.finishBtn.click();
    }

    @Then("The user should be able to see confirmation message as {string}")
    public void theUserShouldBeAbleToSeeConfirmationMessageAs(String expectedMsg) {
        assertEquals(expectedMsg,checkOutCompletePage.completeMsg.getText());

    }
}