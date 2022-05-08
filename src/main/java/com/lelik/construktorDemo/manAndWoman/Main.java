package com.lelik.construktorDemo.manAndWoman;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Alla", 24);
        new Cat("Murka", 4, woman);
        new Dog("Bobik", 6, woman);
        new Fish("Plavnik", 2, woman);
        Man man = new Man("Pol", 26, woman);
        woman.setHusband(man);
        System.out.println(woman.getHusband());
        System.out.println(man.getWife());
    }
}
