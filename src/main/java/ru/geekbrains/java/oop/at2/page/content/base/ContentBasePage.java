package ru.geekbrains.java.oop.at2.page.content.base;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at2.block.SearchTabsBlock;
import ru.geekbrains.java.oop.at2.page.BasePageObject;
import ru.geekbrains.java.oop.at2.page.OpenUrl;
import ru.geekbrains.java.oop.at2.block.HeaderBlock;
import ru.geekbrains.java.oop.at2.block.LeftNavigation;

import java.util.ArrayList;
import java.util.List;

public abstract class ContentBasePage extends BasePageObject implements OpenUrl {

    @Getter
    protected LeftNavigation leftNavigation;
    @Getter
    protected HeaderBlock headerBlock;

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    public ContentBasePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.leftNavigation = new LeftNavigation(driver);
    }

    @Step("Закрытие Pop-UP")
    public ContentBasePage closedPopUp() {
        wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

    /**
     * Адаптер над объектом HeaderBlock
     * После работы с методом HeaderBlock#checkNamePage(String) сайт остается на тойже странице
     */
    public ContentBasePage checkNamePage(String exampleNamePage) {
        headerBlock.checkNamePage(exampleNamePage);
        return this;
    }

    @Step("Переход на страницу {url}")
    public BasePageObject openUrl(String url) {
        driver.get(url);
        return this;
    }

//    public String listBlockTests(List<WebElement> list) {
//        List<String> arrayList = new ArrayList<>();
//        for (WebElement webElement : list) {
//            String actualText = webElement.getText();
//            arrayList.add(actualText);
//        }
//        return arrayList.toString();
//    }


    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    public LeftNavigation getLeftNavigation() {
        return leftNavigation;
    }

}
