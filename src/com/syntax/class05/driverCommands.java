package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The size of list is: "+ links.size());
        for (WebElement link:links){
            String linkText=link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText);
                String linkAddress = link.getAttribute("href");
                System.out.println(linkAddress);
                System.out.println("*************************************");
            }
                   }

    }
}
