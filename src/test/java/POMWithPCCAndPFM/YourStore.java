package POMWithPCCAndPFM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class YourStore
{
    WebDriver driver;
    public YourStore(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='fa fa-user']")
    WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginLink;

    public void clickOnMyAccountIcon() throws InterruptedException {
        myAccountIcon.click();
        Thread.sleep(2000);
    }

    public AccountLogin clickOnLoginLink()
    {
        loginLink.click();
        return new AccountLogin(driver);
    }
}
