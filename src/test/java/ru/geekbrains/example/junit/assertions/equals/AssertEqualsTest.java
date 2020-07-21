package ru.geekbrains.example.junit.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertEqualsTest {
    @Test
    void name1() {
        assertEquals(2, 1+1);
    }

    @Test
    void name2() {
        assertEquals("Lord", "Lord");
    }
}
