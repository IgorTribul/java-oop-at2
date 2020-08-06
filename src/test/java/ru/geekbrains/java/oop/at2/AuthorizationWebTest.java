package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.java.oop.at2.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at2.page.sing.AuthorizationPage;
import ru.geekbrains.java.oop.at2.page.content.base.ContentBasePage;

@Execution(ExecutionMode.CONCURRENT)
@Feature("Авторизация")
@Story("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthorizationWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка авторизации с корректными данными")
    @Test
    void events() {
        String login = "hao17583@bcaoo.com";
        String password = "hao17583";
        new AuthorizationPage(driver)
                .openUrl()
                .authorization(login, password)
                .checkNamePage("Главная");
    }

}
