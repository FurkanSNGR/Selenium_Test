package com.selenium.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {

    @Test
    public void login() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs_fu\\Documents\\Selenium\\ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/uye-girisi");

        //username
        WebElement txtbx_username = driver.findElement(By.name("kullanici"));
        txtbx_username.sendKeys("test_gg");

        //password
        WebElement txtbx_password = driver.findElement(By.name("sifre"));
        txtbx_password.sendKeys("login123");

        //submit
        driver.findElement(By.xpath("//input[@value='Giriş Yap' and @type='submit']")).click();

        String actualUrl="https://www.gittigidiyor.com/";
        String expectedUrl= driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

        System.out.println("Login Test Succesful");
        driver.close();

    }
}
