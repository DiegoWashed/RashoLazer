package PO;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FulFilldPo  extends DriverManager {
    @FindBy(xpath = "//button[@data-testid = 'login-page-auth-button']\n")
    WebElement button;


    public FulFilldPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }


   public void  clickLoginButton(){
       button.click();
   }
}
