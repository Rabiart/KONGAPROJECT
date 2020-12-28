package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;
    //Using By as a Locator for Elements
    private By logindropdown = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a");
    private By username = By.id("username");
    private By password = By.id("password");
    private By Loginbuttn = By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button");

    public void clicklogindropdown() {
        //find the Username element and enter the username
        driver.findElement(logindropdown).click();
    }

    public void enterUsername(String uName) {
        //find the Username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
        //   passwordField.sendKeys("Opeyemi@21");
    }

    public DashboardPage clickLoginBtn() {
        driver.findElement(Loginbuttn).click();
        return new DashboardPage(driver);
    }
}