package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at2.basic.BaseWebTest;
import ru.geekbrains.java.oop.at2.block.Navigation;
import ru.geekbrains.java.oop.at2.page.AuthorizationPage;
import ru.geekbrains.java.oop.at2.page.ContentPage;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru/");
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
        contentPage.getCheckboxFree().click();
        Assertions.assertEquals("Тестирование ПО. Уровень 1", contentPage.getTesterLevelOne().getText());
        Assertions.assertEquals("Тестирование ПО. Уровень 2", contentPage.getTesterLevelTwo().getText());

    }
}
