package com.syntax.rew02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        // declaring a implicit wait forfinding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));
        first.clear();
        first.sendKeys("All");
        WebElement last = driver.findElement(By.xpath("//input[@name='lastName']"));
        last.clear();
        last.sendKeys("Lal");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123-456");
        driver.findElement(By.cssSelector("input#userName")).sendKeys("asd@123.com");
        driver.findElement(By.cssSelector("input[name=address1]")).sendKeys("address1");


    }

}
