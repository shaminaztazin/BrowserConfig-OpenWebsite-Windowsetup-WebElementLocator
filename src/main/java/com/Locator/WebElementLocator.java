package com.Locator;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementLocator extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
    }


    public static void  OpenLoginPage(){
        WebElement MyAccount=driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login=driver.findElement(By.linkText("Login"));
        MyAccount.click();



    }
    public static void TC_LoginTest(){
        WebElement Email=driver.findElement(By.name("email"));
        Email.sendKeys("mail@gmail.com");
        WebElement Password=driver.findElement(By.name("password"));
        Password.sendKeys("5643345");
        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();



    }
}
