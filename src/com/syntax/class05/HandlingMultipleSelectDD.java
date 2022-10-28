package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        //check drop down is multiple select or not:
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        //print out text attributes and select of all options if drop down is
        //multiple selection drop down:
        if(isMultiple){
            List<WebElement> options = select.getOptions();
            for(WebElement option:options){
                String optionText = option.getText();
                System.out.println(optionText);
                select.selectByVisibleText(optionText);
            }
        }
        //De-select an option by its index:
        select.deselectByIndex(5);
        //De-select all options:
        select.deselectAll();

    }
}