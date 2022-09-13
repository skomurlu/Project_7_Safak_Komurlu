package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginDefinitions {

    DialogContent dc=new DialogContent();
    @When("Click to sign in button")
    public void clickToSignInButton() {
        dc.findAndClick("signIn");
    }

    @And("Enter email and password and click login button")
    public void enterEmailAndPasswordAndClickLoginButton() {
        dc.findAndSend("loginEmail","magento@gmail.com");
        dc.findAndSend("loginPassword","Magento123456");
        dc.findAndClick("signInButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        //System.out.println(dc.successLogin.getText());
        //dc.findAndContainsText("successLogin","Welcome");
    }
}
