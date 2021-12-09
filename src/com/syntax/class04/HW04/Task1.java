package com.syntax.class04.HW04;
//task1:(use xpath)
//RMS Application Negative Login:
//Open chrome browser
//Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text “Password cannot be empty” is displayed.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        Thread.sleep(2000);
        login.sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(2000);
        WebElement resalt= driver.findElement(By.xpath("//span[@id='spanMessage']"));
        System.out.println(resalt.getText());
        driver.quit();
    }
}
