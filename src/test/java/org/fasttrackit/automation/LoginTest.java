package org.fasttrackit.automation;

import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validLoginTest() {
        System.out.println("ready");
        driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/login.html");

        login("eu@fast.com", "eu.pass");

        try {
            WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
            logoutBtn.click();
        } catch (NoSuchElementException er) {
            Assert.fail("Could not login. Logout button was not present!");
        }
    }

    public void login(String user, String password) {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.className("login-btn"));

        emailField.sendKeys(user);
        passField.sendKeys(password);
        loginBtn.click();


    }
}
