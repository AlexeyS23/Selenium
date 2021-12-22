package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        //admin - userName
        //admin - password
        Thread.sleep(2000);

    }
}
