package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDropDown = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDropDown);

        select.selectByIndex(3);//selecting by index

        select.selectByVisibleText("Thursday");//selecting by visible text

        select.selectByValue("Sunday");//selecting by value

        List<WebElement> allOptions = select.getOptions();//get all
                            // available values from a dropdown menu.
                            //it returns a list of web elements.
        int size = allOptions.size();
        System.out.println(size);

        //print out all options on console (except for disabled option):
        for(int i=1; i<size; i++){
            String option = allOptions.get(i).getText();//first, get i th element and then
                                                        //get its text.
            System.out.println(option);
        }
    }
}