package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HWFindUniqueElementTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void findUniqueElementByTegName() {
        List<WebElement> element = driver.findElements(By.tagName("p"));
        System.out.println(element.size());

        List<WebElement> element1 = driver.findElements(By.tagName("h3"));
        System.out.println(element1.size());

        List<WebElement> element2 = driver.findElements(By.tagName("strong"));
        System.out.println(element2.size());

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
