package ru.geekbrains.java.oop.at2.obstacles;

import ru.geekbrains.java.oop.at2.participants.Runners;

public class Wall implements Obstacles{
    private int weight;

    public Wall(int weight){
        this.weight = weight;
    }
    public void check(Runners runners){
        runners.jump();
        runners.setSuccess(runners.getMaxWight()>=weight);
        if (runners.getSuccess()){
            System.out.println(runners.getName() + " успешно перепрыгнул стену высотой " + weight + " метров ");
        } else {
            System.out.println(runners.getName() + " не смог перепрыгнуть стену высотой " + weight + " метров ");
        }
    }
}
