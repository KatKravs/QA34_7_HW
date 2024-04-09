package com.ait.test;

import com.ait.fw.BaseHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BasePage {

    @Test
    public void loginPositiveTest(){
//        Random random = new Random();
//        int i = random.nextInt(1000)+1000;

        clickOnRegestrationButton();

        fillLoginRegisterForm();
        clickRegisterButton();
        //ul:nth-child(1) .account
        Assert.assertTrue(isElementPresents(By.cssSelector("[href='/logout']")));

    }

    private static void clickRegisterButton() {
        app.getUser(By.cssSelector("[name='register-button']"));
    }

    public static void fillLoginRegisterForm() {
        type(By.name("FirstName"), "Vas");

        type(By.name("LastName"), "Usen");

        type(By.name("Email"), "usen18@gmail.com");
        type(By.name("Password"),  "Pochemuto123");
        type(By.name("ConfirmPassword"), "Pochemuto123");
    }

    public static void clickOnRegestrationButton() {
        click(By.cssSelector("[href='/register']"));
    }
}
