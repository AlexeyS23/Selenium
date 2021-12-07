package com.syntax.class01;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is "+url);

        String title=driver.getTitle();
        System.out.println("The current title of the page is + "+title);

        driver.quit();


    }
}
