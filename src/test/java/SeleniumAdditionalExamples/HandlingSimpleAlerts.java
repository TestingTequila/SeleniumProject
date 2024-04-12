package SeleniumAdditionalExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement alertInitBtn =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        alertInitBtn.click();
        Alert a = driver.switchTo().alert();
        Thread.sleep(3000);
        a.accept();
    }
}
