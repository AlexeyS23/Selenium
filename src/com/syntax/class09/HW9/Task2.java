package com.syntax.class09.HW9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//HW!
//goto http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
//and delete all the eneteries which have product mymoney and lives in us state (edited)
public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        for (int i = 1; i <rows.size() ; i++) {
            String rowtext = rows.get(i).getText();
            if (rowtext.contains("MyMoney")&&rowtext.contains("US")){
                List<WebElement> boxs = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                boxs.get(i-1).click();
                            }
        }
        WebElement deleteButton = driver.findElement(By.cssSelector("input.btnDeleteSelected"));
        deleteButton.click();

        driver.quit();





    }


}
