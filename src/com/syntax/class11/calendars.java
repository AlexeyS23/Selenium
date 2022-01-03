package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendars {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(url);

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        //clisk to leave button
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

//*************************************************************************************************

        //open calendar
        driver.findElement(By.cssSelector("input#calFromDate")).click();
//select month

        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
//use select class
        Select select=new Select(month);
       select.selectByVisibleText("Sep");

       //select year
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select select1=new Select(year);
        //select1.selectByVisibleText("1967");
       select1.selectByValue("2020");
//список датт
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        //iterate throw the data
        for (WebElement date:dates
             ) {
            String dataText = date.getText();
if (dataText.equalsIgnoreCase("15")){
    date.click();
}
        }


}}
