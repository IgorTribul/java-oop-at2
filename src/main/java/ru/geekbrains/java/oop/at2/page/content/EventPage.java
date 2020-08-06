package ru.geekbrains.java.oop.at2.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at2.page.content.base.ContentBasePage;

public class EventPage extends ContentBasePage {
    public EventPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public EventPage openUrl() {
        super.openUrl("https://geekbrains.ru/eventts");
        return this;
    }
}
