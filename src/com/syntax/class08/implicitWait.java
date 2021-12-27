package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        // declaring a implicit wait forfinding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement getNewUser = driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();
        WebElement fmane = driver.findElement(By.xpath("//*[@id='First-Name']/p"));
        System.out.println(fmane.getText());


    }
}
