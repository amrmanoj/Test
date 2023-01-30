package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) throws InterruptedException {

        {
            //open browser
            WebDriverManager.chromedriver().setup();
            RemoteWebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            //Launch site and close banner
            driver.get("http://www.flipkart.com");
            Thread.sleep(5000);
            driver.close();
            System.out.println("Welcome Java");
            System.out.println("Good job");
        }
    }
}