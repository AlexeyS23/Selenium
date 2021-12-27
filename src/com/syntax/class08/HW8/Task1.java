package com.syntax.class08.HW8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//goto http://syntaxprojects.com/window-popup-modal-demo.php
//click on follow on instagram
//get the title and of new window and print it on the console
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement instaBut = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        instaBut.click();

        driver.switchTo().window(driver.getWindowHandle());

        String title=driver.getTitle();
        System.out.println("A title of new page is: "+"*"+title+"*");
        driver.quit();




    }

}
