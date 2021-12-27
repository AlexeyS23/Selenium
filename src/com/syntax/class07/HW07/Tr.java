package com.syntax.class07.HW07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.roblox.com/discover/?referrer=roblox-player#");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Teddy [XMAS]']")).click();




        //https://www.roblox.com/discover/?referrer=roblox-player#/


    }
}
