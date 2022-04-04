package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.syntaxprojects.com/basic-checkbox-demo.php";
        driver.get(url);
        // locating checkboxes and storing them in the list
        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[class = 'cb1-element']"));
        int size = optionCheckBoxes.size();//we are checking how many check boxes we have
        System.out.println(size);//printing number of check boxes

        // looping through each element from the List line 17
        for (WebElement option : optionCheckBoxes) {
            //option.click(); this would allow us to click on all 4 boxes
            String checkBoxValue = option.getAttribute("value");
            if (checkBoxValue.equals("Option-2")) {
                option.click();
                break;
            }
        }
    }
}
