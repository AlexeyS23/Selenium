package com.syntax.class05.HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//HW4
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the title of page
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> categories = driver.findElements(By.xpath("//select[@aria-label='Select a category for search']"));
        for (WebElement category:categories
             ) {String categoryText=category.getText();
            if (!categoryText.isEmpty()){
                System.out.println(categoryText);
            }
        }
        driver.findElement(By.xpath("//option[@value='58058']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println("The title of this page is: + "+title);
        driver.quit();


    }
}
