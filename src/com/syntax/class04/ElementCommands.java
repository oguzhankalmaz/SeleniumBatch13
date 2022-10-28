package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement radioButton515 = driver.findElement(By.cssSelector("input[value = '5 - 15']"));
        boolean isRadioButtonEnabled = radioButton515.isEnabled();
        System.out.println(isRadioButtonEnabled);

        boolean isRadioButtonDisplayed = radioButton515.isDisplayed();
        System.out.println(isRadioButtonDisplayed);

        boolean isRadioButtonSelected = radioButton515.isSelected();
        System.out.println("Before clicking: "+isRadioButtonSelected);

        radioButton515.click();
        isRadioButtonSelected = radioButton515.isSelected();
        System.out.println("After clicking: "+isRadioButtonSelected);

        driver.quit();




    }
}
