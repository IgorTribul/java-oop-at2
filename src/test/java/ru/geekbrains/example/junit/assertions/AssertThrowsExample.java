package ru.geekbrains.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsExample {
    @Test
    void name1() throws FileNotFoundException {
        File file = new File("src/test/java/resources/txt.txt");
        Scanner scanner = new Scanner(file);
    }
    @Test
    void name2() throws FileNotFoundException {
        File file = new File("src/test/java/resources/txt1.txt");
        Scanner scanner = new Scanner(file);
    }
    @Test
    void name3()  {
        File file = new File("src/test/resources/txt.txt");
        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }

    @Test
    void name4()  {
        File file = new File("src/test/resources/txt1.txt");
        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }
 }
