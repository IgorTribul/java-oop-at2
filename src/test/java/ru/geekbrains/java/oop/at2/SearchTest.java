package ru.geekbrains.java.oop.at2;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at2.basic.BasicNavigation;
import ru.geekbrains.java.oop.at2.basic.BasicSearch;

import static org.hamcrest.Matchers.*;

public class SearchTest extends BasicSearch {

    @Test
    public void professionsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Профессии']");
        MatcherAssert.assertThat(Integer.parseInt(chromeDriver.findElementByXPath
                ("//div[1]/div/ul/li[2]/a/span").getText()),
                greaterThanOrEqualTo(2));
    }

    @Test
    public void eventsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        MatcherAssert.assertThat(Integer.parseInt(chromeDriver.findElementByXPath
                ("//div[6]/div/div[1]/div/ul/li[4]/a/span").getText()),
                allOf(greaterThan(180), lessThan(300)));
    }

    @Test
    public void postsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        MatcherAssert.assertThat(Integer.parseInt(chromeDriver.findElementByXPath
                ("//div[6]/div/div[1]/div/ul/li[5]/a/span").getText()),
                greaterThan(300));
    }

    @Test
    public void topicsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
        MatcherAssert.assertThat(Integer.parseInt(chromeDriver.findElementByXPath
                ("//div[6]/div/div[1]/div/ul/li[6]/a/span").getText()),
                not(equalTo(300)));
    }
//
    @Test
    public void testsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Тесты']");
        MatcherAssert.assertThat(Integer.parseInt(chromeDriver.findElementByXPath
                ("//div[6]/div/div[1]/div/ul/li[7]/a/span").getText()),
                not(equalTo(0)));
    }
}
