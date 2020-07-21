package ru.geekbrains.example.junit.assertions.arrays.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEqualsTest {
    @Test
    void arrayEquals() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Assertions.assertArrayEquals(a, b, "массивы не равны друг другу" );
    }
}

