package ru.geekbrains.java.oop.at2.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at2.block.Navigation;

public class ContentPage extends PageFactory {

    @FindBy(css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy(css = "[class='site-footer__content']")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    @FindBy(css = "[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private WebElement iconSearch;


    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private WebElement inputInSearchField;

    @FindBy(xpath = "//*[@id=\"filter-0\"]")
    private WebElement checkboxFree;

    @FindBy(css = "[value=\"tester\"]")
    private WebElement checkboxTester;

    @FindBy(xpath = "//*[text()='Тестирование ПО. Уровень 1']")
    private WebElement testerLevelOne;


    @FindBy(xpath = "//*[text()='Тестирование ПО. Уровень 2']")
    private WebElement testerLevelTwo;


    private Navigation navigation;

    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }


    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }

    public WebElement getIconSearch() {
        return iconSearch;
    }

    public WebElement getInputInSearchField() {
        return inputInSearchField;
    }
    public WebElement getCheckboxFree() {
        return checkboxFree;
    }

    public WebElement getCheckboxTester() {
        return checkboxTester;
    }
    public WebElement getTesterLevelOne() {
        return testerLevelOne;
    }

    public WebElement getTesterLevelTwo() {
        return testerLevelTwo;
    }


}
