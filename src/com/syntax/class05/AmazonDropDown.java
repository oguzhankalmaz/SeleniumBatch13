package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDown {
    //navigate to amazon.com and check the dropdown on the search bar
    public static String url = "https://www.amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement dropDown = driver.findElement(By.xpath("//select[@aria-describedby = 'searchDropdownDescription']"));
        Select select = new Select(dropDown);//creating an object of select class
//Print out all elements of the Drop Down list:
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);
//1st Way:
//        for(int i=0; i<size; i++){
//            String option = allOptions.get(i).getText();
//            System.out.println(option);
//        }
//2nd Way (Advanced For Loop):
        for(WebElement option:allOptions){
            String optionText = option.getText();
            System.out.println(optionText);
        }
//select one element from drop down by its value:
        select.selectByValue("search-alias=arts-crafts-intl-ship");
    }
}