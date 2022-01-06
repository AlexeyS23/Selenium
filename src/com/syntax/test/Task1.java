package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static com.syntax.testBase.BaseClass.driver;

////USE POM TO SOLVE THIS
////TASK 1:
////1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
////2. Enter user name and wrong password
////3.Hit the login Button
////4. take screen shot
////guide lines:
////create
////1.Base class--> Open and close browser method
////2.utils-->common methods
////it will have the methods to
////a. send keys
////b. take screen shot
////3.page --> all the needed elements of the login page
////" use with page factory to intialize all elements"
////HINT
////@Findby (id='txtusername')
////public WebElement username;
////don't forget to initialize by calling constructor:)
public class Task1 {
    public static void main(String[] args) {
        // 1. open browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //2.a   create an object of loginWithPage Factory
        //2.a   login (Enter a correct user name)
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        WebElement user = login.username;
        CommonMethods.sendText(user,"Admin");
        //2.a    login (Enter uncorrect password)
        WebElement pass = login.password;
        CommonMethods.sendText(pass, "whywhy");
        // 3.1.  Hit the login Button
        login.loginBTN.click();

        //take a screenshot
        CommonMethods.takeTheSe("LoginPage");

        //close browser
        BaseClass.tearDown();










    }
}
