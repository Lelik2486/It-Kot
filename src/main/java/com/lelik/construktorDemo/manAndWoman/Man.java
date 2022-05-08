package com.lelik.construktorDemo.manAndWoman;

public class Man {
    private String name;
    private int age;
    private Woman wife;

    public Man(String name, int age, Woman wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public Woman getWife() {
        return this.wife;
    }
    public String toString(){
        return this.name;
    }
}