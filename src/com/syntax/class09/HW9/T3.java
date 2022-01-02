package com.syntax.class09.HW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

////HW!
////goto http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
////and delete all the eneteries which have product FamilyAlbum and lives in us state (edited)
public class T3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        WebElement userName = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
       WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
              WebElement clickBut = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        userName.sendKeys("Tester");
        pass.sendKeys("test");
        clickBut.click();



    }
}
