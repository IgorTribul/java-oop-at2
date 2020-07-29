package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at2.basic.BaseWebTest;
import ru.geekbrains.java.oop.at2.page.ContentPage;

import java.util.stream.Stream;

public class NavigationWebTest extends BaseWebTest {
    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @AfterEach
    void tearDown() {
        ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);

        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }

    @Feature("Первые шаги в автоматизации")

    @ParameterizedTest
    @MethodSource("dataProvider")
    @Step("проверка названия страницы")
    public void courses(String namePage) {
        ContentPage contentPage = new ContentPage(driver);
        contentPage.getNavigation().getButton(namePage).click();
        contentPage.checkNamePage(namePage);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум"),
                Arguments.of("Вебинары"),
                Arguments.of("Тесты"),
                Arguments.of("Карьера")
        );
    }
}


