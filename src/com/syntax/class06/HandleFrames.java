package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //now, we have to switch our focus to frame:
        //note that, iframes has own <html> body tags. therefore, we need to
        //change our focus to iframe html body from webpage's html body.
        //switching focus to iframe by index:
        driver.switchTo().frame(0);//we switch our focus to frames by using
                                        //frame by index. since in DOM the frame
                                        //that we are looking for is the first frame
                                        //we specify our index as 0.
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch13");


        //In above, we change our focus to iframe. now, in order to work another
        //elements on the webpage other than iframe, we need to change our focus
        // to webpage (default content) from iframe.
        driver.switchTo().defaultContent();//changing focus to default content (main content)
        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //switching to iframe by name:
        driver.switchTo().frame("iframe_a");
        //in above, we send keys our textbox. to enter new keys to textbox,
        //we need to clear textbox:
        textbox.clear();
        textbox.sendKeys("we are back to the frame");

        driver.switchTo().defaultContent();//switching focus back to default content
        //switching focus to iframe by frame element method:
        //first, we define a web element on iframe, then using this element (frame element),
        //we can switch our focus to iframe:
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your Horses!!!");


    }
}
