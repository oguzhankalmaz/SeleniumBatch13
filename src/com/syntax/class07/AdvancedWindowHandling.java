package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //Get our main page handle:
        String mainPageHandle = driver.getWindowHandle();
        //Assign buttons as web elements:
        WebElement followInstagram = driver.findElement(By.xpath("//a[@title = 'Follow @syntaxtech on Instagram']"));
        WebElement likeFacebook = driver.findElement(By.xpath("//a[@title = 'Follow @syntaxtech on Facebook']"));
        WebElement followInstaAndFace = driver.findElement(By.xpath("//a[@title = 'Follow @syntaxtech']"));
        //Now, click all buttons:
        followInstagram.click();
        likeFacebook.click();
        followInstaAndFace.click();
        //Get all the window handles and store them in set:
        Set<String> allWindowHandles = driver.getWindowHandles();
        //Start an iterator for all the window handles:
        Iterator<String> iterator = allWindowHandles.iterator();
        //Assign all window handles using iterator and get and print out page titles
        //Maximize each window
        //Keep main window open and close all the child windows
        while(iterator.hasNext()){
            String handle = iterator.next();//start iterating through window handles
            driver.switchTo().window(handle);//switch to focus to current handled windows
            driver.manage().window().maximize();//maximize the window
            String title = driver.getTitle();//get current focused window title
            System.out.println(title);
            if(!mainPageHandle.equals(handle)){//set a condition where main page is not equal "handle"
                driver.close();//close the tab
            }
        }
        //Now, click on follow instagram button again:
        driver.switchTo().window(mainPageHandle);//switch focus to main page
        followInstagram.click();


    }
}
