package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at2.basic.BasicNavigation;

public class FirstTest extends BasicNavigation {

    @Test
    public void checkNavigation() throws InterruptedException {

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

//        chromeDriver.findElement().isDisplayed()

//        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getSize()
    }
}
