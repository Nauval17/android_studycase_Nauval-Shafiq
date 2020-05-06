package demo.steps_definition;

import demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  MokaLoginPage loginPage = new MokaLoginPage();
  MokaPOSPage posPage = new MokaPOSPage();
  PaymentPage paymentPage = new PaymentPage();
  MokaReceiptPage receiptPage = new MokaReceiptPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @And("User is on moka login page")
  public void userIsOnMokaLoginPage() {
    loginPage.isOnLoginPage();
  }

  @And("User insert correct email {string} in email field")
  public void userInsertCorrectInEmailField(String email) {
    loginPage.insertEmail(email);
  }

  @And("User insert correct password {string} in password field")
  public void userInsertCorrectInPasswordField(String password) {
    loginPage.insertPass(password);
  }

  @And("User click sign in button on moka login page")
  public void userClickSignInButtonOnMokaLoginPage() {
    loginPage.clickButton();
  }

  @Then("User log in to POS HomePage")
  public void userLogIn(){
    boolean actual = posPage.isONPOS();
    Assert.assertTrue(actual);
  }


  @And("User is on moka POS Page")
  public void userIsOnMokaPOSPage() {
    boolean actual_3 = posPage.isONPOS();
    Assert.assertTrue(actual_3);
  }

  @When("User choose an item {string} from favourite tab")
  public void userChooseAnItemFromFavouriteTab(String itemName) {
    posPage.addItem(itemName);
  }

  @And("User choose item {string} {int} amount")
  public void userChooseItemItemQtyAmount(String itemName, int qty) throws InterruptedException {
    String item = posPage.addItem(itemName);
    posPage.addAmount(item, qty);
    Thread.sleep(5000);
  }

  @And("User click charge button")
  public void userClickChargeButton() {
    posPage.clickCharge();
  }

  @And("User is on pay page")
  public void userIsOnPayPage() {
    paymentPage.isOnPayPage();
  }

  @And("User choose lowest payment")
  public void userChooseLowestPayment() {
    paymentPage.chooseLowest();
  }

  @And("User pay the amount")
  public void userPayTheAmount() {
    paymentPage.okButton();
  }

  @Then("User get change information")
  public void userGetChangeInformation() {
    boolean actual_4 = receiptPage.isOnReceiptPage();
    receiptPage.noReceiptButton();
    Assert.assertTrue(actual_4);
  }



//  @And("User choose middle payment")
//  public void userChooseMiddlePayment() {
//
//  }
//
//  @And("User choose custom payment")
//  public void userChooseCustomPayment() {
//  }
}
