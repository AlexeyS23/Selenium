package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class loginPageTest {
    public static void main(String[] args) {
        //open the browser ann navigate to: http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/validateCredentials

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //locate the element adn send keys

        LoginPage loginPage=new LoginPage();

        //WebElement username = loginPage.userNameField;
        //CommonMethods.sendText


        //loginPage.userNameField.sendKeys("Admin");
        //loginPage.passwordField.sendKeys("Hum@nhrm123");
        //loginPage.loginBTN.click();



    }
}
