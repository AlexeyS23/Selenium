package com.syntax.rew03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static String url="http://syntaxprojects.com/basic-radiobutton-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        WebElement radioButton = driver.findElement(By.xpath("(//*[@value='Male'])[2]"));
        System.out.println(radioButton.isDisplayed());

        System.out.println(radioButton.isEnabled());

        if (radioButton.isEnabled()){
            radioButton.click();
        }
        driver.quit();
}}
