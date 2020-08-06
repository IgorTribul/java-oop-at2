package ru.geekbrains.java.oop.at2.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.java.oop.at2.page.BasePageObject;
import ru.geekbrains.java.oop.at2.page.content.CoursePage;

public class ContentNavigationCourseBlock  extends BasePageObject {
    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts\"]")
    private WebElement postsAll;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/development\"]")
    private WebElement postsDevelopment;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/marketing\"]")
    private WebElement postsMarketing;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/design\"]")
    private WebElement postsDesign;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/management\"]")
    private WebElement postsManagement;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/success_story\"]")
    private WebElement postsSuccessStory;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/geekuniversity\"]")
    private WebElement postsGeekuniversity;

    @FindBy(css = "[class=\"padder m-b-xs relative posts-top-menu\"] [href=\"/posts/student_diary\"]")
    private WebElement postsStudentDiary;


    public ContentNavigationCourseBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие на tab: {tab}")
    public CoursePage clickTab(Tab tab) {
        switch (tab) {
            case PROFESSIONS: {
                tabProfessions.click();
                //TODO нужно реализовать для данного блока
            }
            case FREE_INTENSIVE: {
                tabFreeIntensive.click();
                //TODO нужно реализовать для данного блока
            }
            case COURSES: {
                tabCourses.click();

            }
            case COMPANIES: {
                tabCompanies.click();
                //TODO нужно реализовать для данного блока
            }
        }
        return new CoursePage(driver);
    }

//    Enum —  класс. Список который имеет ограниченный, неизменяемый набор значений
//    Он специально «заточен» на решение задач:
//      создание некоторого ограниченного круга значений.

    //    В нашем случае позволяет определив в одном месте, использовать этот список везде в проекте.
//    И не дать возможность пользователю допустить ошибку с названием кнопки
    public enum Tab {
        PROFESSIONS,
        FREE_INTENSIVE,
        COURSES,
        COMPANIES;
    }

}
