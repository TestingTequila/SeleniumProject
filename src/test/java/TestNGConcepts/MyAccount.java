package TestNGConcepts;

import org.openqa.selenium.WebDriver;

public class MyAccount
{
    WebDriver driver;
    MyAccount(WebDriver driver)
    {
           this.driver=driver;
    }

    public  void validateLoginStatus()
    {
        String loginPageTitle = driver.getTitle();
        if (loginPageTitle.equals("My Account")) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login Failed...Please check your credentials");
        }
    }
}
