//A package in Java is used to group related classes.
package org.example;
//importing a package of Test

import org.testng.annotations.Test;

//extends keyword Is used to Inherit child class(TestSuit) from parent class(BaseTest).
public class TestSuit extends BaseTest {
    //Creating object for HomePage
    HomePage homePage = new HomePage();
    //Creating object for RegisterPage
    RegisterPage registerPage = new RegisterPage();
    //Creating object for RegisterResultPage
    RegisterResultPage registerResultPage = new RegisterResultPage();


//         ElectronicPage electronicPage = new ElectronicPage();
//         CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();
         EmailAFriend emailAFriend = new EmailAFriend();
         EmailResultPage emailResultPage = new EmailResultPage();
         Facebook facebook = new Facebook();
         NewsCommentResult newsCommentResult = new NewsCommentResult();
         NewsDetails newsDetails = new NewsDetails();

//         @Test
//         public void verifyEachProduceHasName()
//    {
//        homePage.navigateToElectronicPage();
//     //   captureScreenshot();
//
//
//             electronicPage.navigateToCameraPage();
//             cameraPhotoPage.navigateToCameraPhotoPage();
//    }
    @Test//This a test method
    public void verifyUserRegister() {
        //click on registration button
        homePage.verifyRegisterButtonPresent();
        //verify user is on register page
        registerPage.verifyUserIsOnRegistrationPage();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user has been registered successfully
      //  registerResultPage.verifyUserHasBeenRegisteredSuccessfully();

    }
      @Test
      //this is for the currency button form homepage to change
      public void currencyButtonOnHomepage(){
          homePage.verifyToCurrencyButtonOnHomepage();
      }
    @Test
    //to vote from  the homepage
    public void VoteButtonOnHomepage(){
       homePage.verifyToVoteButtonOnHomepage();
    }
    @Test
    //it is to check thr details of news comment which we did for vote and show that
    public void verifyToDetailOnNewsComment(){
        newsDetails.newsComment();
        newsCommentResult.verifyMessageIsSentSuccessfully();
    }
    @Test
    //the facebook iframe will be open from this url to another url
    public void verifyToFacebookButtonOnHomePage(){

        facebook.verifyToFacebookButtonOnHomePage();
    }
    @Test
    // and it will email to friend
    public void EmailAFriend(){
        registerPage.verifyUserIsOnRegistrationPage();
        // this is for contiune the program run and till the end and close
        registerPage.enterRegistrationDetails();
        emailAFriend.enterEmailDetails();
        emailResultPage.verifyEmailMessageIsSentSuccessfully();
    }


}