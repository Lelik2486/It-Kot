package com.lelik.construktorDemo.manAndWoman;

public class Fish {
    private String name;
    private int age;
    private Woman owner;

    public Fish(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}