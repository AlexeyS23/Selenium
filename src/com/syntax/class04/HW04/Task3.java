package com.syntax.class04.HW04;
//task3:(use css)
//goto:http://syntaxprojects.com/input-form-demo.php
//fill in all the textboxes in the form (edited)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("Taras");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Shevchenko");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name$='mail']")).sendKeys("kobza@mail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name^='phone']")).sendKeys("000");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name^='ad']")).sendKeys("Main_Street");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name$='ty']")).sendKeys("vill.-Morintsi");
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector("select[name^='st']")).click();  //Kyiv province
        driver.findElement(By.cssSelector("input[name$='ip']")).sendKeys("End task!");
        Thread.sleep(4000);
        driver.quit();





    }
}
