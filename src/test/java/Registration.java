import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class Registration
{
    public static void main(String[] args) {
        //1. Open the Browser
        WebDriver driver = new ChromeDriver();
        //2. Enter the url
        driver.get("https://janbaskdemo.com/");
        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        //4. Click on Register Link
        WebElement registerLink=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();
        //5. Fill the Registration form
        WebElement firstNameTextBox= driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("Zubair");
        WebElement lastNameTextBox=driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Ansari");
        WebElement emailTextBox= driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("zubair.ansari@janbask.com");
        WebElement telephoneTextBox=driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("54345345");
        WebElement countryDdl=driver.findElement(By.id("input-country"));
        Select country = new Select(countryDdl);
        country.selectByValue("99");
        WebElement passwordTextBox=driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");
        WebElement confirmPasswordTextBox=driver.findElement(By.id("input-confirm"));
        confirmPasswordTextBox.sendKeys("test@1234");
        WebElement subscribeYesRadioButton=driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']"));
        subscribeYesRadioButton.click();
        WebElement subscriptionDdl=driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByVisibleText("Occasional Updates");
        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckBox= driver.findElement(By.name("agree"));
        privacyPolicyCheckBox.click();
        //7. Click on Continue button
        WebElement continueButton= driver.findElement(By.id("submitbtn"));
        continueButton.click();
        //8. Validate Registration status
        String registerPageTitle=driver.getTitle();
        System.out.println("Current Page Title: " + registerPageTitle);
        if(!Objects.equals(registerPageTitle, "Register Account"))
        {
            System.out.println("Registration is Successful");
        }
        else
        {
            System.out.println("User with this email id already exists...");
        }
        //9. Close the browser
        driver.close();


    }
}
