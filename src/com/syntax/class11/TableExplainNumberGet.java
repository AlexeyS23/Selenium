package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableExplainNumberGet {
    public static void main(String[] args) {
        boolean notFound=true;
        while (notFound){

            By driver;
         //   List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

           // for (int i = 0; i <tableRows.size() ; i++) {

          //      String text = tableRows.get(i).getText();

              //  if (text.contains("26335A")) {
                    System.out.println("I found it");
           // driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input")).click();
// внутри вписан ай, чтобы правильно кликнула нужная строчка
                    notFound = false;
           //
                    break;
                }


            }}


