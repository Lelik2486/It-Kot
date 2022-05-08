package com.lelik.construktorDemo.manAndWoman;

public class Woman {
    private String name;
    private int age;
    private Man husband;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman(String name, int age, Man husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }

    public Man getHusband() {
        return this.husband;
    }
    public String toString() {
        return this.name;
    }
}
