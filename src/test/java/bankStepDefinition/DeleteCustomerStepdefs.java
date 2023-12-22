package bankStepDefinition;

import POM.DeleteCustomerElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static bankStepDefinition.LoginStepdefs.driver;

public class DeleteCustomerStepdefs {
    DeleteCustomerElements deleteCustomerElements;
    @Given("Being in bank manager homepage")
    public void beingInBankManagerHomepage() {
        System.out.println("Being in bank manager homepage");
    }

    @When("User click on customer button")
    public void userClickOnCustomerButton() throws InterruptedException {
        deleteCustomerElements=new DeleteCustomerElements(driver) ;
        deleteCustomerElements.clickCustomerButton();
    }

    @And("User inputs {string} in search customer field")
    public void userInputsCustomerNameInSearchCustomerField(String CustomerName) throws InterruptedException {
        deleteCustomerElements.inputName(CustomerName);
    }

    @And("User clicks on delete button")
    public void userClicksOnDeleteButton() throws InterruptedException {
        deleteCustomerElements.clickDelete();
    }

    @Then("The customer successfully deleted")
    public void theCustomerSuccessfullyDeleted() {
        System.out.println("customer deleted");
    }
}
