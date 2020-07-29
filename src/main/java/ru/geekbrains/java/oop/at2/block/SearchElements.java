package ru.geekbrains.java.oop.at2.block;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchElements extends PageFactory{

    private Navigation navigation;

    public SearchElements(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }


    @FindBy (css = "[id=\"professions\"] h2")    private WebElement professions;
    @FindBy (xpath = ".//header/h2[text()='Вебинары']")    private WebElement events ;
    @FindBy (xpath = ".//header/h2[text()='Блоги']")    private WebElement blogs;
    @FindBy (xpath = "//*/h2[text()='Форум']")    private WebElement forum;
    @FindBy (xpath = ".//header/h2[text()='Тесты']")    private WebElement tests;
    @FindBy (xpath = ".//header/h2[text()='Проекты и компании']")    private WebElement projectAndCompany;

    @FindBy (xpath = "//a[@class='search-page-block__more' and @data-tab='professions']/span") private WebElement professionsCount;
    @FindBy (xpath = "//a[@class='search-page-block__more' and @data-tab=\"webinars\"]/span") private WebElement eventsCount;
    @FindBy (xpath = "//a[@class='search-page-block__more' and @data-tab='blogs']/span") private WebElement blogsCount;
    @FindBy (xpath = "//a[@class='search-page-block__more' and @data-tab='forums']/span") private WebElement forumsCount;
    @FindBy (xpath = "//a[@class='search-page-block__more' and @data-tab='tests']/span") private WebElement testsCount;

    public WebElement getSearchName(String searchName) {
        switch (searchName) {
            case "Вебинары":
                return events;
            case "Профессии":
                return professions;
            case "Блоги":
                return blogs;
            case "Форум":
                return forum;
            case "Тесты":
                return tests;
        }
        throw new RuntimeException("кнопки: " + searchName + " нет на странице!");
    }

    public WebElement getCounts(String searchName){
        switch (searchName) {
            case "Вебинары":
                return eventsCount;
            case "Профессии":
                return professionsCount;
            case "Блоги":
                return blogsCount;
            case "Форум":
                return forumsCount;
            case "Тесты":
                return testsCount;
        }
        throw new RuntimeException("кнопки: " + searchName + " нет на странице!");
    }

    public void checkCounts(String searchName){
        switch (searchName) {
            case "Вебинары":
               assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(180), lessThan(300)));
            case "Профессии":
                assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(2));
            case "Блоги":
                assertThat(Integer.parseInt(blogsCount.getText()), greaterThan(300));
            case "Форум":
                assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(350)));
            case "Тесты":
                assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
        }
        throw new RuntimeException("кнопки: " + searchName + " нет на странице!");
    }



}
