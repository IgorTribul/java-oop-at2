package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at2.basic.BasicNavigation;

import static java.lang.Thread.sleep;

public class NavigationTest extends BasicNavigation {

    @Test
    public void courses() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }

    @Test
    public void events() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }

    @Test
    public void topics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }

    @Test
    public void posts() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }

    @Test
    public void tests() throws InterruptedException {

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }

    @Test
    public void career() throws InterruptedException {

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"svg-icon icon-logo\"]")).isDisplayed();
    }
}


