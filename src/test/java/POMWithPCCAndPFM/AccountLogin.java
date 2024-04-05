package POMWithPCCAndPFM;

import day31.POM.MyAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin
{
    WebDriver driver;
    public AccountLogin(WebDriver driver)
    {
       this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTextBox;

    @FindBy(xpath ="//input[@id='input-password']" )
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;

    public  void enteringEmailId(String emailId)
    {
        emailTextBox.sendKeys(emailId);
    }

    public  void enteringPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }

    public MyAccount clickOnLoginButton()
    {
        loginButton.click();
        return new MyAccount(driver);
    }
}
