package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));
        Select select = new Select(days);
        //select.selectByIndex(1);
       // Thread.sleep(2000);
        //select.selectByIndex(2);
        //Thread.sleep(2000);
       // select.selectByIndex(7);

        //by text
       // select.selectByVisibleText("Thursday");

//by value
        select.selectByValue("Wednesday");

        ////option[@value='Sunday']
    }
}
