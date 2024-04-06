package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonActions
{
    static WebDriver driver;
    public  static WebDriver launchBrowser(String browserType)
    {
        //1. Open the browser

        if(browserType.equals("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browserType.equals("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browserType.equals("Edge"))
        {
            driver = new EdgeDriver();
        }
        else if(browserType.equals("IE"))
        {
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("This is an invalid browser Type....");
        }
        return driver;
    }

    public static void closeBrowser()
    {
        driver.close();
    }
}
