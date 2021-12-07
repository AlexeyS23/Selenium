package com.syntax.class02.HW1;
//navigate to fb.com
//click on create new account
//fill up all the textboxes
//click on sign up button
//close the pop up
//close the browser (edited)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Создать новый аккаунт")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Sheldon");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Cooper");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("doctor_cooper@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("doctor_cooper@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Spock_73 ");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("February");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_year")).sendKeys("1980");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.quit();





    }
}