package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class actionClass {
    public static String url="https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);
        //switch to iframe
        driver.switchTo().frame(0);
        //locate the draggable
        WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));
        //locate
        WebElement droppof = driver.findElement(By.cssSelector("div#droppable"));

        Actions action=new Actions(driver);
// drag the sourse and drop off
      //  action.dragAndDrop(draggable,droppof).perform(); // способ перенести квадратик
// whenever more then two methods use build
        action.clickAndHold(draggable).moveToElement(droppof).release().build().perform();


}}
