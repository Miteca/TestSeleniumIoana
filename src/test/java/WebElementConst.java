import org.openqa.selenium.By;

public class WebElementConst {
    public static final By usernameId = By.id("username");
    public static final By passwordId = By.id("password");
    public static final By logginButtonId = By.id("kc-login");

    public static final By threeDotsId = By.id("three-dots-menu-option");
    public static final By logOutOption = By.xpath("//gop-dropdown-ui/a[3]");

    public static final By commentsOverview = By.xpath("//input[@class='input-field-basic notification-card-input ng-pristine ng-invalid ng-touched']");

    public static final By overViewMenu = By.xpath("//user-detail/section/nav/a[1]");
    public static final By awardsMenu = By.xpath("//user-detail/section/nav/a[2]");
    public static final By activityMenu = By.xpath("//user-detail/section/nav/a[3]");
    public static final By questsMenu = By.xpath("//user-detail/section/nav/a[4]");

    public static final By pointsValueUser = By.xpath("//user-header-card/div/div[1]/div[2]/div[2]/span");
    public static final By nameUserNameAutoSelected = By.xpath("//notification[1]/mat-card/mat-card-header/div[2]/mat-card-subtitle/span/a[2]");
    public static final By nameUserAuto = By.xpath("//pod-header-card/header/div/section[1]/div/h2");
    public static final By positionValueMember = By.xpath("//span[@class=\"pod-ranking\"]");
    public static final By pointsValueMember = By.xpath("//span[@class=\"pod-ranking ng-star-inserted\"]");

    public static final By membersMenuOption = By.xpath("//app-pod-page/div[2]/ul/a[2]");
    public static final By awardsMenuOption = By.xpath("//app-pod-page/div[2]/ul/a[3]");

    public static final By textDescriptionFirstAwards = By.xpath("//regular-items-list/div/div/div/div[1]/div/div/div[2]/h4");
    public static final By dateOfAddDescriptionFirstAwards = By.xpath("//pod-page-awards/div/regular-items-list/div/div/div/div[1]/div/div/div[2]/div/h4");

    public static final By myCommunityOption = By.xpath("//gop-new-nav-bar-ui/nav/div[1]/div[3]/a");
    public static final By myQAName = By.xpath("//gop-community-details/div[2]/div[1]");
    public static final By getInvolvedBtn = By.xpath("//button[@class=\"empty-list__button ng-star-inserted\"]");

    public static final By shareAnIdeaOption = By.xpath("//*[@id=\"mat-tab-label-0-2\"]/div/span");
    public static final By addTitleWithXpath = By.xpath("//input[@formcontrolname='title']");
    public static final By addTitleTextBox = By.cssSelector("input[formcontrolname=title]");
    public static final By addLocationTextBox = By.cssSelector("input[formcontrolname=location]");

    public static final By membersOption = By.xpath("//gop-new-nav-bar-ui/nav/div[1]/div[4]/a");
    public static final By addUserBtn = By.id("add-user-button");

    public static final By titleAddUserForm = By.xpath("//div[@class='title']");
    // Add User form
    public static final By drodpownType = By.id("user-type-input-panel");
    public static final By userType = By.id("user-type-input");
    public static final By userOptionUser = By.id("mat-option-25");

    public static final By userRole = By.id("user-role-input");
    public static final By roleTeamMember = By.xpath("//span[@class='mat-option-text'][contains(text(),'Team/Pod Member')]");
    //public static final By roleTeamMember =  By.xpath("//*[contains(text(),'Team/Pod Member')]");
    public static final By roleListDropdown = By.id("user-role-input-panel");
    public static final By nicknameText = By.id("nickname-input");
    public static final By firstNameText = By.id("first-name-input");
    public static final By lastNameText = By.id("last-name-input");
    public static final By emailText = By.id("email-input");

    public static final By mottoText = By.id("motto-input");
    public static final By guildDropdown = By.id("guild-input");
    public static final By guildPanel = By.id("guild-input-panel");
    public static final By qaEngineeringOpt = By.id("mat-option-18");
    public static final By communityDropdown = By.id("community-input");
    public static final By qaOpt = By.id("mat-option-26");
    public static final By jobTitleText = By.id("job-title-input");
    public static final By communityPanel = By.id("community-input-panel");

    public static final By saveChangesButton = By.id("save-changes-button");
    public static final By addUserWindow = By.id("mat-dialog-0");

    public static final By messageContainer = By.xpath("//div[@class='message-container']/span");
    public static final By searchMemberInput = By.id("search-member-input");
    public static final By userFound = By.xpath("//h3[@class='ng-star-inserted']");
    //public static final By paginatorOne = By.xpath("//div[@class='mat-paginator-range-label'][contains(text(),' 1 – 1 of 1 ')]");
    public static final By paginatorOne = By.xpath("//*[contains(text(),' 1 – 1 of 1 ')]");

}
