package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MokaPOSPage {

    WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);

    public boolean isONPOS(){
        WebElement posPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("grid_favourite")));
        return posPage.isDisplayed();
    }

    public String addItem(String itemName){
        List<AndroidElement> items = AndroidDriverInstance.androidDriver
                .findElements(By.id("grid_favourite_name"));
        for (AndroidElement item : items) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                item.click();
                break;
            }
        }
        return itemName;
    }

    public void addAmount(String itemName, int qty){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '%s']";
        AndroidElement item = AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(
                xpath, itemName)));
        for(int i=0; i<qty; i++){
            item.click();
        }
    }

    public void clickCharge(){
        AndroidElement click = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        click.click();
    }
}
