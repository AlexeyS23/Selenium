package com.syntax.class05.HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//HW3
//Go to facebook
//click on create new account  page
//Fill out the whole form
//Click signup
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Создать новый аккаунт")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alex");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NoAlex");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("NoAlex@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("NoAlex@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Al123");
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select=new Select(day);
        select.selectByIndex(22);
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.cssSelector("select#month"));
        Select select1=new Select(month);
        select1.selectByIndex(4);
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.cssSelector("select#year"));
        Select select2=new Select(year);
        select2.selectByValue("1983");
        Thread.sleep(2000);
        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        if (male.isEnabled()){
            male.click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        driver.quit();


    }
}
