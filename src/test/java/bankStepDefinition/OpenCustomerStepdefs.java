package bankStepDefinition;

import POM.OpenCustomerElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static bankStepDefinition.LoginStepdefs.driver;

//import static bankStepDefinition.AddCustomerStepdefs.driver;

public class OpenCustomerStepdefs {
    OpenCustomerElements openCustomerElements;
    @Given("Bank manager homepage")
    public void bankManagerHomepage() {
        System.out.println("Bank manager homepage");
//        Helper helper=new Helper();
//        driver=helper.chromeLaunchAddCustomer();
    }

    @When("User click on open account page")
    public void userClickOnOpenAccountPage() {
        openCustomerElements=new OpenCustomerElements(driver);
        openCustomerElements.openCustomer();
    }


    @And("User clicks on Please select an item option from a customer dropdown list and clicks on a particular customer from the list")
    public void userClicksOnPleaseSelectAnItemOptionFromACustomerDropdownListAndClicksOnAParticularCustomerFromTheList() throws InterruptedException {
        openCustomerElements.selectItemFromCustomerDropdown();

    }

    @And("User clicks on Please select an item option from a currency dropdown list and clicks on a particular currency from the list")
    public void userClicksOnPleaseSelectAnItemOptionFromACurrencyDropdownListAndClicksOnAParticularCurrencyFromTheList() throws InterruptedException {
        openCustomerElements.selectItemFromCurrencyDropdown();
    }

    @And("User clicks on the process button")
    public void userClicksOnTheProcessButton() throws InterruptedException {
        openCustomerElements.selectProcessButton();
        
    }

    @And("User accepts the alert ok button")
    public void userAcceptsTheAlertOkButton() throws InterruptedException {
        openCustomerElements.clickAlertOkButton();
        
    }

    @Then("Ensure that the account exists")
    public void ensureThatTheAccountExists() {
        System.out.println("Account exists");
    }
}
