package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class setUps {
    //create a WebDriver Object
    protected WebDriver driver;
    //create Loginpage Object
    public static LoginPage loginpage;
    public static DashboardPage dashboardPage;

    @BeforeTest
    public void setup()
    {
        //Browser setup for chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\UI_AUTOMATION\\Selenium_WebDriver\\POM\\Deydam\\resources/chromedriver.exe");
        //Instantiate WebDriver Object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //launch the applicataion
        driver.get("https://www.konga.com/");

        //Instatiate Login page after launching the browser
        loginpage= new LoginPage(driver);
        dashboardPage= new DashboardPage(driver);
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}



