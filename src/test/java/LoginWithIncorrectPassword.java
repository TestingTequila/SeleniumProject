import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithIncorrectPassword {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://janbaskdemo.com/");
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        Thread.sleep(2000);
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("ben.fletcher@janbask.com");
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@12345");
        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        String loginPageTitle=driver.getTitle();
        if(loginPageTitle.equals("My Account"))
        {
            System.out.println("Login is successful");
        }
        else
        {
            System.out.println("Login Failed...Please check your credentials");
        }
        driver.close();

    }

}
