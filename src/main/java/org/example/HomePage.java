//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By

import org.openqa.selenium.By;
import org.testng.Assert;

//extends keyword Is used to Inherit child class(HomePage) from parent class(Utils).
public class HomePage extends Utils{
    //This method is use for the register button icon
    private By _voteButton = By.id("vote-poll-1");
    private By _currency = By.id("customerCurrency");
    String regmss = "Only registered users can vote.";

    public void verifyRegisterButtonPresent(){

        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegistrationButtonPresent");
    }

    public void navigateToElectronicPage() {
        clickOnElement(By.linkText("Electornics"));
    }
    public void verifyToCurrencyButtonOnHomepage()
    {
        //this will choose the option from given 2 option
        selectFromDropdownByVisibleText(_currency,"Euro");
        selectFromDropdownByVisibleText(_currency,"US Dollar");


    }
    public void verifyToVoteButtonOnHomepage(){
        clickOnElement(_voteButton);
        driver.switchTo().alert().accept();
        Assert.assertEquals(regmss,"User Need To register","You Need to Select Option");
}}

