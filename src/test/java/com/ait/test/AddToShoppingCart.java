package com.ait.test;

import com.ait.fw.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToShoppingCart extends BaseHelper {

    public AddToShoppingCart(WebDriver driver) {
        super(driver);
    }

    @BeforeMethod
    public void ensurePrecondition() {
        login();
    }

    @Test
    public void addItemToShoppingCartPositiveTest(){
        int sizeBefore = sizeOfItemInShoppinCart();
        // click on add to cart button
        click(By.cssSelector("div[data-productid='31'] input"));

        click(By.cssSelector("#topcartlink a"));
//
        int sizeAfter = sizeOfItemInShoppinCart();
        Assert.assertEquals(sizeAfter,sizeBefore + 1);
        System.out.println(sizeAfter);
    }


}
