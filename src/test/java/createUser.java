import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

import static org.testng.Assert.assertEquals;


public class createUser extends LogInLogOutPage {
    @Test
    public void addUser() {
        wait = new WebDriverWait(driver, 15, 500);
        // click on the members Menu Option
        WebElement membersOption = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.membersOption));
        membersOption.click();

        // click on the button Add USER
        WebElement addUserButton = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.addUserBtn));
        addUserButton.click();

        WebElement titleForm = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.titleAddUserForm));

        if (titleForm.isDisplayed()) {
            // select User Type
//            WebElement userTypeForm = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.userType));
//            userTypeForm.click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.drodpownType));
//            WebElement userOpt = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.userOptionUser));
//            userOpt.click();
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(WebElementConst.drodpownType));

            // select Role
            WebElement roleForm = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.userRole));
            roleForm.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.roleListDropdown));
            WebElement deliveryMemberOption = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.roleTeamMember));
            deliveryMemberOption.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(WebElementConst.roleListDropdown));

            // write Nickname
            WebElement nickNameTxt = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.nicknameText));
            nickNameTxt.sendKeys("ToBeDeleted_" + this.generateTimeStamp());
            String nick = nickNameTxt.getAttribute("value");
            System.out.println("Nickname: " + nick);
            // write firstName
            WebElement firstNameTxt = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.firstNameText));
            firstNameTxt.sendKeys("ToBeAuto " + this.generateTimeStamp());

            //write lastName
            WebElement lastNameTxt = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.lastNameText));
            lastNameTxt.sendKeys("  Last " + this.generateTimeStamp());

            // email
            WebElement emailText = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.emailText));
            emailText.sendKeys("tobedeleted_" + this.generateTimeStamp() + "@softvision.com");

            //moto
            WebElement mottoText = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.mottoText));
            mottoText.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

            //select Guid
            WebElement guidOption = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.guildDropdown));
            guidOption.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.guildPanel));
            WebElement quidQaEngineeringOpt = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.qaEngineeringOpt));
            quidQaEngineeringOpt.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(WebElementConst.guildPanel));

            //select Community
            WebElement communityOption = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.communityDropdown));
            communityOption.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.communityPanel));
            WebElement qaOpt = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.qaOpt));
            qaOpt.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(WebElementConst.communityPanel));

            // job Title
            WebElement jobTitle = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.jobTitleText));
            jobTitle.sendKeys("QA");

            // click on the SaveChanges
            WebElement saveChangesButton = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.saveChangesButton));
            saveChangesButton.click();

            wait.until(ExpectedConditions.invisibilityOfElementLocated(WebElementConst.addUserWindow));

            WebElement windowValidation = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.messageContainer));
            String text = windowValidation.getText();
            String validateText = "User successfully created!";
            System.out.println("Text message container is: "+text);
            assertEquals(validateText,text);

            WebElement searchUser = wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.searchMemberInput));
            searchUser.sendKeys(nick + Keys.ENTER);

            wait.until(ExpectedConditions.visibilityOfElementLocated(WebElementConst.paginatorOne));
            WebElement userFound = wait.until(ExpectedConditions.elementToBeClickable(WebElementConst.userFound));
            String userName = userFound.getText();

            System.out.println("User Name founded is : " + userName);

            assertEquals(userName,nick);

        } else {
            System.out.println("Add User Form is not visible");
        }
    }

    public String generateString(int count) {
        String generatedString = RandomStringUtils.randomAlphabetic(count);
        return generatedString;
    }


    public long generateTimeStamp(){
        Date date = new Date();
        long time = date.getTime();
        return time;
    }
}
