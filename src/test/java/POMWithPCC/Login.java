package POMWithPCC;

import day31.POM.MyAccount;
import org.openqa.selenium.WebDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        //1. Open the browser
        WebDriver driver = CommonActions.launchBrowser("Chrome");
        //2. Enter the application url
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account Icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4. Click on Login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5. Enter correct email
        al.enteringEmailId("ben.fletcher@janbask.com");

        //6. Enter correct password
        al.enteringPassword("test@1234");

        //7. Click on Login button
        MyAccount ma =al.clickOnLoginButton();

        //8. Validate Login Status
        ma.validateLoginStatus();

        //9. Close the Browser
        CommonActions.closeBrowser();

    }

}
