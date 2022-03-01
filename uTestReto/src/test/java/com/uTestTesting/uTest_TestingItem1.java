package com.uTestTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uTest_TestingItem1 {

    private static WebDriver chromeDriver;
    WebDriverWait wait = new WebDriverWait(chromeDriver, 30);

    public uTest_TestingItem1() {
    }

    @BeforeClass
    public static void setUpClass() {
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");
        chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void menuPrincipalTest1() {

        chromeDriver.get("https://www.utest.com/");

        WebElement btnWhyuTest = chromeDriver.findElement(By.linkText("Why uTest"));
        WebElement btnAboutUs = chromeDriver.findElement(By.linkText("About Us"));
        WebElement btnProjects = chromeDriver.findElement(By.linkText("Projects"));
        WebElement btnLogIn = chromeDriver.findElement(By.linkText("Log In"));
        assertEquals("Why uTest", btnWhyuTest.getAttribute("innerText"));
        assertEquals("About Us", btnAboutUs.getAttribute("innerText"));
        assertEquals("Projects", btnProjects.getAttribute("innerText"));
        assertEquals("Log In", btnLogIn.getAttribute("innerText"));

    }

    @Test
    public void menuPrincipalTest2() {

        chromeDriver.get("https://www.utest.com/");

        WebElement btnWhyuTest = chromeDriver.findElement(By.linkText("Why uTest"));
        WebElement btnAboutUs = chromeDriver.findElement(By.linkText("About Us"));
        WebElement btnProjects = chromeDriver.findElement(By.linkText("Projects"));
        WebElement btnLogIn = chromeDriver.findElement(By.linkText("Log In"));

        wait.until(ExpectedConditions.elementToBeClickable(btnWhyuTest));

        btnWhyuTest.click();
        WebElement pagWhyUTest = chromeDriver.findElement(By.xpath("//*[@id=\"mainUiView\"]/ui-view/ui-view-ng-upgrade/ui-view/ut-why-utest/div"));
        wait.until(ExpectedConditions.elementToBeClickable(pagWhyUTest));
        assertTrue(pagWhyUTest.isEnabled());

        btnAboutUs.click();
        WebElement pagAboutUs = chromeDriver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div[2]/h1"));
        wait.until(ExpectedConditions.elementToBeClickable(pagAboutUs));
        assertTrue(pagAboutUs.isEnabled());

        btnProjects.click();
        WebElement pagProjects = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/div[2]/h1"));
        wait.until(ExpectedConditions.elementToBeClickable(pagProjects));
        assertTrue(pagProjects.isEnabled());

    }

    @Test
    public void menuPrincipalTest3() {

        chromeDriver.get("https://www.utest.com/");

        WebElement btnBecomeAuTester = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
        wait.until(ExpectedConditions.elementToBeClickable(btnBecomeAuTester));
        assertTrue(btnBecomeAuTester.isEnabled());
        btnBecomeAuTester.click();
        
        WebElement formUser = chromeDriver.findElement(By.name("userForm"));
        assertTrue(formUser.isEnabled());


    }

}
