package PO;

import driver.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CommonPo  extends DriverManager {
    public CommonPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    public void waitForNewTabAndSwitch(int actualSize) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        wait.until(
                driver -> {
                    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
                    if (tabs.size() > actualSize) {
                        driver.switchTo().window(tabs.get(tabs.size() - 1));
                        return true;
                    } else {
                        return false;
                    }
                }
        );
    }
}
