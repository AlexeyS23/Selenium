package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
       // femaleRadioBtn.click();
        //chec if radio btn display
        boolean isDisplayed = femaleRadioBtn.isDisplayed();
        System.out.println("The female radio btn is displayed "+isDisplayed);
        boolean isEnabled = femaleRadioBtn.isEnabled();
        System.out.println("The female radio btn is Enabled "+isEnabled);
        boolean isSelected = femaleRadioBtn.isSelected();
        System.out.println("The female radio btn is Selected "+isSelected);
        if (isEnabled){
            femaleRadioBtn.click();
        }
        isSelected=femaleRadioBtn.isSelected();
        System.out.println("The female radio btn is Selected "+isSelected);

    }
}
