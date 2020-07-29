package ru.geekbrains.java.oop.at2;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at2.basic.BaseWebTest;
import ru.geekbrains.java.oop.at2.block.SearchElements;
import ru.geekbrains.java.oop.at2.page.ContentPage;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseWebTest {


    @BeforeEach
    public void beforeAll() {
        ContentPage contentPage = new ContentPage(driver);
        driver.get("https://geekbrains.ru/events");
        contentPage.getIconSearch().click();
        contentPage.getInputInSearchField().sendKeys("java");
    }
//        driver.findElement(
//                By.cssSelector("[class=\"svg-icon icon-popup-close-button \"]")).click();
//        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
//        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
//                .sendKeys("java");

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage) {
        SearchElements searchElements = new  SearchElements(driver);
        Assertions.assertEquals(searchElements.getSearchName(namePage).getText(), namePage);
//        wait15second.until(ExpectedConditions.textToBePresentInElement(searchElements.getSearchName(namePage), namePage));

        searchElements.checkCounts(namePage);
//        ContentPage contentPage = new ContentPage(driver);
//        contentPage.getNavigation().getButton(namePage).click();
//         contentPage.checkNamePage(namePage);

    }
    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум"),
                Arguments.of("Вебинары"),
                Arguments.of("Тесты"),
                Arguments.of("Профессии"),
                Arguments.of("Блоги")
        );
    }


}
