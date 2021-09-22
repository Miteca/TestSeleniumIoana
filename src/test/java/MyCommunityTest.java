import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyCommunityTest extends LogInLogOutPage{

    @Test
    public void shareAnIdea(){
        wait = new WebDriverWait(driver, 10, 500);
        // select MyCommunity Menu Option
        WebElement myCommunityOption = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.myCommunityOption));
        myCommunityOption.click();

        // check if myCommunity page is displayed
        WebElement myComunityName = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.myQAName));
        String nameQA = myComunityName.getText();
        String nameQATxt = "QA";
        assertEquals(nameQA,nameQATxt);

        //click on the button "Get involved"
        WebElement getInvolvedButton =  wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.getInvolvedBtn));
        getInvolvedButton.click();

        // check if Share an idea is displaed
        WebElement shareAnIdeaMenu = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.shareAnIdeaOption));
        shareAnIdeaMenu.click();

        // add a title
        //WebElement addTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.addTitleWithXpath));
        WebElement addTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.addTitleTextBox));
        addTitle.sendKeys("K6");
        String getTitleText = addTitle.getAttribute("value");
        String titleText = "K6";
        assertEquals("Title is: ",getTitleText,titleText);

        WebElement addLocation = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.addLocationTextBox));
        addLocation.sendKeys("http://google.com");
    }
}
