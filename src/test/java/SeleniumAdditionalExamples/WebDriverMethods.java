package SeleniumAdditionalExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods
{
    //get()      --> Launching the mentioned url in the browser
    //getTitle() --> Get the title of current page
    //getCurrecntUrl()--> To capture the url of current
    //close()---> To close the browser
    //quit() ---> To close all the browsers in current session
    //manage().window().maximize() --> To open browser in maximize mode
    //switchTo().alert()--> Switch to alert

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String pageTitle= driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        String currentPageUrl=driver.getCurrentUrl();
        System.out.println("Current Page URL is: "+ currentPageUrl);
        driver.manage().window().maximize();
        driver.close();
    }

}
