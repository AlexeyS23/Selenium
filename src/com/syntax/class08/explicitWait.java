package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class explicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");
        //driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //used explicit wait to make sure the element has met a certain condition
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // put the condition of wait
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#enableAfter")));
        //locate the button
        WebElement btn = driver.findElement(By.cssSelector("button#enableAfter"));
        //click;
        //btn.click();
        System.out.println(btn.isEnabled());



    }
}
