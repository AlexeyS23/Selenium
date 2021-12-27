package com.syntax.class07.HW07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//goto https://demoqa.com/nestedframes
//print the text childframe on console (edited)
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(2000);
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        // or we can remove line 17 & write  driver.switchTo().frame("frame1"); on line 18
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(frame2);
        WebElement childText = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(childText.getText());

        driver.quit();





    }
}
