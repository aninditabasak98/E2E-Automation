package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags ="@smoke",
        features = {
        "src/test/resources/tc-01-bankLogin.feature",
        "src/test/resources/tc-02-addCustomer.feature",
        "src/test/resources/tc-03-openAccount.feature",
        "src/test/resources/tc-04-deleteCustomerAccount.feature"
        },

        glue = {"bankStepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/deleteCustomer.html"
        })
@Test
public class AddRunner extends AbstractTestNGCucumberTests {
}
