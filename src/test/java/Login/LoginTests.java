package Login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class LoginTests extends setUps {

    @Test(priority = 1)
    public void testsuccessfullogin() throws InterruptedException{
        loginpage.clicklogindropdown();
        Thread.sleep(2000);
        loginpage.enterUsername("opeyemirabiat@gmail.com");
        Thread.sleep(2000);
        loginpage.enterUserPassword("Opeyemi@21");
        Thread.sleep(2000);
        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        Thread.sleep(2000);

        String pagetitle = "Konga";
        if(loginpage.driver.getTitle().contains(pagetitle)) {
            System.out.println("The page Title is " +pagetitle);
        } else{
            System.out.println("The page title is incorrect. Actual page Title is " +loginpage.driver.getTitle());
        }

    }
    @Test(priority = 1)
    public static DashboardPage TestReturnDashboardPage(){
        return dashboardPage;
    }

}
