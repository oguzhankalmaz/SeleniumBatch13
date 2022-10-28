package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UHRS {

    public static String url = "https://prod.uhrs.playmsn.com/judge/Views/judge?hitappid=60575&mode=judge&g=0&fromNew=1";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement signIn = driver.findElement(By.xpath("//span[@class='ms-Button-label home__login-btn__label label-48']"));
        signIn.click();
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("cw_2082279@hotmail.com");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("HVqidt:\"TZ9DT?)");
        WebElement submitPass = driver.findElement(By.xpath("//input[@type='submit']"));
        submitPass.click();
        WebElement staySıgnIn = driver.findElement(By.xpath("//input[@type='submit']"));
        staySıgnIn.click();
        Thread.sleep(2000);

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

        driver.switchTo().frame(1);
        WebElement radio3 = driver.findElement(By.xpath("/html/body/div[3]/uhrs-hit/uhrs-choicegroup/uhrs-choiceitem[3]/div/input]"));
        radio3.click();
        WebElement submitRadio = driver.findElement(By.xpath("(//button[@class='uhrs-button uhrs-button-primary uhrs-submit-button'])[1]"));
        submitRadio.click();
        Thread.sleep(45000);



    }
}
