package ru.geekbrains.java.oop.at2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at2.basic.BasicNavigation;
import ru.geekbrains.java.oop.at2.basic.BasicSearch;

public class SearchTest extends BasicSearch {
    public int value;

    @Test
    public void professionsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Профессии']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("//*[@id=\"professions\"]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value >= 2);
        System.out.println("Профессии - " + value);
    }

    @Test
    public void coursesSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Курсы']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("/html/body/div[1]/div[8]/div/div[2]/div/div/div[2]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value > 15);
        System.out.println("Курсы - " + value);
    }

    @Test
    public void eventsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("/html/body/div[1]/div[8]/div/div[2]/div/div/div[3]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value > 180 && value < 300);
        System.out.println("Вебинары - " + value);
    }

    @Test
    public void postsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("/html/body/div[1]/div[8]/div/div[2]/div/div/div[4]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value > 300);
        System.out.println("Блоги - " + value);
    }

    @Test
    public void topicsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("/html/body/div[1]/div[8]/div/div[2]/div/div/div[5]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value != 350);
        System.out.println("Форум - " + value);
    }

    @Test
    public void testsSearch() throws InterruptedException {
        chromeDriver.findElementByXPath("//h2[text()='Тесты']");
        value = Integer.parseInt(chromeDriver.findElementByXPath
                ("/html/body/div[1]/div[8]/div/div[2]/div/div/div[6]/div[1]/header/ul/li/a/span").getText());
        Assertions.assertTrue(value != 0);
        System.out.println("Тесты - " + value);
    }

    @Test
    public void logoDisplay() throws InterruptedException {
        chromeDriver.findElementByCssSelector("[alt=\"Образовательный портал GeekBrains\"]").isDisplayed();
//        chromeDriver.findElementByCssSelector("[alt=\"Образовательный портал GeekBrains\"]").click();
    }

}
