package ru.geekbrains.java.oop.at2;

import ru.geekbrains.java.oop.at2.obstacles.Obstacles;
import ru.geekbrains.java.oop.at2.obstacles.Treadmill;
import ru.geekbrains.java.oop.at2.obstacles.Wall;
import ru.geekbrains.java.oop.at2.participants.Cat;
import ru.geekbrains.java.oop.at2.participants.Human;
import ru.geekbrains.java.oop.at2.participants.Robot;
import ru.geekbrains.java.oop.at2.participants.Runners;

public class Start {
    public static void main(String[] args) {
        Human human1 = new Human("Ivan", 10, 3 );
        Human human2 = new Human("Peter", 20, 5 );
        Human human3 = new Human("Vova", 30, 6 );

        Cat cat1 = new Cat("Bars", 20, 5);
        Cat cat2 = new Cat("Mars", 15, 2);
        Cat cat3 = new Cat("Rom", 25, 7);

        Robot robot1 = new Robot("AA", 20, 6);
        Robot robot2 = new Robot("BB", 30, 10);
        Robot robot3 = new Robot("CC", 20, 7);

        Treadmill treadmill1 = new Treadmill(15);
        Treadmill treadmill2 = new Treadmill(25);
        Treadmill treadmill3 = new Treadmill(30);

        Wall wall1 = new Wall(5);
        Wall wall3 = new Wall(10);
        Wall wall2 = new Wall(6);


        Runners[] runners ={human1,cat1,robot1,human2,cat2,robot2,human3,cat3,robot3};
        Obstacles[] obstacles = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};

        System.out.println("Соревнование начинается!!!");
        for (int i=0; i < obstacles.length; ++i){
            System.out.println("\n\nПрепятствие номер " + (i+1));
            System.out.println("_______________________________");
            for (Runners runner : runners){
                if (runner.getSuccess()){
                    obstacles[i].check(runner);
                }
            }
        }
    }
}
