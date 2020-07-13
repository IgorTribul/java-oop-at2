package ru.geekbrains.java.oop.at2.participants;

public interface Runners {
    String getName();
    int getMaxLength();
    int getMaxWight();
    boolean getSuccess();

    void run();
    void jump();
    void setSuccess(boolean success);
}
