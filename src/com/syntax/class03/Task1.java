package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        //driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//label[text()='Enter message']/following-sibling::input")).sendKeys("Bygaga");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Bygaga");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.quit();





    }
}
