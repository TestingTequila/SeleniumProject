package POMWithPCC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourStore
{
    WebDriver driver;
    public YourStore(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickOnMyAccountIcon() throws InterruptedException {
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(2000);
    }

    public  AccountLogin clickOnLoginLink()
    {
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
        return new AccountLogin(driver);
    }
}
