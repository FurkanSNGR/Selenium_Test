package com.selenium.selenium;

public class Testinium {
    public static void main(String[] arg) throws InterruptedException {

        OpenAndClose test = new OpenAndClose();
        test.open();

        LoginTest testtwo = new LoginTest();
        testtwo.login();

        Search testthree = new Search();
        testthree.searchh();

        Shopping testfour = new Shopping();
        testfour.shop();

    }
}
