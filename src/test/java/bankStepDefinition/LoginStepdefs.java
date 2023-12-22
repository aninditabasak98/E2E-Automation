package bankStepDefinition;

import POM.BankPageObjectModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import webHelper.Helper;


public class LoginStepdefs {
    static WebDriver driver;
    BankPageObjectModel bankPageObjectModel;
    @Given("Authentication in login page")
    public void authenticationInLoginPage() {
        Helper helper=new Helper();
        driver=helper.chromeLaunch();
        
    }

    @When("User click on bank manager login page")
    public void userClickOnBankManagerLoginPage() throws InterruptedException {
            bankPageObjectModel=new BankPageObjectModel(driver);
            bankPageObjectModel.clickOnBankManagerLoginButton();
    }

    @Then("It will take to the next page")
    public void itWillTakeToTheNextPage() {
            System.out.println("It will take to the next page");
        }

}
