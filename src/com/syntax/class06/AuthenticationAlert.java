package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    /*
    To handle two field blank alerts, we can modify the url. If we go to the below url,
    username and password fields are prompt:
    https://the-internet.herokuapp.com/basic_auth
    By modifying the url after the "https://", we can fill out this two blank fields
    automatically. This is done by like this (username:password@) :
    https://admin:admin@the-internet.herokuapp.com/basic_auth
    We can't be allowed to use senKeys command for this kind of authentication alerts
     */
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
