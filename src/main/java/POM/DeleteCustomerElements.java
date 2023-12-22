package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class DeleteCustomerElements {
    WebDriver driver;

    By clickOnCustomerButton= By.xpath("//button[@ng-class=\"btnClass3\" ]");
    By CustomerNameSearchField= By.xpath("//input[@placeholder=\"Search Customer\"]");
    public DeleteCustomerElements(WebDriver driver){
        this.driver= driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void clickCustomerButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickOnCustomerButton).click();

    }
    public void inputName(String CustomerName ) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(CustomerNameSearchField).sendKeys(CustomerName);
    }
    public void clickDelete() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"Delete\"]")).click();
    }

}
