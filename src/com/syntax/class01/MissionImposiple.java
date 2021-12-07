package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImposiple {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://www.amazon.com");
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is "+url);
        String title=driver.getTitle();
        System.out.println("The current title of the page is + "+title);
        driver.close();


    }
}