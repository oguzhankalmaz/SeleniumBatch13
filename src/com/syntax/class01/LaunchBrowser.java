package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        //setting the property to use chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //creating of an object of WebDriver
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("http://www.google.com");//go to the specified website
        String url = driver.getCurrentUrl();//get url info
        System.out.println(url);
        String title = driver.getTitle();//get title of webpage (showing on the tab)
        System.out.println(title);
        driver.quit();//close the whole browser and terminate the session
    }

}
