package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at2.basic.BasicNavigation;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class NavigationTest extends BasicNavigation {

    @ParameterizedTest
    @MethodSource ("listNameMulti")

    public void checkTopMenu(String topMenu, String name) throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] "+name)).click();
        Assertions.assertEquals(
                topMenu,
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText());
    }
    public static Stream<Arguments> listNameMulti(){
        return Stream.of(
                Arguments.of("Форум", "[href=\"/topics\"]"),
                Arguments.of("Вебинары", "[href=\"/events\"]"),
                Arguments.of("Блог", "[href=\"/posts\"]"),
                Arguments.of("Тесты", "[href=\"/tests\"]"));
    }
}


