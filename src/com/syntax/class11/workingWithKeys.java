package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class workingWithKeys {
    public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test",Keys.ENTER);

        //screenshot

        TakesScreenshot ts=(TakesScreenshot) driver;
        //to take the screenshort , this step is
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        //save the screenshot in my comp
        try {
            //copy a screenshot at a new directory inside a project and a give patch to screenshot
            FileUtils.copyFile(sourceFile,new File("screenshort/login/admin.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }


}}
