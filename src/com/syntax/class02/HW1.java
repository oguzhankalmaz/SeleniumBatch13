package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
/*    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser*/
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

    WebElement firstName = driver.findElement(By.id("customer.firstName"));
    firstName.sendKeys("Teoman");
    WebElement lastName = driver.findElement(By.id("customer.lastName"));
    lastName.sendKeys("Kalmaz");
    WebElement address = driver.findElement(By.id("customer.address.street"));
    address.sendKeys("Melikgazi");
    WebElement city = driver.findElement(By.id("customer.address.city"));
    city.sendKeys("Merkez");
    WebElement state = driver.findElement(By.id("customer.address.state"));
    state.sendKeys("Kayseri");
    WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
    zipCode.sendKeys("123456");
    WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
    phoneNumber.sendKeys("05555655656");
    WebElement SSN = driver.findElement(By.id("customer.ssn"));
    SSN.sendKeys("999999999");
    WebElement userName = driver.findElement(By.id("customer.username"));
    userName.sendKeys("Teo");
    WebElement password = driver.findElement(By.id("customer.password"));
    password.sendKeys("teo3803");
    WebElement confirmPassword = driver.findElement(By.id("repeatedPassword"));
    confirmPassword.sendKeys("teo3803");

    driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

    driver.quit();


}
}
