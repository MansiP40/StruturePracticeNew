//A package in Java is used to group related classes.
package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Facebook extends Utils
{
    private By _facebookLogo = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");

    String regMsg = "http://www.facebook.com/nopCommerce";

    public void verifyToFacebookButtonOnHomePage() {


        // Store the current window handle
        String MainWindowHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window
        clickOnElement(_facebookLogo);
// Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
// Perform the actions on new window
        System.out.println(driver.getCurrentUrl());
// Close the new window, if that window no more required
        driver.close();
// Switch back to original browser (first window)
        driver.switchTo().window(MainWindowHandleBefore);
        Assert.assertEquals(regMsg,"http://www.facebook.com/nopCommerce","You are in facebook page.");

        // System.out.println(driver.getCurrentUrl());
// Continue with original browser (first window)
    }
}