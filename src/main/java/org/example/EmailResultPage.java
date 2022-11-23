//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium

import org.openqa.selenium.By;
import org.testng.Assert;
//create method and extract the util class
public class EmailResultPage extends Utils
{
      //by string and this reg msg it will display this in the page
    String regMess1 = "Your message has been sent.";

    public void verifyEmailMessageIsSentSuccessfully()
    {
        //it will wait until the url is open and then this will get the homepage
        WaitForUrlTobe("https://demo.nopcommerce.com/productemailafriend/4",10);
        //by this it will show the page and display the result
        String regMsg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(regMsg1,regMess1,"Your message has been sent.");
    }
}