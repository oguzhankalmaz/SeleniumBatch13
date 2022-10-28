package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver2 = new ChromeDriver();-->if you open another Chrome window
        //then you have to create another object for WebDriver
        driver.get("http://www.facebook.com");
        driver.navigate().to("http://www.google.com");//navigate to this url
        driver.navigate().back();//navigate back to previous url (facebook)
        driver.navigate().forward();//navigate forward to (google)

        //when our executions are too fast, we cannot see the real time actions of
        //code. To slow down our code execution, we can use Thread.sleep() command,
        //and we can slow down our execution in milliseconds
        Thread.sleep(2000);//this line will pause execution for 2 seconds

        driver.navigate().refresh();//refresh the page

        //driver.close(); --->it will close the current tab
        driver.quit();//it will quit the whole browser
    }
}
