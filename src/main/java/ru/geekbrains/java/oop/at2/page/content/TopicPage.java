package ru.geekbrains.java.oop.at2.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at2.page.content.base.ContentBasePage;

public class TopicPage extends ContentBasePage {
    public TopicPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TopicPage openUrl() {
        super.openUrl("https://geekbrains.ru/topics");
        return this;
    }
}
