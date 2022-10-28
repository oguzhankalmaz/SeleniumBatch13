package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        /*Get the content of the table on the webpage
        Don't get the content of header of table. get only the body of the table*/

        //Creating a list of web elements of table rows by xpath //table[@id='task-table'] -->table xpath
        //                                       //table[@id='task-table']/tbody -->xpath of the whole table except table heading
        //                                       //table[@id='task-table']/tbody/tr -->xpath of the table rows (except table heading)
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());//print number of rows

        //Creating an iterator and get text from each row:
        Iterator<WebElement> it = rowData.iterator();
        while (it.hasNext()){
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        /*Now, get heading column data
        Use advanced for loop*/
        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        for(WebElement colData:colsData){
            String colText = colData.getText();
            System.out.println(colText);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        //Get whole 2nd column data, only:
        List<WebElement> secondColRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for(WebElement secondColRow:secondColRows){
            String secondColText = secondColRow.getText();
            System.out.println(secondColText);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        //Get the cell data at 1st row and 4th column:
        WebElement cellData = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[1]/td[4]"));
        String cellDataText = cellData.getText();
        System.out.println(cellDataText);
    }
}