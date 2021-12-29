package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

       //get all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        //print all rows

        for (int i = 1; i <rows.size() ; i++) {
//get the text
            String rowtext = rows.get(i).getText();
            System.out.println(rowtext);
            //chek the chekbox if the row has the
            if (rowtext.contains("ScreenSaver")){
                List<WebElement> chekBoxes = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                chekBoxes.get(i-1).click();

            }
        }


    }
}
