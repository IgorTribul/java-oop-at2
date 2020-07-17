package ru.geekbrains.java.oop.at2.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BasicSearch {
    public ChromeDriver chromeDriver;

    @BeforeEach
    public void beforeAll() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().pageLoadTimeout (30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        chromeDriver.get("https://geekbrains.ru/courses");
        chromeDriver.findElement(
                By.cssSelector("div button[class=\"c9e3 _311d\"] [class=\"svg-icon icon-popup-close-button \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
                .sendKeys("java");
    }
    @AfterEach
    public void afterAll(){
        chromeDriver.quit();
    }
}
