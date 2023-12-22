package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpenCustomerElements {
    WebDriver driver;
    By clickOpenCustomer= By.xpath("//button[@ng-click=\"openAccount()\"]");
    By customerDropDownList=By.id("userSelect");
    By customerSelect=By.xpath("//option[text()=\"Anindita Basak\"]");
    By currencyDropDownList=By.id("currency");
    By currencySelect=By.xpath("//option[text()=\"Pound\"]");
    By selectProcessButton=By.xpath("//button[text()=\"Process\"]");


    public OpenCustomerElements(WebDriver driver){
        this.driver= driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void openCustomer(){
        driver.findElement(clickOpenCustomer).click();
    }
    public void selectItemFromCustomerDropdown() throws InterruptedException {
        driver.findElement(customerDropDownList).click();
        Thread.sleep(1000);
        driver.findElement(customerSelect).click();
    }
    public void selectItemFromCurrencyDropdown() throws InterruptedException {
        driver.findElement(currencyDropDownList).click();
        Thread.sleep(1000);
        driver.findElement(currencySelect).click();
        Thread.sleep(1000);

    }
    public void selectProcessButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(selectProcessButton).click();
    }
    public void clickAlertOkButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }


}
