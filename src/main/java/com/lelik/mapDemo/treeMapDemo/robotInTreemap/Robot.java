package com.lelik.mapDemo.treeMapDemo.robotInTreemap;

public class Robot implements Comparable<Robot> {
    String model;
    int power;

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return this.power;
    }

    public Robot(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public int compareTo(Robot o) {
        if (this.power == o.power) {
            return 0;
        } else {
            return this.power < o.power ? -1 : 1;
        }
    }

    public String toString() {
        return this.model + " " + this.power;
    }
}
