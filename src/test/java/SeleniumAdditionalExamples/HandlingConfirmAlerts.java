package SeleniumAdditionalExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement alert_with_OK_Cancel= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        alert_with_OK_Cancel.click();
        WebElement alertInitBtn =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alertInitBtn.click();
        Alert a = driver.switchTo().alert();
        Thread.sleep(3000);
        a.dismiss();
    }
}
