package com.lelik.array.forEach.humanInfo;

import java.util.ArrayList;
import java.util.List;

/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Gena", "MEN", 4);
        Human human2 = new Human("Karina", "WOMEN", 6);
        Human human3 = new Human("Sveta", "WOMEN", 8);
        List<Human> list1 = new ArrayList();
        list1.add(human1);
        list1.add(human2);
        list1.add(human3);
        Human human4 = new Human("papa Fedya", "MEN", 40, list1);
        Human human5 = new Human("mama Lora", "WOMEN", 40, list1);
        List<Human> list2 = new ArrayList();
        list2.add(human4);
        list2.add(human5);
        Human human6 = new Human("ded Ivan", "MEN", 70, list2);
        new Human("baba Zina", "WOMEN", 72, list2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
    }
}
