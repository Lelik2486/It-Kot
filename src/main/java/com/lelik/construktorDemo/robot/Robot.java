package com.lelik.construktorDemo.robot;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String fight(Robot robot) {
        if (this.power > robot.power) {
            return "Win";
        } else if (this.power < robot.power) {
            return "Defeat";
        } else {
            return "Ничья";
        }
    }
}
