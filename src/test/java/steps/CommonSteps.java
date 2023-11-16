package steps;

import driver.DriverManager;
import io.cucumber.java.en.Then;

public class CommonSteps extends DriverManager {
    @Then("I go to {string}")
    public void IGoToString(String link) {
        //initDriver();
        driver.get(link);
    }

    @Then("Just wait {int}")
    public void justWait(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
