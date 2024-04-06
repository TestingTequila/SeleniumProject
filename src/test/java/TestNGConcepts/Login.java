package TestNGConcepts;

import day31.POM.MyAccount;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;
    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        //1. Open the browser
        driver = CommonActions.launchBrowser(AppData.BROWSER_TYPE);
        //2. Enter the application url
        driver.get(AppData.APP_URL);
    }

    @AfterMethod
    public  void closeBrowser()
    {
        //9. Close the Browser
        CommonActions.closeBrowser();
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() throws InterruptedException {
        //3. Click on My Account Icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4. Click on Login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5. Enter correct email
        al.enteringEmailId(AppData.USER_EMAIL_ID);

        //6. Enter correct password
        al.enteringPassword(AppData.USER_PASSWORD);

        //7. Click on Login button
        MyAccount ma =al.clickOnLoginButton();

        //8. Validate Login Status
        ma.validateLoginStatus();
    }
    @Test(priority = 2)
    public void loginWithInValidEmailId() throws InterruptedException {
        //3. Click on My Account Icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4. Click on Login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5. Enter correct email
        al.enteringEmailId(AppData.USER_INVALID_EMAIL_ID);

        //6. Enter correct password
        al.enteringPassword(AppData.USER_PASSWORD);

        //7. Click on Login button
        MyAccount ma =al.clickOnLoginButton();

        //8. Validate Login Status
        ma.validateLoginStatus();
    }
    @Test(priority = 3)
    public void loginWithInValidPassword() throws InterruptedException {
        //3. Click on My Account Icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4. Click on Login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5. Enter correct email
        al.enteringEmailId(AppData.USER_EMAIL_ID);

        //6. Enter correct password
        al.enteringPassword(AppData.USER_INVALID_PASSWORD);

        //7. Click on Login button
        MyAccount ma =al.clickOnLoginButton();

        //8. Validate Login Status
        ma.validateLoginStatus();
    }







}
