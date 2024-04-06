package TestNGConcepts;

import org.testng.annotations.*;

public class TestNgBasics
{
//    @AfterMethod
//    public void closeBrowser()
//    {
//        System.out.println("@AfterMethod---Closing Browser");
//    }
    @Test(priority = 2)
    public  void login()
    {
        System.out.println("@Test---This is my Login test case");
    }

    @Test(priority=1)
    public void registration()
    {
        System.out.println("@Test---This is my Registration test case");
    }

    @Test(priority = -3)
    public void addProductToCart()
    {
        System.out.println("@Test---This is my add Product test case");
    }

    @Test(priority = -4)
    public void addAddressToProfile()
    {
        System.out.println("@Test---This is my add Product test case");
    }


//    @BeforeMethod
//    public void openTheBrowserEnterTheUrl()
//    {
//        System.out.println("@BeforeMethod---Browser Opened and Entering URL");
//    }
//
//    @BeforeClass
//    public void connectWithDb()
//    {
//        System.out.println("BeforeClass---Connecting with Database");
//    }
//
//    @AfterClass
//    public void disConnectWithDb()
//    {
//        System.out.println("AfterClass---DisConnecting with Database");
//    }
//
//    @BeforeTest
//    public void addDataInDb()
//    {
//        System.out.println("@BeforeTest---Adding data in data base");
//    }
//
//    @AfterTest
//    public void removeDataInDb()
//    {
//        System.out.println("@AfterTest---Removing data in data base");
//    }
//
//    @BeforeSuite
//    public void createDb()
//    {
//        System.out.println("@BeforeSuite---Create Database");
//    }
//
//    @AfterSuite
//    public void dropDb()
//    {
//        System.out.println("@AfterSuite---Drop Database");
//    }

    @Test
    public void logout()
    {
        System.out.println("@Test---Log out from the application");
    }

    @Test
    public void contactUs()
    {
        System.out.println("@Test---Contact Us details from the application");
    }
}
