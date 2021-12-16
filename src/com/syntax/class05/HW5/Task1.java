package com.syntax.class05.HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.TreeMap;

//HW1: Amazon link count:
//Open chrome browser
//Go to “https://www.amazon.com/”
//Get all links
//Get number of links that has text
//Print to console only the links that has text
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link : links) {
            String linkWithText = link.getText();
            if (!linkWithText.isEmpty()) {
                System.out.println(linkWithText);

            }
            //sorry, at that task I need more practice))

        }
    }
}

