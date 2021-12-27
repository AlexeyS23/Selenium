package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles_WithTheDescriptions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);
        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));
        //click on newtab and window tab
        newTab.click();
        newWindow.click();
// print the handle of the main page (Мы сейчас на главной странице, можно сразу действовать)
        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);
        //to switch to newtab and get the text
        //1. get all handles

        Set<String> allHandles = driver.getWindowHandles();
        //2.find the desried i.e. of new tab by iterating through the set
        Iterator<String>iterator=allHandles.iterator();
//3. iterating over each handle to see if it is ...
        while (iterator.hasNext()){
            String handler=iterator.next();
            driver.switchTo().window(handler);
            //now get the title and check if it is the desired tab or not
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;
            }

        }
        //succesful switch
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        //driver.switchTo().defaultContent();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();

        driver.quit();



    }
}
