package com.syntax.class02.HW1;
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Alex123");
        driver.findElement(By.id("customer.lastName")).sendKeys("Lex123");
        driver.findElement(By.id("customer.address.street")).sendKeys("BestStreet");
        driver.findElement(By.id("customer.address.city")).sendKeys("Kyiv");
        driver.findElement(By.id("customer.address.state")).sendKeys("Kyiv obl");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("03031");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-45-43");
        driver.findElement(By.id("customer.ssn")).sendKeys("customer.ssn");
        driver.findElement(By.id("customer.username")).sendKeys("Alex1234");
        driver.findElement(By.id("customer.password")).sendKeys("Alex123Alex");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Alex123Alex");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.quit();





    }
}
