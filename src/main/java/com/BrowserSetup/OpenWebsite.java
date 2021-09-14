package com.BrowserSetup;

import Base.TestBase;

public class OpenWebsite extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        openUrl();
        chrome_close();


    }
    public static void openUrl(){
       driver.get("https://demo.opencart.com");
    }
}
