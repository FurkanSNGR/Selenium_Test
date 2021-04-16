package com.selenium.selenium;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping {
    @Test
    public void shop() throws InterruptedException {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs_fu\\Documents\\Selenium\\ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");

        WebElement openpc = driver.findElement(By.id("item-info-block-645220768"));
        openpc.click();

        Thread.sleep(1000);

        WebElement price = driver.findElement(By.id("sp-price-discountPrice"));
        System.out.println("Product Price = ");
        System.out.println(price.getText());

        driver.findElement(By.xpath("//*[@class='gg-icon gg-icon-close icon-close btn-alert-close']")).click();

        WebElement basket = driver.findElement(By.id("add-to-basket"));
        basket.click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@class='icon-sepet-line-wrapper']")).click();

        System.out.println("Basket Price = ");
        WebElement basketprice = driver.findElement(By.className("new-price"));
        System.out.println(basketprice.getText());

        Thread.sleep(2000);

        Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div/div[6]/div[2]/div[2]/div[1]/div[4]/div/div[2]/select")));
        dropdown.selectByVisibleText("2");

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div/div[6]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div/a/i")).click();

        Thread.sleep(3000);

        System.out.println("Shopping and Basket Test Successful");
        driver.close();

    }
}
