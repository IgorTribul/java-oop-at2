package ru.geekbrains.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueTest {
    @Test
    void name1() {
        assertTrue(false,"Тест упал");
    }

    @Test
    void name2() {
        assertTrue(true,"Тест прошел");
    }
}
