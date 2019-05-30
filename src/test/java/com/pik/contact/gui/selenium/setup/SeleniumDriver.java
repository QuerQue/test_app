package com.pik.contact.gui.selenium.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    static private WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tomek\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        if (driver == null) {
            driver = new FirefoxDriver();    //can be replaced with HtmlUnitDriver for better performance
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;
    }

}
