package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
verify enroll today button is enabled*/

    public  static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame("FrameOne");
        WebElement searchField = driver.findElement(By.id("search"));
        searchField.sendKeys("Asksn");
        WebElement headerText = driver.findElement(By.xpath("//h1[@class = 'heading-13']"));
        String headerTxt = headerText.getText();
        System.out.println(headerTxt);

        WebElement enrollDropDown = driver.findElement(By.xpath("//div[@class = 'menu-button w-nav-button']"));
        enrollDropDown.click();

        WebElement enrollButton = driver.findElement(By.xpath("(//a[@href = '/enroll/apply'])[1]"));
        boolean enrollEnabled = enrollButton.isEnabled();
        System.out.println(enrollEnabled);





    }
}
