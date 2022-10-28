package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask {
    /*
     *  navigate http://syntaxprojects.com/dynamic-elements-loading.php
     *  click on start button
     *  get the text
     *  print out in console
     */

    public static String url ="http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement clickButton = driver.findElement(By.xpath("//button[@id='startButton']"));
        clickButton.click();
//* sign in xpath is a joker card which can Identify any tagname. Let's use  below (instead of h4 tag):
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome Syntax Technologies')]")));

        WebElement text = driver.findElement(By.xpath("//h4[contains(text(), 'Welcome Syntax Technologies')]"));
        System.out.println(text.getText());
    }
}
