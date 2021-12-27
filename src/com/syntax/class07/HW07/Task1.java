package com.syntax.class07.HW07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

//goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
//click on follow on instagram
//click on facebook.com
//get all windows handles
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        Thread.sleep(2000);
        WebElement insta = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        Thread.sleep(2000);
        insta.click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement face = driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']"));
        Thread.sleep(2000);
        face.click();
        driver.switchTo().defaultContent();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();
        String syntacProject = iterator.next();
        String instagram = iterator.next();
        String facebook = iterator.next();

        System.out.println("The handles of main page: "+syntacProject);
        System.out.println("The handles of instagram page: "+syntacProject);
        System.out.println("The handles of facebook page: "+syntacProject);

        driver.quit();







    }
}

