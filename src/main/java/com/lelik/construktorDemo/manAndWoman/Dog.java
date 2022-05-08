package com.lelik.construktorDemo.manAndWoman;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}
