package ru.geekbrains.java.oop.at2;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.java.oop.at2.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at2.block.ContentNavigationCourseBlock;
import ru.geekbrains.java.oop.at2.block.LeftNavigation;
import ru.geekbrains.java.oop.at2.page.content.CoursePage;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Страница Курсы")
@Execution(ExecutionMode.CONCURRENT)
public class CourseWebTest extends BeforeAndAfterStep {
    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        CoursePage coursePage = ((CoursePage)
                new CoursePage(driver)
                        .openUrl()
                        .closedPopUp()
                        .getLeftNavigation()
                        .clickButton(LeftNavigation.Button.COURSES)
        );


        coursePage.getContentNavigationCourseBlock().clickTab(ContentNavigationCourseBlock.Tab.COURSES)
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}
