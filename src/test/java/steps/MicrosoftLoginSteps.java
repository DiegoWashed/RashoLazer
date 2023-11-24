package steps;


import com.fasterxml.jackson.core.JsonProcessingException;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.annotations.events.AfterScenario;
import po.MicrosoftLoginPo;



public class MicrosoftLoginSteps extends DriverManager {
    MicrosoftLoginPo microsoftLoginPo = new MicrosoftLoginPo(driver);
    private final String threadName = Thread.currentThread().getName();

    /*
     * Description: Open the TMS website
     * Tags: navigate
     * Section: General
     * Parameters:
     *   N/A
     */
    @Given("I open the TMS page")
    public void i_open_the_TMS_page() {
        driver.manage().window().maximize();
      //  driver.get(variables.getProperty("tms.page"));
        microsoftLoginPo = new MicrosoftLoginPo(driver);
    }

    @Given("I open the dartboard page")
    public void i_open_the_dartboard_page() {
        driver.manage().window().maximize();
    //    driver.get(variables.getProperty("dartboard.page"));
        microsoftLoginPo = new MicrosoftLoginPo(driver);
        microsoftLoginPo.waitUntilAllSpinnersDisappear();
    }


    /*
     * Description: Login into the TMS application
     * Tags: login
     * Section: General
     * Parameters:
     *   N/A
     */
    @Then("Login into the TMS application")
    public void iTypeMyUserName() throws InterruptedException {
        microsoftLoginPo.fillUserName();
    }

    @Then("Login into the AMS application")
    public void iTypeMyUserNameAMS() throws InterruptedException {
        microsoftLoginPo.fillUserName("AMS");
        microsoftLoginPo.waitUntilAllSpinnersDisappear();
    }


    @Then("Fulfilld - I login through microsoft service")
    public void loginIntoGullGild() throws InterruptedException {
        microsoftLoginPo.fillUserName();
    }


    @After
    public void after(Scenario scenario) throws JsonProcessingException {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    @AfterScenario
    public void closeBrowser(Scenario scenario) throws JsonProcessingException {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



}
