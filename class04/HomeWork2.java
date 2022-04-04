package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork2 {
    /*
    Amazon link count:
    Open chrome browser
    Go to "https://www.amazon.com/"
    Get all links
    Get number of links that has text
    Print to console only the links that has text
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement link:allLinks){
            String linkText = link.getText();
            String fullLink=link.getAttribute("href");
            if (!linkText.isEmpty()){
                System.out.println("Number of Amazon Links "+ allLinks.size());
                System.out.println(linkText+"     "+fullLink);
            }
        }
    }
}
