package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver(); //open browser
        driver.get("http://www.google.com"); //open mentioned link
        String url = driver.getCurrentUrl();
        System.out.println(url); //to print our full url
        String title = driver.getTitle();
        System.out.println(title); //to get name/title of our previously used url
        driver.quit(); //to close browser
    }
}
