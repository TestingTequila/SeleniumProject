package SeleniumAdditionalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDropExamples
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement bankSource=driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement bankDestination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Actions a = new Actions(driver);
        Thread.sleep(3000);
        a.dragAndDrop(bankSource,bankDestination ).build().perform();

    }
}
