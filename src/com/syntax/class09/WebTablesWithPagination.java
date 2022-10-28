package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {

    public static String url ="http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Get the 8th row data that belongs to name "Archy J" from table:

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));

        boolean studentNotFound =true;//we simply set a condition for while loop to keep iterating
        while(studentNotFound){
            for(WebElement row:tableRows){
                String rowText = row.getText();
                if(rowText.contains("Archy J")){
                    studentNotFound = false;//change studentNotFound value false to stop iterating in while loop because we found our row
                    System.out.println(rowText);
                }
            }
            if(studentNotFound){//we set if condition for studentNotFound=true because we want to click next button only studentNotFound=true
                nextButton.click();
            }
        }



    }
}
