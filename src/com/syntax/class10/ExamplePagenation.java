package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamplePagenation {
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

        // find element 263335A

        //1. locate the table
       // List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")); -ПЕРЕДВИНУЛИ 39
        //2.locate next button
       // WebElement nxtButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]")); ПЕРЕДВИНУЛ НА 59
        //3. iterate through the list and look for the 263335A

        //5.declearing a boolean that will be a flag to control refiling all lists until we founnd
        boolean notFound=true;
        while (notFound){
            //9. relocate rows
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        for (int i = 0; i <tableRows.size() ; i++) {
            //get the text out ofthe Webelement in list
            String text = tableRows.get(i).getText();
            //check if the row contains id we are looking for
            if (text.contains("26335A")){
                System.out.println("I found it");
                //6. we found the desried row so we need to end while loop
                notFound=false;
                //7. we found so we dont want to iterate the rest
                        break;
            }


        }
        //8. end clicking
            if (notFound) {
                //12. Перезаписали
                WebElement nxtButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));


        //4. click on next button once the loop check whole list
        nxtButton.click();

            }
}driver.quit();
        //Д.З. КЛИКНУТЬ НА ЯЧЕЙКЕ
    }
}
