package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("Alala");
        Thread.sleep(2000);
        userName.clear();
        Thread.sleep(2000);
        userName.sendKeys("Tester");
    }
}
