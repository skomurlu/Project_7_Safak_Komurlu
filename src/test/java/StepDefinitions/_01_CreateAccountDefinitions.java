package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_CreateAccountDefinitions {

    DialogContent dc=new DialogContent();
    @Given("Navigate to magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click the create account button")
    public void clickToCreateButton() {
        dc.findAndClick("createButton");
    }

    @And("Enter the information")
    public void enterTheInformation(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i <listElements.size(); i++) {
            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }

//        dc.findAndSend("firstname","Safak");
//        dc.findAndSend("lastname","Komurlu");
//        dc.findAndSend("email","magento@gmail.com");
//        dc.findAndSend("password","Magento123456");
//        dc.findAndSend("passwordConfirmation","Magento123456");
    }

    @And("Click the create button")
    public void clickTheCreateButton() {
        dc.findAndClick("createAccountButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "you");


    }
}
