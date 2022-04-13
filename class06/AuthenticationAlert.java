package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    //to handle pop up authentication alerts you have to insert credentials in url
    public static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    //username:password@
    //admin:admin@

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }

}


