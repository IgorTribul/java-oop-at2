package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.java.oop.at2.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at2.page.content.PostPage;
import ru.geekbrains.java.oop.at2.page.content.TestPage;

import java.util.ArrayList;
import java.util.List;

@Story("Проверка отображения блоков")
@DisplayName("Страница Тест")
public class TestWebTests extends BeforeAndAfterStep {
    @FindBy(css = "[class=\"test-card__name\"]")
    private List<WebElement> testBlocks;

    @DisplayName("Проверка отображения меню страницы Тест")
    @Test

    public void aaaTests() {
        TestPage testPage = ((TestPage)
                new TestPage(driver)
                        .openUrl()
//                        .closedPopUp()
        );

//        List<String> arrayList = new ArrayList<>();
//        for (WebElement webElement : testBlocks) {
//            String actualText = webElement.getText();
//            arrayList.add(actualText);
//        }
//        System.out.println(arrayList);
//    @Test
//    void checkSingInValidLogin() {
//        TestPage testPage = ((TestPage)
//                new TestPage(driver)
//                        .openUrl()
//                        .closedPopUp()
//        );
        testPage.checkingTestBlocks(
        "Основы программирования",
                "Факультет DevOps",
                "GU: SEO-оптимизация",
                "Факультет дизайна"
//                "GeekUstBlocks);
//               niversity"
//                               "Дневник студента"
        );
//
//
//    }
    }
}
