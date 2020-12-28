package DashboardTests;


import Login.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;



public class DashboardTests extends LoginTests {

    @Test
    public void VerifyLoginPopUp(){
        dashboardPage.VerifyLoginPopUp();
        System.out.println("The loginPopUp was displayed");
    }
    @Test(priority = 3)
    public void assertpageURL() throws InterruptedException{
        String LoginURL = "https://www.konga.com/";
        Assert.assertEquals(dashboardPage.getDashBoardURL(),LoginURL, "you have successfully logged in");
        Thread.sleep(4000);
        System.out.println("you have successfully logged in. Login Page URL is" +dashboardPage.driver.getCurrentUrl());
    }

    @Test(priority = 4)
    public void assertname() throws InterruptedException {
        dashboardPage.clickProfileButton();
        Thread.sleep(4000);
        if (dashboardPage.driver.getPageSource().contains("Test")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

        @Test(priority = 5)
        public void pageTitle () throws InterruptedException {
            dashboardPage.clickCategories();
            Thread.sleep(2000);
            String PageTitle = dashboardPage.driver.getTitle();
            System.out.println("the page Title is " + PageTitle);
            Thread.sleep(5000);
        }

        @Test(priority = 6)
        public void assertItems () {
            if (dashboardPage.driver.getPageSource().contains("computing Accessories")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }

            if (dashboardPage.driver.getPageSource().contains("computer Software")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }

            if (dashboardPage.driver.getPageSource().contains("pc Gaming")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }

            if (dashboardPage.driver.getPageSource().contains("computing Bundles")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }

            if (dashboardPage.driver.getPageSource().contains("Desktop and Monitors")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }
        }
        @Test(priority = 7)
        public void successfulLogout ()throws InterruptedException {
            Thread.sleep(2000);
            dashboardPage.clickLogoutButton();
            Thread.sleep(2000);
            String FinalURL = dashboardPage.driver.getCurrentUrl();
            System.out.println("you have successfully logged out.  Page URL is" + FinalURL);
        }
    }