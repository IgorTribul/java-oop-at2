package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at2.basic.BaseWebTest;
import ru.geekbrains.java.oop.at2.block.Navigation;
import ru.geekbrains.java.oop.at2.page.AuthorizationPage;
import ru.geekbrains.java.oop.at2.page.ContentPage;

@Feature("Первые шаги в автоматизации")

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    @Step("Авторизация с логином: {login} пароль {password}")
    public void auth() {
        driver.get("https://geekbrains.ru/login");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";
        Navigation navigation = new Navigation(driver);
        ContentPage contentPage = new ContentPage(driver);


        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");

        navigation.getButton("Курсы").click();
        navigation.getButtonAllCourses().click();
        contentPage.getCheckboxFree().click();
        contentPage.getCheckboxTester().click();
        Assertions.assertEquals("Тестирование ПО. Уровень 1", contentPage.getTesterLevelOne().getText());
        Assertions.assertEquals("Тестирование ПО. Уровень 2", contentPage.getTesterLevelTwo().getText());

    }
}
