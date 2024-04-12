package SeleniumAdditionalExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HandlingMultipleWindows
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        WebElement txtSearch= driver.findElement(By.id("inputValEnter"));
        txtSearch.sendKeys("Hand Sanitizer");
        WebElement btnSearch= driver.findElement(By.xpath("//span[text()='Search']"));
        btnSearch.click();
        WebElement firstImage=driver.findElement(By.xpath("(//img[contains(@class,'product-image')])[1]"));
        firstImage.click();

        String parentWindowId=driver.getWindowHandle(); //[123]
        Set<String> allWindow= driver.getWindowHandles(); //[123, 456]


        for(String cd: allWindow)
        {
            if(!(parentWindowId.equals(cd)))
            {
                driver.switchTo().window(cd);
            }
        }
        WebElement addToCartBtn=driver.findElement(By.xpath("//span[text()='add to cart']"));
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        addToCartBtn.click();
    }
}
