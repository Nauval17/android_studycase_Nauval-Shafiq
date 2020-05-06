package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MokaReceiptPage {
    WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 20);

    public boolean isOnReceiptPage(){
        WebElement receipt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("change_text_view")));
        return receipt.isDisplayed();
    }

    public void noReceiptButton(){
        WebElement receiptButton = AndroidDriverInstance.androidDriver.findElement(By.id("no_send_button"));
        receiptButton.click();
    }
}
