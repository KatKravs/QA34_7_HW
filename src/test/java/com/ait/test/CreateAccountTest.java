package com.ait.test;


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
        app.getUser(By.name("FirstName"), "Vasiliy");

        app.getUser(By.name("LastName"), "Usen");

        app.getUser(By.name("Email"), "usen18@gmail.com");
        app.getUser(By.name("Password"),  "Pochemuto123");
        app.getUser(By.name("ConfirmPassword"), "Pochemuto123");
    }

    public static void clickOnRegestrationButton() {
        app.getUser(By.cssSelector("[href='/register']"));
    }
}
