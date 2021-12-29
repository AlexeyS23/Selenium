package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticwebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        //print all rows in the console

        //1. find the rows in the table

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //print number of rows
        System.out.println("The number of rows are "+tableRows.size());
        //2. iterate to each element and get the text

        for (WebElement row: tableRows){
            String text=row.getText();
            System.out.println(text);
        }
//3. print all the headers

        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='task-table']/thead"));

        System.out.println(cells.size());

        //for (WebElement c1: cells){
//String T1=c1.getText();
            //System.out.println(T1);



//4. print juct second colom

        List<WebElement> col2 = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for (WebElement col: col2){
            System.out.println(col.getText());
        }
    }

}
