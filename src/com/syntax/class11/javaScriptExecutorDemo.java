package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class javaScriptExecutorDemo {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

// create an instanse of executor

        JavascriptExecutor jv=(JavascriptExecutor) driver;
        jv.executeScript("arguments[0].style.border='2px solid red'",username);
        jv.executeScript("arguments[0].style.background='yellow'",password);

        // login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //click
        jv.executeScript("arguments[0].click()", loginButton);


}}
