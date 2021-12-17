package com.syntax.class06.HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1:goto
//http://syntaxprojects.com/javascript-alert-box-demo.php
//handle all alerts one by one
//1.simple
//2.confirmaton
//3.prompt
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText()+" I click ok!");
        alert2.accept();
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("My homework");
        alert3.accept();
        Thread.sleep(4000);
        driver.quit();



    }

}
