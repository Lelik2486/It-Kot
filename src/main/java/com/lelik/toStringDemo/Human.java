package com.lelik.toStringDemo;

public class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;

    Human(String name, String s, int age) {
        if (s == "MEN") {
            this.sex = true;
        } else if (s == "WOMEN") {
            this.sex = false;
        } else {
            System.out.println("ERROR");
        }
        this.name = name;
        this.age = age;
    }

    Human(String name, String s, int age, Human father, Human mother) {
        if (s == "MEN") {
            this.sex = true;
        } else if (s == "WOMEN") {
            this.sex = false;
        } else {
            System.out.println("ERROR");
        }
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {
        new String();
        String s;
        String sex = null;
        if (this.sex = true)sex="men";
        else if(this.sex = false)sex = "women";
        if (this.father != null && this.mother != null) {
            s = "Human{name='" + this.name + "', sex=" + sex + ", age=" + this.age + ", father=" + this.father.name + ", mother=" + this.mother.name + "}";
        } else {
            s = "Human{name='" + this.name + "', sex=" + sex + ", age=" + this.age + "}";
        }

        return s;
    }
}
