package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandleDDWithIterator {
    public static String url = "https://www.amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement dropDown = driver.findElement(By.xpath("//select[@aria-describedby = 'searchDropdownDescription']"));
        Select select = new Select(dropDown);//creating an object of select class

        List<WebElement> allOptions = select.getOptions();
        Iterator<WebElement> it = allOptions.iterator();
        while(it.hasNext()){
            WebElement ddOption = it.next();
            String optionText = ddOption.getText();
            System.out.println(optionText);
        }

        }

}
