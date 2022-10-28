package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly*/

    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement JScriptAlertBox = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        JScriptAlertBox.click();
        Thread.sleep(2000);
        Alert JScriptAlert = driver.switchTo().alert();
        JScriptAlert.accept();
        Thread.sleep(2000);

        WebElement JScriptConfirmBox = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
        JScriptConfirmBox.click();
        Thread.sleep(2000);
        Alert JScriptConfirm = driver.switchTo().alert();
        JScriptConfirm.dismiss();
        Thread.sleep(2000);

        WebElement JScriptAlertBox2 = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
        JScriptAlertBox2.click();
        Thread.sleep(2000);
        Alert JScriptAlert2 = driver.switchTo().alert();
        JScriptAlert2.sendKeys("Teoman");
        JScriptAlert2.accept();





    }
}
