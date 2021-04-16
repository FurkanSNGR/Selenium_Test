package com.selenium.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndClose {
    @Test
    public void open(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs_fu\\Documents\\Selenium\\ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get("https://www.gittigidiyor.com");

        System.out.println("Open and Close Test Successful");
        //close url
        driver.close();

    }
}
