package ru.geekbrains.java.oop.at2;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.java.oop.at2.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at2.block.ContentNavigationCourseBlock;
import ru.geekbrains.java.oop.at2.block.LeftNavigation;
import ru.geekbrains.java.oop.at2.page.content.CoursePage;
import ru.geekbrains.java.oop.at2.page.content.PostPage;

@Story("Проверка отображения блоков")
@DisplayName("Страница Блог")
@Execution(ExecutionMode.CONCURRENT)

public class PostWebTest extends BeforeAndAfterStep{

   @DisplayName("Проверка отображения меню страницы Блог")
   @Test
   void checkSingInValidLogin() {
       PostPage postPage = ((PostPage)
               new PostPage(driver)
                       .openUrl()
                       .closedPopUp()
            );
       postPage.checkingDisplayedPosts(
//                                "Все истории",
                               "Маркетинг",
                               "Дизайн",
                               "Управление",
                               "Истории студентов",
                               "GeekUniversity"
//                              , "Дневник студента"
                       );


        }
    }

