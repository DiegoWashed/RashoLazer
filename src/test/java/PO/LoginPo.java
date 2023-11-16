package PO;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;

import static org.junit.Assert.assertEquals;

public class LoginPo {
    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "//*[@id=\"cartur\"]")
    WebElement clickcart;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
    WebElement applemonitorlabel;

    @FindBy(id = "alertBox")
    WebElement alertbox;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addtocarphone;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    WebElement applemonitor;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    WebElement placeorderbutton;

    @FindBy(xpath = "//*[@id=\"carouselExampleIndicators\"]/a[2]/span[1]")
    WebElement imagecarousel;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    WebElement samsungphone;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement validatebackpackshoppingcart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement shoppingcart;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    WebElement removesaucelabsbackpack;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement addtocartbackpack;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errormessage;

    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement  continueshoppingbutton;

    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    WebElement purchasebutton;

    @FindBy(id = "name")
    WebElement namefield;

    @FindBy(id = "country")
    WebElement countryfield;

    @FindBy(id = "city")
    WebElement cityfield;

    @FindBy(id = "card")
    WebElement cardfield;

    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    WebElement okbutton;

    @FindBy(id = "month")
    WebElement monthfield;

    @FindBy(id = "year")
    WebElement yearfield;

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(xpath = "/html/body/div[10]/h2")
    WebElement assertpurchase;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void clickPurchase(){this.purchasebutton.click();}

    public void okbutton(){this.okbutton.click();}
    public void fillnamefield(String text){this.namefield.sendKeys(text);}

    public void assertPurchase(){Assert.assertEquals("Thank you for your purchase!",this.assertpurchase.getText());}

    public void fillcountryfield(String text){this.countryfield.sendKeys("Mexico");}

    public void fillcityfield(String text){this.cityfield.sendKeys("Ensenada");}

    public void fillcardfield(String text){this.cardfield.sendKeys("0069");}

    public void fillmonthfield(String text){this.monthfield.sendKeys("Marzo");}

    public void fillyearfield(String text){this.yearfield.sendKeys("2023");}

    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }

    public void selectSamsungphone(){this.samsungphone.click();}

    public void clickdemonblazecart(){this.clickcart.click();}

    public void addTocartphone(){this.addtocarphone.click();}

    public void clickApplemonitor(){this.applemonitor.click();}

    public void clickImagecarousel(){this.imagecarousel.click();}

    public void clickshoppingcart(){this.shoppingcart.click();}

    public void clickalertbox(){this.alertbox.click();}

    public void applemonitorlabel(){Assert.assertEquals("Samsung galaxy s6", this.applemonitorlabel.getText());}

    public void clickcontinueshopping(){this.continueshoppingbutton.click();}

    public void placeOrderbutton(){this.placeorderbutton.click();}
    public void validatelabelbackpack(){Assert.assertEquals("REMOVE",this.removesaucelabsbackpack.getText());}

    public void validatebackpackshoppincart()
    {
        Assert.assertEquals("Sauce Labs Backpack",this.validatebackpackshoppingcart.getText());}
    public void clickaddtocartbackpack(){this.addtocartbackpack.click();}
    public void errorMessage(){
        System.out.println(errormessage.getText().equals("Epic sadface: Sorry, this user has been locked out."));
    }



}
