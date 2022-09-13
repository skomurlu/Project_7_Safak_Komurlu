package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_AddressDefinitions {

    DialogContent dc=new DialogContent();
    @And("Click to on the elements for the manage address")
    public void clickToOnTheElementsForTheManageAddress(DataTable elements) {
        List<String> listElements = elements.asList(String.class);
        for (int i = 0; i <listElements.size(); i++) {
            dc.findAndClick(listElements.get(i));
        }

    }

    @And("User should send the new address information in Dialog Content")
    public void userShouldSendTheNewAddressInformationInDialogContent(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);
        for (int i = 0; i <listElements.size(); i++) {
            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }

    @And("User should be select state and country")
    public void userShouldBeSelectStateAndCountry() {
//        List<String> listElements = elements.asList(String.class);
//        for (int i = 0; i <listElements.size(); i++) {
//            dc.findAndClick(listElements.get(i));
//        }

        dc.findAndSelect("region", "Texas");

    }

    @And("Click to save address")
    public void clickToSaveAddress() {
        dc.findAndClick("saveAddress");
    }
}
