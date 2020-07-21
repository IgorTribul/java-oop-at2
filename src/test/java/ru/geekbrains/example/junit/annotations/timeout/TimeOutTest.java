package ru.geekbrains.example.junit.annotations.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;

public class TimeOutTest {
    @Timeout(value = 3)
    @Test
    void name()throws InterruptedException{
        sleep(3000);
    }
}
