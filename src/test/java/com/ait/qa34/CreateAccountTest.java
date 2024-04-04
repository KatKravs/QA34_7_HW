package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends BasePage{

    @Test
    public void loginPositiveTest(){
        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        click(By.cssSelector("[href='/register']"));

        type(By.name("FirstName"), "Vasiliy");

        type(By.name("LastName"), "Usenko");

        type(By.name("Email"), "manuel"+i+"usenko18@gmail.com");
        type(By.name("Password"),  "Pochemu_to123");
        type(By.name("ConfirmPassword"), "Pochemu_to123");
        click(By.cssSelector("[name='register-button']"));

        Assert.assertTrue(isElementPresents(By.cssSelector("[href='/logout']")));

    }
}
