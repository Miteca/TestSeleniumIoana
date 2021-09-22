import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class LogInLogOutPage {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeSuite
    public void logInPageTest() {
        System.setProperty(ConstantGeneral.CHROME_DRIVER, ConstantGeneral.PATCH_CHROME_DRIVER);
        ChromeOptions chromeOptions = new ChromeOptions();
        // 23 SECUNDE
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver();
        // full screen window
        driver.manage().window().maximize();
        // navigate to a website
        driver.get(ConstantGeneral.WEBSITE);
        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();
        System.out.println("Parent is: " + parent);
        // get URL for website
        String url = driver.getCurrentUrl();
        System.out.println("URL is: " + url);

        wait = new WebDriverWait(driver, 10, 500);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.usernameId));
        js.executeScript("arguments[0].value='" + ConstantGeneral.USER_NAME + "';", email);
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.passwordId));
        js.executeScript("arguments[0].value='"+ConstantGeneral.PASSWORD +"';",password);

        WebElement buttonLogIn = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.logginButtonId));
        js.executeScript("arguments[0].click();", buttonLogIn);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("spinner-container")));
    }
//    @AfterSuite
//    public void logOutPage() {
//        // log Out methods
//        wait = new WebDriverWait(driver, 10);
//        WebElement threeDotsMenu = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.threeDotsId));
//        threeDotsMenu.click();
//        WebElement logOutOption = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.logOutOption));
//        String logOutTxt = logOutOption.getText();
//        System.out.println("Option " + logOutTxt + " is visible");
//        logOutOption.click();
//    }
//
//    @AfterSuite
//    public void closeBrowser(){
//        // method to close Browser and quit()
//        driver.close();
//        driver.quit();
//    }
}

