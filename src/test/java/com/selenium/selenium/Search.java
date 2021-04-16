package com.selenium.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    @Test
    public void searchh(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs_fu\\Documents\\Selenium\\ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");

        WebElement txtbx_search = driver.findElement(By.name("k"));
        txtbx_search.sendKeys("bilgisayar");
        txtbx_search.sendKeys(Keys.ENTER);

        // Alt satırda bulunan kod öncesinde aktif olan popup kapatmak için kullanılıyordu
        // Şu an popup siteden kaldırılmış durumda

        // driver.findElement(By.xpath("//*[@class='wis-clsbtn-86912']")).click();
        driver.findElement(By.xpath("//*[@class='gg-icon gg-icon-close icon-close']")).click();

        WebElement pagetwo = driver.findElement(By.linkText("2"));
        pagetwo.click();
        System.out.println("search test successful");
        driver.close();

    }

}
