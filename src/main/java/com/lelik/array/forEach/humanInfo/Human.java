package com.lelik.array.forEach.humanInfo;

import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    boolean sex;
    int age;
    List<Human> kinder = new ArrayList();

    public Human(String name, String s, int age) {
        this.name = name;
        if (s == "MEN") {
            this.sex = true;
        } else if (s == "WOMEN") {
            this.sex = false;
        } else {
            System.out.println("ERROR");
        }
        this.age = age;
    }
    public Human(String name, String s, int age, List<Human> kinder) {
        this.name = name;
        if (s == "MEN") {
            this.sex = true;
        } else if (s == "WOMEN") {
            this.sex = false;
        } else {
            System.out.println("ERROR");
        }
        this.age = age;
        this.kinder = kinder;
    }
    public String toString() {
        new String();
        String s;
        String s1 = null;
        if (this.kinder.equals((Object)null)) {
            s = "Human{name='" + this.name + "', sex=" + this.sex + ", age=" + this.age + "}";
        } else {

            for (Human human : kinder) {
                if (human.sex)s1 = s1+" son "+ human.name;
                else s1 = s1+" daudher "+human.name;
            }
            s = "Human{name='" + this.name + "', sex=" + this.sex + ", age=" + this.age + ", kinder=" + s1 + "}";
        }
        return s;
    }
}