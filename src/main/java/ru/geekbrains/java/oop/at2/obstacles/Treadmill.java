package ru.geekbrains.java.oop.at2.obstacles;

import ru.geekbrains.java.oop.at2.participants.Runners;

public class Treadmill implements Obstacles {
    private int length;

    public Treadmill(int length){
        this.length = length;
    }
    public void check(Runners runners){
        runners.run();
        runners.setSuccess(runners.getMaxLength()>=length);
        if (runners.getSuccess()){
            System.out.println(runners.getName() + " успешно пробежал беговую дорожку дниной " + length + " метров ");
        } else {
            System.out.println(runners.getName() + " не смог пробежать беговую дорожку дниной " + length + " метров ");
        }
    }
}
