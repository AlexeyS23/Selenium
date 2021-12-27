package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
//get the address/handle
        String singUpPage = driver.getWindowHandle();
        System.out.println("the window handel is: "+singUpPage);
//locate the btn help, terms,privacy
        WebElement helpBTN = driver.findElement(By.xpath("//a[text()='Справка']"));
        WebElement termBTN = driver.findElement(By.xpath("//a[text()='Условия']"));
        WebElement privacyBTN = driver.findElement(By.xpath("//a[text()='Конфиденциальность']"));
//click on them to open
        helpBTN.click();
        termBTN.click();
        privacyBTN.click();
        //to print all we need to create a SET
        Set<String> allwindowsHandels = driver.getWindowHandles();
        System.out.println("number of windows "+allwindowsHandels.size());
        // to print we need to iterate over the Set
        Iterator<String>it=allwindowsHandels.iterator();
        //iterate through each window handle
        while(it.hasNext()){
           // switch to terms page
            String handle = it.next();
            //to switch to this particular handle/window
            driver.switchTo().window(handle);
            //i need to make sure this is my desired window
            String title=driver.getTitle();
            //if condition
            if (title.equalsIgnoreCase("Google terms of ")){
                System.out.println(title);
                break;
            }
        }


       // singUpPage=it.next();   - вариант №1 с сетом
       // String helpPageHandle = it.next();- вариант №1 с сетом
        //String privacyPageHandle = it.next();   - вариант №1 с сетом
        //String termPageHandle = it.next();   - вариант №1 с сетом

       // System.out.println("The handles for signup page is: " + singUpPage);   - вариант №1 с сетом
       // System.out.println("The handles for help page is: " + helpPageHandle);   - вариант №1 с сетом
       // System.out.println("The handles for privacy page is: " + privacyPageHandle);   - вариант №1 с сетом
       // System.out.println("The handles for term page is: " + termPageHandle);   - вариант №1 с сетом

        //switch to help page   - вариант №1 с сетом
      //  driver.switchTo().window(helpPageHandle);   - вариант №1 с сетом
      //  System.out.println(driver.getTitle());   - вариант №1 с сетом

        driver.quit();


    }
}
