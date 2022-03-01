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

public class uTest_TestingItem2 {

    private static WebDriver chromeDriver;
    WebDriverWait wait = new WebDriverWait(chromeDriver, 30);

    public uTest_TestingItem2() {
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

        WebElement btnProjects = chromeDriver.findElement(By.linkText("Projects"));
        btnProjects.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnProjects));
        WebElement parrafoProjects = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/div[2]/p"));

        assertTrue(parrafoProjects.isEnabled());

    }

    @Test
    public void menuPrincipalTest2() {

        chromeDriver.get("https://www.utest.com/");
        WebElement mainContent = chromeDriver.findElement(By.id("mainContent"));

        wait.until(ExpectedConditions.visibilityOf(mainContent));

        WebElement btnProjects = chromeDriver.findElement(By.linkText("Projects"));
        btnProjects.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnProjects));

        wait.until(ExpectedConditions.visibilityOf(mainContent));

        WebElement btnSuggested = chromeDriver.findElement(By.className("active"));

        assertTrue(btnSuggested.isEnabled());

//        WebElement btnAll = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div[1]/project/div/div[2]/div[2]/ul/li[2]/a"));
//
//        assertTrue(btnAll.isEnabled());
    }

    @Test
    public void menuPrincipalTest3() {

        chromeDriver.get("https://www.utest.com/");


        WebElement btnProjects = chromeDriver.findElement(By.linkText("Projects"));
        btnProjects.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnProjects));

        WebElement mainContent = chromeDriver.findElement(By.id("mainContent"));
        wait.until(ExpectedConditions.visibilityOf(mainContent));

        WebElement btnCombobox = chromeDriver.findElement(By.cssSelector("div.unauthenticated-container div.main-ui-view.unauthenticated-view:nth-child(2) div.block.container div.clearfix:nth-child(1) div.filter.project-filter:nth-child(2) div.select2-theme-form.ui-select-container.ui-select-bootstrap.dropdown.ng-valid.ng-touched.ng-dirty.ng-valid-parse.ng-empty div.ui-select-match:nth-child(1) > span.btn.btn-default.form-control.ui-select-toggle"));

        assertTrue(btnCombobox.isEnabled());

//        WebElement btnAll = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div[1]/project/div/div[2]/div[2]/ul/li[2]/a"));
//
//        assertTrue(btnAll.isEnabled());
    }

}
