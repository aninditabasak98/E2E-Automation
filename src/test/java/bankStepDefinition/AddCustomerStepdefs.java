package bankStepDefinition;

import POM.AddPageObjectModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import webHelper.Helper;

import static bankStepDefinition.LoginStepdefs.driver;


public class AddCustomerStepdefs {

    AddPageObjectModel addPageObjectModel;

    @Given("Bank manager is in home page")
    public void bankManagerIsInHomePage() {
        System.out.println("Bank manager is in home page");
//        Helper helper=new Helper();
//        driver=helper.chromeLaunchAddCustomer();
        
    }

    @When("User click on add customer button")
    public void userClickOnAddCustomerButton()  throws InterruptedException {

        addPageObjectModel=new AddPageObjectModel(driver);
        addPageObjectModel.clickAddCustomerButton();

    }

    @And("User will input {string} and {string} and {string}")
    public void userWillInputFirstNameAndLastNameAndPostCode(String firstName,String lastName,String postCode) throws InterruptedException {

        addPageObjectModel.clickInputField(firstName,lastName,postCode);
    }

    @And("User click add customer button")
    public void userClickAddCustomerButton() throws InterruptedException {

        addPageObjectModel.clickCustomerAddButton();

    }

    @And("user accept the alart ok button")
    public void clickAlertOkButton() throws InterruptedException {
        addPageObjectModel.clickAlertOkButton();
        
    }

    @Then("The customer  successfully added")
    public void theCustomerSuccessfullyAdded() {
        System.out.println("Customer successfully added");
    }
}
