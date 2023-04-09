package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into the browser
        driver.get(baseUrl);

        // print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current url
        System.out.println("Current URL  : "   +  driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source  :  "  +  driver.getPageSource());

        //Enter the username field element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter the Password field element
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        // Close the driver
        driver.close();







    }



}
