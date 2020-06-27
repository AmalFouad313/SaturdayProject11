package project12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "/Users/amalfouad/Desktop/Techno Study/chromedriver");
        driver = new ChromeDriver();
    }
}

