package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddPageObjectModel {
    WebDriver driver;
    By AddCustomerButton= By.xpath("//button[text()=\"Add Customer\"]");
    By firstNameField=By.xpath("//input[@placeholder=\"First Name\"]");
    By lastNameField=By.xpath("//input[@placeholder=\"Last Name\"]");
    By postCodeField=By.xpath("//input[@placeholder=\"Post Code\"]");
    By customerAddButton=By.xpath("//button[text()=\"Add Customer\"]");

    //constructor
    public AddPageObjectModel(WebDriver driver){
        this.driver= driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickAddCustomerButton() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(AddCustomerButton).click();
        driver.findElement(By.xpath("//button[@ng-class=\"btnClass1\"]")).click();
    }
    public void clickInputField(String firstName,String lastName,String postCode) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(firstNameField).sendKeys(firstName);
        Thread.sleep(1000);
        driver.findElement(lastNameField).sendKeys(lastName);
        Thread.sleep(1000);
        driver.findElement(postCodeField).sendKeys(postCode);
    }
    public void clickCustomerAddButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(customerAddButton).click();
    }

    public void clickAlertOkButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }


}
