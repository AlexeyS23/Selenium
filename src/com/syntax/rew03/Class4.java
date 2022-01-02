package com.syntax.rew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class4 {
    public static String url="https://demoqa.com/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        String actualtext=text.getText();
        System.out.println(actualtext);


}}
