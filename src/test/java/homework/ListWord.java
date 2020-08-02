package homework;

import example.array.Dog;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

@DisplayName("Коллекции")
public class ListWord {
    List<String> words = Arrays.asList("мама", "папа", "сестра", "брат", "сестра", "брат", "тетя", "дядя", "дядя",
            "бабушка", "дедушка", "дедушка", "брат");

    Set<String> unique = new HashSet<String>(words);

    @DisplayName("Полная коллекция")
    @Test
    @Step ("Выводит на печать весь массив")
    public void printListAll() {
        System.out.println(words.toString());
    }

    @DisplayName("Уникальные слова")
    @Test
    @Step ("Выводит на печать за исключением повторений")
    public void printListUnique() {
        System.out.println(unique.toString());
    }

    @DisplayName("Количество вхождений")
    @Test
    @Step ("Количество повторений")
    public void frequency() {
    System.out.println("Частота встречаемости слов");
        for (String uniqueWord : unique) {
            System.out.println(uniqueWord + ": " + Collections.frequency(words, uniqueWord));
        }
    }
}
