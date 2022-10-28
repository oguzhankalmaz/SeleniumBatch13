package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        //Finding an element by ID and sending some text into that element:
        driver.findElement(By.id("email")).sendKeys("syntax@syntax.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        //Finding an element by name and clicking:
        driver.findElement(By.name("login")).click();
        //At this point, our code might be run faster than application that we are
        //testing. Before moving on to click another link on our testing application
        //(facebook), putting a waiting time in our code should be good choice:
        Thread.sleep(5000);
        //Finding an element by link text and clicking:
        //driver.findElement(By.linkText("Forgotten password?")).click();
        //Or, instead of above By.linkText, we can use By.partialLinkText:
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
