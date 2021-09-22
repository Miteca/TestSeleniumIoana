import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class NavigateBrowser extends LogInLogOutPage {
    WebDriverWait wait;
    WebElementConst objectMenu = new WebElementConst();
     @Test
    public void navigateToMyCommunity() {
        String newUrl = driver.getCurrentUrl();
        System.out.println("New URL is: " + newUrl);

        wait = new WebDriverWait(driver, 10, 500);
        WebElement awardsObj = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.commentsOverview));
        awardsObj.sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0)); //switches to new tab
        driver.get("https://test.gameofpods.com/user/list");
        String urlActivity = driver.getCurrentUrl();
        System.out.println("Url Activity is: " + urlActivity);

        awardsObj.sendKeys(Keys.CONTROL + "n");
        driver.switchTo().window(tabs.get(0)); //switches to new tab
    }
}



