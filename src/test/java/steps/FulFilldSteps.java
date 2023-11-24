package steps;

import PO.FulFilldPo;
import driver.DriverManager;
import io.cucumber.java.en.Then;

public class FulFilldSteps  extends DriverManager {

    FulFilldPo fulFilldPo = new FulFilldPo(driver);

    @Then("Fulfilld - I click login button")
    public void iClickLoginButton() {
        fulFilldPo.clickLoginButton();
    }

}
