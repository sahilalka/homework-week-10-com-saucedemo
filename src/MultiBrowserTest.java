import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/ ";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }
        //Open the URL into the browser
        driver.get(baseUrl);

        // print the title of the page
        String title = driver.getTitle();

        System.out.println(title);

        //Print the current url
        System.out.println("Current URL  : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source  :  " + driver.getPageSource());

        //Enter the username field element
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter the Password field element
        driver.findElement(By.name("password")).sendKeys("secret_sauce");


    }

}
