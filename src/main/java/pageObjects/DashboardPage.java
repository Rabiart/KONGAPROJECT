package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;
//using by to locate dashboard elements

    private By LoginPopup = By.xpath("<span>My Account</span>");
    private By ProfileButton = By.linkText("My Account");
    private By CategoriesButton = By.linkText("Computers and Accessories");
    private By LaptopsButton = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/label/span");
    private By MacBookButton = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/ul/li[1]/a/label/span");
    private By LogoutButton = By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");

    public void VerifyLoginPopUp() {
    }

    // using By to Locate DashboardPage elements
    //*[@id="app-content-wrapper"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/svg
    // *[@id="app-content-wrapper"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span


    public void verifyLoginPopup()  {
        driver.findElement(LoginPopup).isDisplayed();
        //verify the successful LoginPopUp
    }

    public String getDashBoardURL(){
        WebDriverWait wait =new WebDriverWait(driver, 20);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://www.konga.com/"));
        return driver.getCurrentUrl();
    }

    public void clickProfileButton(){
        driver.findElement(ProfileButton).click();
        //click profile button
    }

    public void clickCategories(){
        driver.findElement(CategoriesButton).click();
        //click categories button
    }

    public LoginPage clickLogoutButton() throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(LaptopsButton).click();
        Thread.sleep(5000);
        driver.findElement(MacBookButton).click();
        Thread.sleep(10000);
        driver.findElement(ProfileButton).click();
        Thread.sleep(10000);
        driver.findElement(LogoutButton).click();
        Thread.sleep(10000);
        return new LoginPage(driver);
    }
}
