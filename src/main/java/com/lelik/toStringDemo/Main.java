package com.lelik.toStringDemo;

public class Main {
        public static void main(String[] args) {
        Human human1 = new Human("Katerine", "WOMEN", 55);
        Human human2 = new Human("Pavel", "MEN", 58);
        Human human3 = new Human("Anna", "WOMEN", 21, human2, human1);
        Human human4 = new Human("Bob", "MEN", 23, human2, human1);
        new Human("Maria", "WOMEN", 3, human4, human3);
        new Human("Pol", "MEN", 2, human4, human3);
        System.out.println(human3);
        System.out.println(human1);
    }
}
