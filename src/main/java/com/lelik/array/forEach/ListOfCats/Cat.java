package com.lelik.array.forEach.ListOfCats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tail;

    public Cat(String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
    }

    public Cat() {
    }

    public String getName() {
        return this.name;
    }

    public Cat setCat() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name?");
        this.name = reader.readLine();
        if (this.name.equals("")) {
            return null;
        } else {
            System.out.println("age?");
            this.age = Integer.parseInt(reader.readLine());
            System.out.println("weight?");
            this.weight = Integer.parseInt(reader.readLine());
            System.out.println("tail?");
            this.tail = Integer.parseInt(reader.readLine());
            return new Cat(this.name, this.age, this.weight, this.tail);
        }
    }

    public String toString() {
        return "My name is " + this.name + ", I am " + this.age + " year old, my weight " + this.weight + ", tail is " + this.tail;
    }
}
