package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*HW
Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        Thread.sleep(2000);

        WebElement startPractising = driver.findElement(By.xpath("//a[contains(@id,'btn_basic_example')]"));
        startPractising.click();
        Thread.sleep(2000);

        WebElement simpleFormDemo = driver.findElement(By.xpath("(//a[@href='basic-first-form-demo.php'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(2000);

        WebElement enterMessage = driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("Homework");
        Thread.sleep(2000);

        WebElement showMessage = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showMessage.click();
        Thread.sleep(2000);

        driver.quit();


    }
}
