package com.lelik.toStringDemo;

public class Main {
        public static void main(String[] args) {
        Human human1 = new Human("Katerine", false, 55);
        Human human2 = new Human("Pavel", true, 58);
        Human human3 = new Human("Anna", false, 21, human2, human1);
        Human human4 = new Human("Bob", true, 23, human2, human1);
        new Human("Maria", false, 3, human4, human3);
        new Human("Pol", true, 2, human4, human3);
        System.out.println(human3);
        System.out.println(human1);
    }
}
