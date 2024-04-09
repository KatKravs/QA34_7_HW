package com.ait.test;

import com.ait.fw.AplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BasePage {

    protected static AplicationManager app = new AplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

    @BeforeSuite
//    @BeforeMethod
    public void setUp() {
        app.init();

    }

    //    @AfterTest(enabled = false)
    @AfterSuite
    public void tearDown() {
        app.stop();
    }



}
