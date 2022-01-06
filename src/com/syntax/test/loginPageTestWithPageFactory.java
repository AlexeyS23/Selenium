package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        //open browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //create an object of loginWithPage Factory

        LoginPageWithPageFactory loginWPG=new LoginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");



        loginWPG.password.sendKeys("HRM@nhrm123");
        loginWPG.loginBTN.click();

//        close browser
        BaseClass.tearDown();




    }

}
