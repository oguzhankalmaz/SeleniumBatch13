package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*HW
Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages*/
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement newTab = driver.findElement(By.xpath("//button[@id = 'tabButton']"));
        newTab.click();
        WebElement newWindow = driver.findElement(By.xpath("//button[@id = 'windowButton']"));
        newWindow.click();
        WebElement newWindowMessage = driver.findElement(By.xpath("//button[@id = 'messageWindowButton']"));
        newWindowMessage.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> it = allWindowHandles.iterator();

        String mainPageHandle = it.next();
        String newWindowMessageHandle = it.next();
        String newTabHandle = it.next();
        String newWindowHandle = it.next();

        System.out.println(mainPageHandle);
        System.out.println(newTabHandle);
        System.out.println(newWindowHandle);
        System.out.println(newWindowMessageHandle);



        driver.switchTo().window(newTabHandle);
        String text = "This is a sample page";
        WebElement newTabTxt = driver.findElement(By.id("sampleHeading"));
        String newTabText = newTabTxt.getText();
        System.out.println(newTabText);
        if(text.equals(newTabText)){
            System.out.println("Text is correct.");
        }else {
            System.out.println("Text is wrong.");
        }

        driver.switchTo().window(newWindowHandle);
        text = "This is a sample page";
        WebElement newWindowTxt = driver.findElement(By.id("sampleHeading"));
        String newWindowText = newWindowTxt.getText();
        System.out.println(newWindowText);
        if(text.equals(newWindowText)){
            System.out.println("Text is correct.");
        }else {
            System.out.println("Text is wrong.");
        }

        //Below does not work because "newWindowMessage" button on the page is not compatible with Chrome browsers.
        //If the code run on Firefox driver, it will work.

        /*driver.switchTo().window(newWindowMessageHandle);
        text = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
        WebElement newWindowMessageTxt = driver.findElement(By.tagName("body"));
        String newWindowMessageText = newWindowMessageTxt.getText();
        System.out.println(newWindowMessageText);
        if(text.equals(newWindowMessageText)){
            System.out.println("Text is correct.");
        }else {
            System.out.println("Text is wrong.");
        }*/













    }
}
