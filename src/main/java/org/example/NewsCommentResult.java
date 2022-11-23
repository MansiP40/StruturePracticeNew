package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//extract the class from util
public class NewsCommentResult extends Utils
{
    //the statement will display
    String regMsg2 ="News comment is successfully added.";

    public void verifyMessageIsSentSuccessfully()
    {
        //WaitForUrlTobe("https://demo.nopcommerce.com/nopcommerce-new-release");
        String regMsg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(regMsg1,regMsg2,"News comment is successfully added.");
    }
}