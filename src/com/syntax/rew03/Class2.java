package com.syntax.rew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2 {
    public static String url="https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        WebElement chexBox = driver.findElement(By.xpath("//input[@value='Option-1']"));
        if (chexBox.isSelected()){
            System.out.println("It is already selected");
        }else{
            chexBox.click();
        }
        driver.quit();
}}
