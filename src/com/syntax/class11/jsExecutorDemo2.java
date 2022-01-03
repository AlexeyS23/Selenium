package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorDemo2 {
    public static String url = "http://amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        //scroll down and up
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //down
        js.executeScript("window.scrollBy(0,4000)");
        //wait
        Thread.sleep(2000);
        //up
        js.executeScript("window.scrollBy(0,-4000)");


        WebElement backToTop = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));

        js.executeScript("arguments[0].scrollIntoView(true)",backToTop);
        js.executeScript("arguments[0].click()",backToTop);



    }
}