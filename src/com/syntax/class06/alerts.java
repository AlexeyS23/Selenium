package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);
        Alert simple = driver.switchTo().alert();
        simple.accept();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#confirm")).click();
        Thread.sleep(2000);
        Alert conformation = driver.switchTo().alert();
        System.out.println(conformation.getText());
        conformation.dismiss();
        driver.findElement(By.cssSelector("button#prompt")).click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        Thread.sleep(2000);
        prompt.sendKeys("Hello we want sleep!");
        prompt.accept();

    }
}
