package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://tureng.com/en/turkish-english");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Tureng - Turkish English Dictionary";
        if(title.equals(expectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is not correct");
        }

        driver.quit();
    }
}