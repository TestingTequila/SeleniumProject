package SeleniumAdditionalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods
{
    //sendKeys --> To pass any value in the textbox
    //click --> to perform click on any button
    //getText() ---> To capture text on any web element
    //getAttribute()---> To print the attribute value of any webElement


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement emailTextBox =driver.findElement(By.id("email"));
        emailTextBox.sendKeys("jason.roger@gmail.com");
        WebElement passwordTextBox=driver.findElement(By.name("login"));
        String buttonText=passwordTextBox.getText();
        System.out.println("Text on Button is: " + buttonText);
        String attributeValue=passwordTextBox.getAttribute("data-testid");
        System.out.println("Attribute Value is: " + attributeValue);
        passwordTextBox.click();


    }
}
