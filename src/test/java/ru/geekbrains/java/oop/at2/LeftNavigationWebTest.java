package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Description;
import lombok.Getter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java.oop.at2.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at2.block.LeftNavigation.Button;
import ru.geekbrains.java.oop.at2.page.content.PostPage;
import ru.geekbrains.java.oop.at2.page.content.TestPage;


import java.util.stream.Stream;

public class LeftNavigationWebTest extends BeforeAndAfterStep {
    public static Stream<Button> stringProviderNotPopUp() {
        return Stream.of(
                Button.TOPICS,
                Button.EVENTS,
                Button.TESTS,
                Button.CAREER
        );
    }

    @Description("Тесты которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(Button button) {
        new TestPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(button)
                .getHeaderBlock().checkNamePage(button.getText());
    }


    @Test
    @DisplayName("Нажатие на элемент навигации")
    public void checkNavigationPopUp() {
        new TestPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(Button.POSTS)
                .closedPopUp()
                .getHeaderBlock().checkNamePage(Button.POSTS.getText());
    }
}
