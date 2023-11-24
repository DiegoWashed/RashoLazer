package steps;

import PO.CommonPo;
import PO.LoginPo;
import driver.DriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.TimeoutException;

public class CommonSteps extends DriverManager {
    po.MicrosoftLoginPo microsoftLoginPo = new po.MicrosoftLoginPo(driver);
    CommonPo commonPo = new CommonPo(driver);

    @Then("I go to {string}")
    public void IGoToString(String link) {
        //initDriver();
        driver.get(link);
    }

    @Then("Just wait {int}")
    public void justWait(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    @Then("Switch to new opened tab")
    public void SwitchtoNewOpenedTab() {
        int actualTabSize = driver.getWindowHandles().size();
        commonPo.waitForNewTabAndSwitch(1);
        try {
            microsoftLoginPo.waitUntilAllSpinnersDisappear();
        } catch (TimeoutException e) {
            e.getMessage();
        }
    }
}
