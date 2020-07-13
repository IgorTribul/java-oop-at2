package ru.geekbrains.java.oop.at2.participants;

public class Cat implements Runners {
    private String name;
    private int maxLength;
    private int maxWeight;
    private boolean success = true;

    public Cat (String name, int maxLength, int maxWeight){
        this.name = name;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
    }

    public Cat() {

    }

    public void run(){
        System.out.println(name + " бежит максимум " + maxLength + " метров ");
    }
    public void jump(){
        System.out.println(name + " прыгает максимум " + maxWeight + " метров ");
    }
    public String getName(){
        return name;
    }
    public int getMaxLength(){
        return maxLength;
    }
    public int getMaxWight(){
        return maxWeight;
    }
    public boolean getSuccess(){
        return success;
    }
    public void setSuccess(boolean success){
        this.success = success;
    }
}
