package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    /*Go to facebook sign up page
Fill out the whole form
Click signup*/
    public static String url ="https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

/*        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("oguzhankalmaz@gmail.com");

        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("123456");*/

        WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
        createAccount.click();

        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstName.sendKeys("Teoman");

        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Kalmaz");

        WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        email.sendKeys("teomankalmaz@gmail.com");

        WebElement emailConfirm = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
        emailConfirm.sendKeys("teomankalmaz@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
        pass.sendKeys("123456");

        WebElement daysDropDown = driver.findElement(By.id("day"));
        Select selectDay = new Select(daysDropDown);
        selectDay.selectByIndex(10);

        WebElement monthsDropDown = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthsDropDown);
        selectMonth.selectByIndex(8);

        WebElement yearsDropDown = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearsDropDown);
        selectYear.selectByIndex(38);

        WebElement genderMale = driver.findElement(By.xpath("//input[@value= '2']"));
        genderMale.click();

        Thread.sleep(1000);

        WebElement signUp = driver.findElement(By.xpath("//button[@name= 'websubmit']"));
        signUp.click();

        Thread.sleep(1000);

        driver.quit();



    }
}
