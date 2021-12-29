package com.syntax.class09.HW9;
//HW!
//goto https://chercher.tech/practice/explicit-wait
//1.click on open an alert after 5 sec and then using explicit wait manage that alert
//2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed() (edited)
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/explicit-wait");
        WebElement alertButton = driver.findElement(By.cssSelector("button#alert"));
        alertButton.click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert simple = driver.switchTo().alert();
        System.out.println("Text from Alert is: "+simple.getText());
        simple.accept();

        WebElement displayButton = driver.findElement(By.cssSelector("button#display-other-button"));
        displayButton.click();
        WebDriverWait waitDis=new WebDriverWait(driver,10);
        waitDis.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
        WebElement status = driver.findElement(By.xpath("//button[@id='hidden']"));

        System.out.println("Display button is displayed after 10 sec.: "+status.isDisplayed());
        driver.quit();


    }
}
