package com.syntax.class05.HW5;
//HW 2
//HRMS Application Negative Login:
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

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        Thread.sleep(2000);
        WebElement resalt = driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println("Resalt is: "+resalt.getText());
        driver.quit();
    }
}
