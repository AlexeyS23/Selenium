package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
        //1. we must switch to the desired frame (like Alert)
        driver.switchTo().frame("frame1");
        //getting the webelemetn
        WebElement text1 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("Text from frame: "+text1.getText());
        //Если фрейм 2 не находится внутри фрейма 1, мы должны вернуться в главное ВебОкно
        driver.switchTo().defaultContent();
        //теперь можно заходить на фрейм №2
       driver.switchTo().frame("frame2");
        WebElement text2 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("Text from frame: "+text2.getText());
        //switch bask to defalt
        driver.switchTo().defaultContent();




    }
}
