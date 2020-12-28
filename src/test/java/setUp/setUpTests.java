package setUp;

import org.testng.annotations.Test;

public class setUpTests extends setUps {

    @Test(priority = 0)
    public void testURL(){
        String pageURL= "https//www.konga.com";

        if(driver.getCurrentUrl().contains(pageURL)){
            System.out.println("The page URL is " +pageURL);
        } else {
            System.out.println("The page URL is incorrect. Actual page URL is " +driver.getCurrentUrl());
        }
    }
}
