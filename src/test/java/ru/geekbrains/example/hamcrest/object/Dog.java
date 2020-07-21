package ru.geekbrains.example.hamcrest.object;

public class Dog extends Animal{
    public final String name;

    public Dog(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "мое имя " + name;
    }

    public String getName() {
        return name;
    }
}
