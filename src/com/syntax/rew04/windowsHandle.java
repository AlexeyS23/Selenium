package com.syntax.rew04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowsHandle {
    public static String url = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //click on the Условия
        WebElement terms = driver.findElement(By.xpath("//a[text()='Условия']"));
        terms.click();
        //print or get the handle of default page
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("The main page window handle is: "+mainPageHandle);
        //to enter username in условия:
        // to get id of условия.com
        //we must get all windows handles
        Set<String> allHandles = driver.getWindowHandles();
        //find the one associated with page terms
        Iterator<String> it=allHandles.iterator();
        while (it.hasNext()){
            //get windows from set
            String handle = it.next();
            //check it if it is the reqired one?
            //a. switch to that window handle
            driver.switchTo().window(handle);
            //now check if it is the desried window
            if (driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms?gl=UA&hl=ru")){
                System.out.println(driver.getTitle());
                break;
            }
        }
//driver.findElement()
        driver.switchTo().defaultContent();





}}
