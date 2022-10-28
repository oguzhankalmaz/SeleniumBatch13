package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingDynamicTables {

    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Login the website:
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();

        //Now, identify all the rows of the table and printout:
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        Iterator<WebElement> it = rowData.iterator();
        while (it.hasNext()){
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("-------------------------------------------------------------------------------------");

        //Or, we can use for loop:
        Iterator<WebElement> it2 = rowData.iterator();
        for(int i=0; i<rowData.size(); i++){
            String rowText = it2.next().getText();
            System.out.println(rowText);
        }
        System.out.println("-------------------------------------------------------------------------------------");

        //Or, we can use just get() command instead of iterator with for loop:
        for(int i=0; i<rowData.size(); i++){
            String rowText = rowData.get(i).getText(); //Or--> String.valueOf(rowData.get(i))
            System.out.println(rowText);
        }
        System.out.println("-------------------------------------------------------------------------------------");

        //Now, just get the table data without header values (simply, start i=1):
        for(int i=1; i<rowData.size(); i++){
            String rowText = rowData.get(i).getText(); //Or--> String.valueOf(rowData.get(i))
            System.out.println(rowText);
        }
        System.out.println("-------------------------------------------------------------------------------------");

        //Now click the checkbox right next to the name "Bob Feather" on the table while getting the all data from table:
        for(int i=1; i<rowData.size(); i++){
            String rowText = rowData.get(i).getText(); //Or--> String.valueOf(rowData.get(i))
            System.out.println(rowText);
            if(rowText.contains("Bob Feather")){
                List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkBox.get(i-1).click();
            }
        }



    }
}
