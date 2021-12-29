package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reviewExplicit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.findElement(By.cssSelector("button#enable-button")).click();

        //print the state of the button after it is enebled

        WebDriverWait wait = new WebDriverWait(driver,20);
        //condition
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));

        WebElement btn = driver.findElement(By.cssSelector("button#disable"));

        boolean status=btn.isEnabled();
        System.out.println(status);

    }
}
