package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNgBasics
{
//    @AfterMethod
//    public void closeBrowser()
//    {
//        System.out.println("@AfterMethod---Closing Browser");
//    }
    @Test(priority = 2, dependsOnMethods = "registration")
    public  void login()
    {
        System.out.println("@Test---This is my Login test case");
    }

    @Test(priority=1)
    public void registration()
    {
        System.out.println("@Test---This is my Registration test case");
        Assert.fail();
    }

    @Test(priority = 3, enabled = false)
    public void addProductToCart()
    {
        System.out.println("@Test---This is my add Product test case");
    }

    @Test(priority = 4, groups = "smoke")
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

    @Test(priority = 6, groups = "smoke")
    public void logout()
    {
        System.out.println("@Test---Log out from the application");
        Assert.fail();
    }

    @Test(priority = 5, enabled = true, groups = "Sanity", dependsOnGroups = "smoke")
    public void contactUs()
    {
        System.out.println("@Test---Contact Us details from the application");
    }

    @Test(dataProvider = "getData")
    public void printStudentDetails(String name, int marks)
    {
        System.out.println("Name of Student: " + name + " and Marks scored is: " + marks );
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = {{"Ashish", 20}, {"Jason", 18}, {"Kerrie", 19}};
        return data;
    }

    public int sum(int a, int b)
    {
        int total = a+b;
        return total;
    }

    @Test
    public  void validateResult()
    {
        Assert.assertEquals(sum(12,8), 22);
        System.out.println("This is validateResult Test case");
    }
    @Test
    public  void validateResult3()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(sum(12,8), 22);
        System.out.println("This is validateResult Test case");
        sa.assertAll();
    }

    @Test
    public  void validateResult2()
    {
        Assert.assertNotEquals(sum(12,8), 22);
    }

    public boolean checkBiggerNumber(int a, int b)
    {
        boolean check;
        if(a>b) {
            check=true;
        }
        else
        {
            check=false;
        }

        return check;
    }

    @Test
    public  void CheckResult()
    {
        Assert.assertTrue(checkBiggerNumber(12,4));
    }

    @Test
    public  void CheckResult2()
    {
        Assert.assertFalse(checkBiggerNumber(12,44));
    }

}
