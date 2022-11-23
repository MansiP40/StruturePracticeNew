package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsDetails extends Utils{

    private By _NewsDetails = By.xpath("//div[@class=\"news-items\"]/div/div[3]//a[@href=\"/nopcommerce-new-release\"]");
    private By _Tittle = By.id("AddNewComment_CommentTitle");
    private By _Comment = By.id("AddNewComment_CommentText");
    private By _newCommentButton = By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");

    public void newsComment(){
//will click on particular product
        clickOnElement(_NewsDetails);
        //will allow to type the text
        typeText(_Tittle,"Very Use full Product");
        typeText(_Comment,"Also with warranty period");
        //this will clcik on the specific product
        clickOnElement(_newCommentButton);
        //commnet will be list out and show the xpath
        List<WebElement> commentList = driver.findElements(By.xpath("//div[@class=\"comments\"]"));
        for (WebElement element:commentList){
            System.out.println(element.getText());
        }
    }
}