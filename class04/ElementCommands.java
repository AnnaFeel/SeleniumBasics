package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedStatusButton = driver.findElement(By.xpath("(//input[@name = 'optradio'])[1]"));
        boolean isMarried = marriedStatusButton.isEnabled();
        System.out.println(isMarried);

        if (!isMarried) {
            System.out.println("Not enabled");
        } else{
            System.out.println("Enabled");
        }

        boolean isMarriedDisplayed = marriedStatusButton.isDisplayed();
        //here we are checking if our element is displayed
        System.out.println(isMarriedDisplayed);

        boolean isMarriedSelected = marriedStatusButton.isSelected();
        System.out.println("Before clicking "+isMarriedSelected);
        marriedStatusButton.click();
        isMarriedSelected = marriedStatusButton.isSelected();
        System.out.println("After clicking "+isMarriedSelected);

        driver.quit();
    }
}
