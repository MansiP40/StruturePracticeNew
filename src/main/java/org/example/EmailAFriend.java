//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium WbDriver
import org.openqa.selenium.By;

//this is for method creation and extract the class from utils
public class EmailAFriend extends Utils
{
    private By _appleMacbookPro = By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmilAFriend = By.xpath("//div[@class=\"email-a-friend\"]");
    private By _friendsEmail = By.id("FriendEmail");
    private By _personalMessage = By.id("PersonalMessage");
    private By _sendEmail = By.className("buttons");

    public void enterEmailDetails ()
    {
        //click on element will select that product
        clickOnElement(_appleMacbookPro);
        //chosen the product
        clickOnElement(_EmilAFriend);
        //it will allow to enter email a friend option
        typeText(_friendsEmail, "dhyey" + getTimeStamp() + "@yahoo.com");
        // it will get msg whatever wants to convey
      typeText(_personalMessage, "It's Very useful purchase for me so suggesting you to have look on it ");
        clickOnElement(_sendEmail);
        //it will send to that friend via email id even
    } }