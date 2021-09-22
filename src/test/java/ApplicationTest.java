import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ApplicationTest extends LogInLogOutPage {
    public JavascriptExecutor javascript;
    public WebDriverWait wait;
    @Test
    public void applicationTest() {
        wait = new WebDriverWait(driver, 10,500);
        WebElement overViewWebElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.overViewMenu));
        String overViewWebElementText = overViewWebElement.getText();
        String overViewText = "Overview";
        assertEquals(overViewWebElementText,overViewText);
        System.out.println("Assert is true and name is: " + overViewWebElementText);

        WebElement awardsWebElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.awardsMenu));
        String awardsWebElementText = awardsWebElement.getText();
        String awardsText = "Awards";
        assertEquals(awardsWebElementText,awardsText);
        System.out.println("Assert is true and name is: " + awardsWebElementText);

        WebElement activityWebElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.activityMenu));
        String activityWebElementText = activityWebElement.getText();
        String activityText = "Activity";
        assertEquals(activityWebElementText,activityText);
        System.out.println("Assert is true and name is: " + activityWebElementText);

        WebElement questsWebElement =wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.questsMenu));
        String questsWebElementString = questsWebElement.getText();
        String questsText = "Quests";
        assertEquals(questsWebElementString,questsText);
        System.out.println("Assert is true and name is: " + questsWebElementString);

        WebElement pointsValue = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.pointsValueUser));
        String pointsText = "3260";
        String points = pointsValue.getText();
        assertEquals(pointsText,points);
        System.out.println("Assert  for points is true");

        //select AUTO_podWith2Quests
        WebElement userNameAuto = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.nameUserNameAutoSelected));
        userNameAuto.click();

        WebElement nameMember = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.nameUserAuto));
        String nameMemberTxt = nameMember.getText();
        String nameAutoPod = "AUTO_podWith2Quests";
        assertEquals(nameMemberTxt,nameAutoPod);
        System.out.println("Name is : " + nameMemberTxt);

        WebElement positionMember =  wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.positionValueMember));
        String positionMemberTxt = positionMember.getText();
        System.out.println("Position for " + nameMemberTxt + " is: " + positionMemberTxt);

        WebElement pointsMember = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.pointsValueMember));
        String pointsMemberTxt = pointsMember.getText();
        System.out.println("Points for " + nameMemberTxt + " is: " + pointsMemberTxt);

        WebElement membersMenuTxt = wait.until(ExpectedConditions
                .elementToBeClickable(WebElementConst.membersMenuOption));
        String membersMenu = membersMenuTxt.getText();
        System.out.println("Text Members: " + membersMenu);

        WebElement awardsObj = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.awardsMenuOption));
        awardsObj.click();
        WebElement textForFirstAward = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.textDescriptionFirstAwards));
        String textForFirstAwardTxt = textForFirstAward.getText();
        String descriptionAwardTxt = "For having a Quality Assurance Tester in your Pod";
        assertEquals(textForFirstAwardTxt,descriptionAwardTxt);
        System.out.println("Text is: " + textForFirstAwardTxt);

        WebElement periodAwards = wait.until(ExpectedConditions
                .visibilityOfElementLocated(WebElementConst.dateOfAddDescriptionFirstAwards));
        String periodAwardsTxt = periodAwards.getText();
        String months = "5 months ago";
        System.out.println("Text 2 is: " + periodAwardsTxt);
        assertEquals(periodAwardsTxt,months);

//        javascript = (JavascriptExecutor) driver;
//        //get current page title
//        String pageTitle = (String)javascript.executeScript("return document.title");
//        System.out.println("My Page Title is : "+pageTitle);
//
//        // get domain
//        String domainUsingJS=(String)javascript.executeScript("return document.domain");
//        System.out.println("My Current URL Is  : "+domainUsingJS);
//
//        javascript.executeScript("alert('Test Case Execution Is started Now..');");
//        driver.switchTo().alert().accept();


    }
}


