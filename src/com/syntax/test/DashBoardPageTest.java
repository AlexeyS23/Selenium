package com.syntax.test;

import com.syntax.pages.DashBoardPage;
import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashBoardPageTest {
    public static void main(String[] args) {
        //1. OPen brow and login
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //login
        //2.a   create an object of loginWithPage Factory
        //2.a   login (Enter a correct user name)
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        WebElement user = login.username;
        CommonMethods.sendText(user,"Admin");
        //2.a    login (Enter uncorrect password)
        WebElement pass = login.password;
        CommonMethods.sendText(pass, "Hum@nhrm123");
        // 3.1.  Hit the login Button
        login.loginBTN.click();
        // test the dashboard for the Welcome Element task
        DashBoardPage dashBoardPage=new DashBoardPage();
        WebElement message = dashBoardPage.welcomeMessage;

        System.out.println(message.getText());

        //take screenshot
        CommonMethods.takeTheSe("Dash");


    }
}
