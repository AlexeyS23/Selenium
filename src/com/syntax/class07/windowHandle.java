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
        //
        Set<String> allwindowsHandels = driver.getWindowHandles();
        System.out.println("number of windows "+allwindowsHandels.size());
        // to print we need to iterate over the Set
        Iterator<String>it=allwindowsHandels.iterator();
        singUpPage=it.next();
        String helpPageHandle = it.next();
        String privacyPageHandle = it.next();
        String termPageHandle = it.next();

        System.out.println("The handles for signup page is: " + singUpPage);
        System.out.println("The handles for help page is: " + helpPageHandle);
        System.out.println("The handles for privacy page is: " + privacyPageHandle);
        System.out.println("The handles for term page is: " + termPageHandle);

        //switch to help page
        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
