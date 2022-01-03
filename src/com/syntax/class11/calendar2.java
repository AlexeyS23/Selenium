package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendar2 {
    public static String url="https://www.sastaticket.pk/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
//locating and clicking the calendar
        WebElement calendar = driver.findElement(By.xpath("(//span[@class='dt_label'])[1]"));
        calendar.click();

        WebElement month = driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));
        //print correct month
        System.out.println("First position of month: "+month.getText());
        //get the next button
        WebElement nextBut = driver.findElement(By.xpath("//button[text()='Next Month']"));
        //go to the September
       boolean notfound=true;
        while (notfound){
            if (month.getText().equalsIgnoreCase("September 2022")){
                System.out.println(month.getText());
                notfound=false;

                //select the data
                List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));
                for (WebElement date: dates                    ) {
                    if (date.getText().equalsIgnoreCase("15")){
                        date.click();

                        break;

                    }
                }

            }else {   //select the month
                nextBut.click();

            }
        }


}}
