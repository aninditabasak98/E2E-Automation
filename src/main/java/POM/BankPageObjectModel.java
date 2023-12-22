package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BankPageObjectModel {
    WebDriver driver;

    By clickBankLoginButton= By.xpath("//button[text()=\"Bank Manager Login\"]");
    public BankPageObjectModel(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickOnBankManagerLoginButton(){

        driver.findElement(clickBankLoginButton).click();
    }


}


