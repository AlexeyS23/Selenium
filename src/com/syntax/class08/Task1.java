package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
                driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement start = driver.findElement(By.cssSelector("button#startButton"));
        start.click();

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
Thread.sleep(6000);
        System.out.println(text.getText());
        driver.quit();
    }

}
