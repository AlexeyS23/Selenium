package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static String url="https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //locate the choose button
        WebElement choosefile = driver.findElement(By.cssSelector("input#file-upload"));
        //in order to upload file

        choosefile.sendKeys("C:\\Users\\Anastasia\\IdeaProjects\\SeliniumBatch10\\screenshort\\login\\admin.png");

        //locate the sumbit and click upload

        driver.findElement(By.cssSelector("input#file-submit")).click();


}}
