package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesWithPagenation_With_discriptions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://syntaxprojects.com/table-pagination-demo.php");
        //print the row that contains the student name "Archy J"
        //1. locate the table
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        //1.2 locate the next button on the table
        WebElement nextBtn = driver.findElement(By.xpath("//a[@class='next_link']"));

        //2. Iterate over list and see if the desired row is there or not

//int i=1;   for found number of page
        boolean notFound = true; //flag (27,28,34 line); found=false
        while (notFound) {      //!found
            for (WebElement tablerow : tableRows) {
                String textOfRows = tablerow.getText();
                if (textOfRows.contains("Archy J")) {
                    System.out.println(textOfRows);
                  //  System.out.println("Number of page is: "+i);    for found number of page
                    notFound=false;        //found=true;
                    break;
                }
            }
            if (notFound){
                nextBtn.click();
               // i++;   for found number of page
            }
        }}}



