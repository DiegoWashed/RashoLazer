package steps;

import PO.LoginPo;
import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {

    LoginPo loginPo = new LoginPo(driver);
    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @Then("I fill password {string}")
    public void iFillPassword(String text) {loginPo.fillPassword(text);
    }

    @Then("I click the ok button")
    public void iOkbutton(){loginPo.okbutton();}

    @Then("I click the purchase button")
    public void iClickpurchase(){loginPo.clickPurchase();}

    @Then("I fill name {string}")
    public void iFillname(String text) {loginPo.fillnamefield(text);}

    @Then("I fill country {string}")
    public void iFillcountry(String text) {loginPo.fillcountryfield(text);}

    @Then("I fill city {string}")
    public void iFillcity(String text) {loginPo.fillcityfield(text);}

    @Then("I fill card {string}")
    public void iFillcard(String text) {loginPo.fillcardfield(text);}

    @Then("I fill month {string}")
    public void iFillmonth(String text) {loginPo.fillmonthfield(text);}

    @Then("I fill year {string}")
    public void iFillyear(String text) {loginPo.fillyearfield(text);}

    @Then("I click login button")
    public void iClickLoginButton() {loginPo.clickLoginButton();}

    @Then("I assert text")
    public void iErrorMessage() {
        loginPo.errorMessage();
    }

    @Then("I validate backpack is on the shopping")
    public void iValidatebackpackshoppincart(){loginPo.validatebackpackshoppincart();}

    @Then("I click on shopping cart")
    public void iClickshoppingcart(){loginPo.clickshoppingcart();}

    @Then("I assert my purchase")
    public void iAssertpurchase(){loginPo.assertPurchase();}

    @Then("I click on place order")
    public void iPlaceorderbutton(){loginPo.placeOrderbutton();}

    @Then("I validate REMOVE label on button for backpack")
    public void iValidatelabelbackpack(){loginPo.validatelabelbackpack();}

    @Then("I click continue shopping button")
    public void iClickcontinueshopping(){loginPo.clickcontinueshopping();}

    @Then("I click add to cart backpack button")
    public void iClickaddtocartbackpack(){
        loginPo.clickaddtocartbackpack();
    }

    @Then("I click on the samsung phone")
    public void iSelectsamsungphone(){loginPo.selectSamsungphone();}

    @And("I click on the image carousel")
    public void iClickimagecarousel(){loginPo.clickImagecarousel();}

    @Then("I click on the apple monitor")
    public void iClickapplemonitor(){loginPo.clickApplemonitor();}

    @Then("I select add to cart phone")
    public void iAddtocartphone(){loginPo.addTocartphone();}

    @And("I click alert box")
    public void iClickalertbox(){loginPo.clickalertbox();}

    @Then("I click add to cart demon blaze shop")
    public void iClickdemonblazecart(){loginPo.clickdemonblazecart();}

    @Then("I assert label")
    public void iApplemonitorlabel(){loginPo.applemonitorlabel();}
}

