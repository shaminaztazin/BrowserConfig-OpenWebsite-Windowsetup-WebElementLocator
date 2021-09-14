package com.BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsweConfig {

    public static WebDriver driver;

    public static void main(String[] args) {

//          firefox_launch();
//          firefox_close();
           chrome_launch();
//           chrome_close();
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();

    }
    public static void firefox_close(){
        driver.close();
    }

    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();

    }
    public static void chrome_close(){
        driver.close();
    }
}
