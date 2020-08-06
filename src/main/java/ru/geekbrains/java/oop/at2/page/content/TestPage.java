package ru.geekbrains.java.oop.at2.page.content;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at2.block.LeftNavigation;
import ru.geekbrains.java.oop.at2.page.content.base.ContentBasePage;

import java.util.ArrayList;
import java.util.List;

public class TestPage extends ContentBasePage {

    @FindBy(css = "[class=\"test-card__name\"]" )
    public List<WebElement> testBlocks;

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка отображения названий блоков с тестами: {args}")
    public TestPage checkingTestBlocks(String... args) {
                for (String text : args) {
            WebElement element = findElement(testBlocks, text);
            wait10second.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }


    @Override
    public TestPage openUrl() {
        super.openUrl("https://geekbrains.ru/tests");
        return this;
    }

}
