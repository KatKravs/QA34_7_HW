package com.ait.test;

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

    @Test
    public void findElementByCssSelector() {
        //tag name = tag name

        driver.findElement(By.cssSelector("strong"));
        driver.findElement(By.cssSelector("ul"));
        driver.findElement(By.cssSelector("h2"));



        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));



        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".header-selectors-wrapper"));

        driver.findElement(By.cssSelector("[for='pollanswers-1']"));
        driver.findElement(By.cssSelector("[href='/register']"));

        driver.findElement(By.cssSelector("[href*='addresses']"));

        driver.findElement(By.cssSelector("[href^='/camera']"));

        driver.findElement(By.cssSelector("[href$='photo']"));

    }

    @Test
    public void findElementByXpath() {
        // tag name = //tag
        // driver.findElement(By.tagName("h1"));

        driver.findElement(By.xpath("//strong"));
        driver.findElement(By.xpath("//ul"));
        driver.findElement(By.xpath("//h2"));
//

        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));

//
        driver.findElement(By.xpath("//*[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='header-selectors-wrapper']"));
//
        driver.findElement(By.xpath("//*[contains(@href, 'addresses')]"));
//        //start->//*[starts-with(@attr, '....')

        driver.findElement(By.xpath("//*[starts-with(@href, '/camera')]"));
        driver.findElement(By.xpath("//*[substring(@href, string-length(@href) - string-length('photo') +1) = 'photo']"));



//
//
//        //text
//        driver.findElement(By.xpath("//*[starts-with(@href, '/let')]"));
//        driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));
//        driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));
//        driver.findElement(By.xpath("//span[contains(.,'mistake')]"));
//
//        //search of parent element - //input[@id='username']/..
//        // //div/a - child - css=div>a
//        // //div//a -any lebel child - css = div a
//
//        //tag1[.tag2[@attr='value']]
//        //*[@id='firstName' or @name='lastName']
//        //*[@id='firstName' and @name='lastName']

    }



    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
