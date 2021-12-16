package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class chekBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);
        singleCheckBox.click();
        List<WebElement> chekBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int size=chekBoxes.size();
        System.out.println("Total number of chekBoxes is "+size);
        for (WebElement chekBox: chekBoxes
             ) {
            // chekBox.click();
            String valueOfAttribute = chekBox.getAttribute("value");
            System.out.println(valueOfAttribute);
            //if (valueOfAttribute.equalsIgnoreCase("Option-3")){
            //   chekBox.click();
            // }
            if (valueOfAttribute.contains("Option")) {
                chekBox.click();


            }
        }}}


