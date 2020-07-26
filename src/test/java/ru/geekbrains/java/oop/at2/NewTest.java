package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at2.basic.BaseWebTest;
import ru.geekbrains.java.oop.at2.page.AuthorizationPage;
import ru.geekbrains.java.oop.at2.page.ContentPage;
import ru.geekbrains.java.oop.at2.page.SignInPage;


public class NewTest extends BaseWebTest {

    @Test
//    public void sign() {
//        driver.get("https://geekbrains.ru/login");
//        String login = "hks47018@eoopy.com";
//        String password = "hks47018";
////        SignInPage signInPage = new SignInPage(driver);
////        ContentPage contentPage = new ContentPage(driver);
//        new SignInPage(driver)
//                .signIn(login, password)
//                .checkNamePage("Главная");
//
//    }
//
//
    public void auth() {
        driver.get("https://geekbrains.ru/login");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}

//}
