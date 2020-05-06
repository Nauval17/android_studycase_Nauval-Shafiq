package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MokaLoginPage {

    WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 20);

    public boolean isOnLoginPage(){
        WebElement onLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("icon_moka_image_view")));
        return onLogin.isDisplayed();
    }

    public void insertEmail(String email){
        WebElement emailField = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        emailField.sendKeys(email);
    }

    public void insertPass(String pass){
        WebElement passField = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        passField.sendKeys(pass);
    }

    public void clickButton(){
        WebElement click = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("signInButton")));
        click.click();
        AndroidDriverInstance.androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
