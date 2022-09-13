package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_ProductPurchaseDefinitions {

    DialogContent dc=new DialogContent();
    @When("Click to product and add to cart")
    public void clickToProductAndAddToCart() {
    dc.findAndClick("gear");
    dc.findAndClick("waterBottle");

    }

    @And("Go to cart proceed to Checkout")
    public void goToCartProceedToCheckout() {
    dc.findAndClick("myCart");
    dc.findAndClick("checkout");

    }

    @Then("Select an address")
    public void selectAnAddress() {
    dc.findAndClick("shipHere");

    }

    @And("Choose shipping method and click next")
    public void chooseShippingMethodAndClickNext() {
    dc.findAndClick("radioButton");
    dc.findAndClick("nextButton");
    dc.findAndClick("checkAddress");

    }

    @And("Click place order")
    public void clickPlaceOrder() {
    dc.findAndClick("placeOrder");
    }

    @Then("Success purchase message should be displayed")
    public void successPurchaseMessageShouldBeDisplayed() {
    dc.findAndContainsText("successPurchase", "Continue");

    }

}
