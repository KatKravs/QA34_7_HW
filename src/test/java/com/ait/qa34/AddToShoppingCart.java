package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToShoppingCart extends BasePage {

    @BeforeMethod
    public void ensurePrecondition() {
        // click on login link
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.cssSelector("#Email"),"manuel1734usenko18@gmail.com");
        // enter password
        type(By.id("Password"), "Pochemu_to123");
        // click on login button
        click(By.cssSelector(".button-1.login-button"));
    }

    @Test
    public void addItemToShoppingCartPositiveTest(){
        int sizeBefore = sizeOfItemInShoppinCart();
        // click on add to cart button
        click(By.cssSelector("div[data-productid='31'] input"));
        // pause(500); --> Костыль не делать,если все тесты проходят то и pause() не нужно!
        // click Shopping Cart link on header
        click(By.cssSelector("#topcartlink a"));
//       click(By.cssSelector("[name='updatecart']"));
        // Assert.assertTrue(isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
        int sizeAfter = sizeOfItemInShoppinCart();
        Assert.assertEquals(sizeAfter,sizeBefore + 1);
        System.out.println(sizeAfter);
    }


}
