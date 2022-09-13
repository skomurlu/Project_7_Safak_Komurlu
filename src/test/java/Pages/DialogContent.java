package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//*[text()='Create an Account'])[1]")
    private WebElement createButton;

    @FindBy(css="input[name='firstname']")
    private WebElement firstName;

    @FindBy(css="input[name='lastname']")
    private WebElement lastName;

    @FindBy(css="input[name='email']")
    private WebElement email;

    @FindBy(css="input[name='password']")
    private WebElement password;

    @FindBy(css="input[name='password_confirmation']")
    private WebElement passwordConfirmation;

    @FindBy(xpath="(//*[text()='Create an Account'])[3]")
    private WebElement createAccountButton;

    @FindBy(css="[class='message-success success message']")
    private WebElement successMessage;

    @FindBy(xpath="//a[contains(@href,'login')]")
    private WebElement signIn;

    @FindBy(css="[name='login[username]']")
    private WebElement loginEmail;

    @FindBy(css="[name='login[password]']")
    private WebElement loginPassword;

    @FindBy(xpath="(//*[text()='Sign In'])")
    private WebElement signInButton;

    @FindBy(xpath="(//*[@class='header links'])[1]")
    private WebElement successLogin;

//    @FindBy(css="[class='greet welcome']")
//    private WebElement successLogin;

//    @FindBy(css="[class='action switch']")
//    private WebElement switchButton;

    @FindBy(xpath="//span/button")
    private WebElement switchButton;

    @FindBy(xpath ="//a[@href='https://magento.softwaretestingboard.com/customer/account/']" )
    private WebElement account;

    @FindBy(xpath="//*[text()='Manage Addresses']")
    private WebElement manageAddress;

    @FindBy(xpath="//*[text()='Add New Address']")
    private WebElement addNewAddress;

    @FindBy(css="[name='street[]']")
    private WebElement street;

    @FindBy(css="[name='city']")
    private WebElement city;

    @FindBy(css="[name='telephone']")
    private WebElement telephone;

    @FindBy(css="[name='postcode']")
    private WebElement postcode;

    @FindBy(css="[name='region_id']")
    private WebElement region;

    @FindBy(css="//*[text()='Texas']")
    private WebElement state;

    @FindBy(xpath="//*[text()='Save Address']")
    private WebElement saveAddress;

//    @FindBy(xpath ="//a[@href='https://magento.softwaretestingboard.com/customer/account/']" )
//    private WebElement account;

    @FindBy(css ="[href='https://magento.softwaretestingboard.com/gear.html']" )
    private WebElement gear;

    @FindBy(css ="[href='https://magento.softwaretestingboard.com/affirm-water-bottle.html']" )
    private WebElement waterBottle;


//https://magento.softwaretestingboard.com/push-it-messenger-bag.html

    @FindBy(xpath="//*[text()='Add to Cart']")
    private WebElement addCart;

    @FindBy(css="[class='counter qty']")
    private WebElement myCart;

    @FindBy(xpath="//*[text()='Proceed to Checkout']")
    private WebElement checkout;

    @FindBy(xpath="(//*[text()='Ship Here'])[2]")
    private WebElement shipHere;

    @FindBy(xpath="//input[@value='tablerate_bestway']")
    private WebElement radioButton;

//    @FindBy(xpath="//*[text()='Next']")
//    private WebElement nextButton;

    @FindBy(css="[class='button action continue primary']")
    private WebElement nextButton;

    @FindBy(id="billing-address-same-as-shipping-checkmo")
    private WebElement checkAddress;

    @FindBy(xpath="//*[text()='Place Order']")
    private WebElement placeOrder;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    private WebElement successPurchase;

    WebElement myElement;
    public void findAndSend(String strElement, String value){
        // burada string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "firstName" : myElement = firstName; break;
            case "lastName" : myElement = lastName; break;
            case "email" : myElement = email; break;
            case "password" : myElement = password; break;
            case "passwordConfirmation" : myElement = passwordConfirmation; break;
            case "loginEmail" : myElement = loginEmail; break;
            case "loginPassword" : myElement = loginPassword; break;
            case "street" : myElement = street; break;
            case "city" : myElement = city; break;
            case "telephone" : myElement = telephone; break;
            case "postcode" : myElement = postcode; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "createButton" : myElement = createButton; break;
            case "createAccountButton" : myElement = createAccountButton; break;
            case "signIn" : myElement = signIn; break;
            case "signInButton" : myElement = signInButton; break;
            case "switchButton" : myElement = switchButton; break;
            case "account" : myElement = account; break;
            case "manageAddress" : myElement = manageAddress; break;
            case "addNewAddress" : myElement = addNewAddress; break;
            case "state" : myElement = state; break;
            case "saveAddress" : myElement = saveAddress; break;

            case "gear" : myElement = gear; break;
            case "waterBottle" : myElement = waterBottle; break;
            case "addCart" : myElement = addCart; break;
            case "myCart" : myElement = myCart; break;
            case "checkout" : myElement = checkout; break;
            case "shipHere" : myElement = shipHere; break;
            case "radioButton" : myElement = radioButton; break;
            case "nextButton" : myElement = nextButton; break;
            case "checkAddress" : myElement = checkAddress; break;
            case "placeOrder" : myElement = placeOrder; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){

        switch (strElement)
        {
            case "successMessage" : myElement = successMessage; break;
            case "successLogin" : myElement = successLogin; break;
            case "successPurchase" : myElement = successPurchase; break;

        }

        verifyContainsText(myElement,text);

    }

    public void findAndSelect(String strElement, String text)
    {
        switch (strElement)
        {
            case "region" : myElement = region; break;
        }

        selectByVisibleTextFunction(myElement,text);
    }


}
