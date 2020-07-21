package ru.geekbrains.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.example.junit.annotations.before.and.after.base.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJUnit5Tests extends BaseTest {
    @BeforeEach
    void setUp1() {
        System.out.println("BaseTest setUp1");
    }
    @BeforeEach
    void setUp2() {
        System.out.println("BaseTest setUp2");
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println("myFirstTest");
    }
    @Test
    void test2() {
        assertEquals(1, 1 + 1);
        System.out.println("test2");
    }
}
