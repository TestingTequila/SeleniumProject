package LoginWithoutDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithCorrectCredentials {

    public static void main(String[] args) throws InterruptedException {
        //1. Open the browser
        WebDriver driver = new ChromeDriver();
        //2. Enter the application url
        driver.get("https://janbaskdemo.com/");
        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(2000);
        //4. Click on Login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
        //5. Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("zubair.ansari@janbask.com");
        //6. Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");
        //7. Click on Login button
        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        //8. Validate Login Status
        String loginPageTitle=driver.getTitle();
        if(loginPageTitle.equals("My Account"))
        {
            System.out.println("Login is successful");
        }
        else
        {
            System.out.println("Login Failed...Please check your credentials");
        }
        //9. Close the Browser
        driver.close();

    }

}
