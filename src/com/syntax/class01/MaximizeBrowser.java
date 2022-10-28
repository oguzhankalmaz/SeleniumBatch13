package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //To maximize browser window, first we manage, then manage window, then maximize:
        driver.manage().window().maximize();
        //Another method:
        //driver.manage().window().fullscreen();
        //The difference between maximize and fullscreen is that in fullscreen, we don't see
        //close,minimize erc. buttons. We exit fullscreen with ESC button.
    }
}
