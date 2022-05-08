package com.lelik.construktorDemo.robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("robot1", 4, 54);
        new Robot("robot2", 3, 64);
        new Robot("robot3", 6, 62);
        Robot robot4 = new Robot("robot4", 6, 50);
        System.out.println("Robot4 "+robot4.fight(robot1));
    }
}
