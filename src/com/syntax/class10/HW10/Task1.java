package com.syntax.class10.HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
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

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();

        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();


        boolean notFound=true;
        while (notFound){

            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

            for (int i = 0; i <tableRows.size() ; i++) {

                String text = tableRows.get(i).getText();

                if (text.contains("26335A")){
                    System.out.println("I found it");

                    notFound=false;
                    driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input")).click();
                    break;
                }


            }

            if (notFound) {
                WebElement nxtButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));


                nxtButton.click();


            }
        }driver.quit();
    }
}





