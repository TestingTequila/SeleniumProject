package day31.POM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccount
{
    WebDriver driver;
    public MyAccount(WebDriver driver)
    {
           this.driver=driver;
    }

    public  void validateLoginStatus()
    {
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals(loginPageTitle,"My Account" );
    }
}
