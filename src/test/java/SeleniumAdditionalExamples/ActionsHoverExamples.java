package SeleniumAdditionalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHoverExamples
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shopclues.com/wholesale.html");
        WebElement sportsAndMoreTab=driver.findElement(By.xpath("//a[text()='Sports & More']"));
        Actions a = new Actions(driver);
        a.moveToElement(sportsAndMoreTab).build().perform();
        Thread.sleep(3000);
        WebElement weightGainerLink= driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
        weightGainerLink.click();
    }
}
