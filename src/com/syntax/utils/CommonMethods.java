package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {
// sends text to a given Element
    // @param element -> webElement
    //@pqrqm text -> the text you want to send

    public static void sendText (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
// method for screenshot

    public static void takeTheSe(String filename){
        TakesScreenshot ts=(TakesScreenshot) driver;
        //the screenshot is taken and the type is File
        File ss = ts.getScreenshotAs(OutputType.FILE);
        //save the screenshot
        try {
            FileUtils.copyFile(ss,new File("screenshort/login/"+filename+".png") );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    //public void switchToFrame (int index){
        //driver.switchTo().frame(index);


    }
   // }
