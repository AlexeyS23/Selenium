package com.syntax.class04.HW04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//task2:(use advance xpath)
//RMS Application Negative Login:
//Open chrome browser
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//enter wrong password
//Click on login button
//Verify error message with text “Invalid Credenitals” is displayed.
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        Thread.sleep(2000);
        login.sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement iInvalidCredentials= driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        System.out.println(iInvalidCredentials.getText());
        driver.quit();
    }

}
