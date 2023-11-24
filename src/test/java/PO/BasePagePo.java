package PO;

import driver.DriverBase;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePagePo extends DriverBase {
    protected WebDriverWait wait;
    Actions actions;
    protected EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
    protected EnvironmentSpecificConfiguration variables;

    public BasePagePo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
        variables = new EnvironmentSpecificConfiguration(env);
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
