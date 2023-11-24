package po;

import PO.BasePagePo;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class MicrosoftLoginPo extends BasePagePo {
    @FindBy(css = "#i0116")
    private WebElement emailField;

    @FindBy(css = "#idSIButton9")
    private WebElement continueBtn;

    @FindBy(css = "#i0118")
    private WebElement passwordField;

    @FindBy(xpath = "//mat-icon[@mattooltip=\"Settings\"]")
    private WebElement settingsButton;

    @FindBy(xpath = "//a[text() = 'Logout']")
    private WebElement logoutButton;

    @FindBy(css = "div.table")
    private WebElement reLogginbutton;

    @FindBy(css = "#otherTileText")
    private WebElement otherLoginButton;

    @FindBy(xpath = "//input[@value=\"Accept\"]")
    private WebElement acceptButton2;

    @FindBy(xpath = "//mat-spinner")
    private List<WebElement> allSpinners;

    @FindBy(xpath = "//mat-progress-spinner")
    private List<WebElement> allMatProgressSpinners;

    public MicrosoftLoginPo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void fillUserName() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(this.emailField));
        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        String password = "";

        if (Thread.currentThread().getName().equals("main")) {
            this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
            password = variables.getProperty("fulfilld.password.1");
        } else {
            String[] threadName = Thread.currentThread().getName().split("-");
            float threadNumber = Float.parseFloat(threadName[3]);

            if (threadNumber % 2 == 0.0) {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
                password = variables.getProperty("fulfilld.password.1");
            } else {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.2"));
                password = variables.getProperty("fulfilld.password.2");
            }
        }

        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.passwordField));
        this.passwordField.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(this.continueBtn));
        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.settingsButton));
        waitUntilAllSpinnersDisappear();

    }

    public void fillUserName(String section) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(this.emailField));
        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        String password = "";


        if (Thread.currentThread().getName().equals("main")) {
            this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
            password = variables.getProperty("fulfilld.password.1");
        } else {
            String[] threadName = Thread.currentThread().getName().split("-");
            float threadNumber = Float.parseFloat(threadName[3]);

            if (threadNumber % 2 == 0.0) {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
                password = variables.getProperty("fulfilld.password.1");
            } else {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.2"));
                password = variables.getProperty("fulfilld.password.2");
            }
        }

        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.passwordField));
        this.passwordField.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(this.continueBtn));
        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        this.continueBtn.click();

        if (section.equals("AMS")) {
            waitUntilAllSpinnersDisappear();

        } else {
            wait.until(ExpectedConditions.visibilityOf(this.settingsButton));
            waitUntilAllSpinnersDisappear();
        }
    }

    public void fillUserNameInvoice() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(this.emailField));
        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        String password = "";


        if (Thread.currentThread().getName().equals("main")) {
            this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
            password = variables.getProperty("fulfilld.password.1");
        } else {
            String[] threadName = Thread.currentThread().getName().split("-");
            float threadNumber = Float.parseFloat(threadName[3]);

            if (threadNumber % 2 == 0.0) {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.1"));
                password = variables.getProperty("fulfilld.password.1");
            } else {
                this.emailField.sendKeys(variables.getProperty("fulfilld.email.2"));
                password = variables.getProperty("fulfilld.password.2");
            }
        }

        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.passwordField));
        this.passwordField.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(this.continueBtn));
        this.continueBtn.click();

        wait.until(ExpectedConditions.visibilityOf(this.continueBtn));
        this.continueBtn.click();
        waitUntilAllSpinnersDisappear();
    }

    public void clickSomething() throws InterruptedException {
        this.continueBtn.click();
    }

    public void waitUntilAllSpinnersDisappear() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1))
                .ignoring(NoSuchElementException.class);

        wait.until(
                driver -> allSpinners.size() == 0
        );
    }

    public void waitUntilAllSpinnersDisappear(List<WebElement> modal, WebElement button) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(200))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                if (allSpinners.size() == 0 && modal.size() == 0) {
                    return true;
                }
                if (modal.size() > 0) {
                    clickElement(button);
                    return false;
                }
                return false;
            }
        };

        wait.until(function);
    }

    public void waitUntilAllSpinnersDisappear(int previousWait) throws InterruptedException {
        Thread.sleep(previousWait);

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class);

        wait.until(
                driver -> allSpinners.size() == 0 && allMatProgressSpinners.size() == 0
        );

        if(allSpinners.size() == 0 || allMatProgressSpinners.size() == 0 ){
            System.out.println("Mat spinner never disappear");
        }
    }

}
