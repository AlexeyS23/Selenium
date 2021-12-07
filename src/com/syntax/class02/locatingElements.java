package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("OlgaDava@gmail.com");
        //driver.findElement(By.name("email")).sendKeys("Bla Bla");
       driver.findElement(By.name("pass")).sendKeys("Alabama");
         //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Забыли пароль?")).click();
        //driver.findElement(By.cssSelector("input[type='submit']")).click();

        //driver.findElement(By.id("email")).sendKeys("isorbon@gmail.com");
        //driver.findElement(By.id("pass")).sendKeys("pass");
        //driver.findElement(By.name("login")).click();
    }
}
