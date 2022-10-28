package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url = "https://accounts.doodle.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();//get window handle for the main page
        System.out.println(mainPageHandle);//print out main window unique id

        WebElement helpLink = driver.findElement(By.xpath("//a[@title ='Help and Support']"));
        helpLink.click();//a new tab opens

        Set<String> allWindowHandles = driver.getWindowHandles();//store all the handles inside the set
        System.out.println(allWindowHandles.size());//-->size is 2

        Iterator<String> it = allWindowHandles.iterator();//have an iterator in order to iterate through the handles
        mainPageHandle = it.next();// take first step in iterator and assign the main page handle
        String childHandle = it.next(); //take the second step in iterator and assign the second tab (child)
        System.out.println(childHandle);//print out child window unique id

        //Now, we want to switch our focus to the main page window:
        driver.switchTo().window(mainPageHandle);//Now, our active page is the main page
        driver.switchTo().window(childHandle);//Now, our focus is child page
        Thread.sleep(2000);
        driver.close();//Driver closes child page because its focus on it

        //Now, we want to click helpLink again:
        driver.switchTo().window(mainPageHandle);//First, we need to switch our focus to main page
        helpLink.click();

        driver.quit();//Terminate the whole browser
    }
}
