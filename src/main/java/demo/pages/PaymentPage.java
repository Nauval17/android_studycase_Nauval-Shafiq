package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

    WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 20);

    public boolean isOnPayPage(){
        WebElement payPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tablet_title")));
        return payPage.isDisplayed();
    }

    public void chooseLowest(){
        WebElement lowestPay = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
        lowestPay.click();
    }

    public void okButton(){
        WebElement okCharge = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        okCharge.click();
    }
}
