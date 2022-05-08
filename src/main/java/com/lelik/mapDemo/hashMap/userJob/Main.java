package com.lelik.mapDemo.hashMap.userJob;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
Создать класс User с 3 полями - age(int), name(String), salary(int)
Создать коллекцию HashMap<User, String> и добавить туда 5 записей по принципу юзер-должность
Данные добавлять с консоли, используя BufferedReader

Разделить коллекцию HashMap на 3 коллекции TreeSet:
- в первую коллекцию сохранять пользователей с должностью - boss
- во вторую коллекцию сохранять пользователей с должностью - worker
- в третью коллекцию сохранять пользователей с другими должностями

Отсортировать пользователей с должностью boss по параметру salary и вывести содержимое коллекции в консоль
Отсортировать пользователей с должностью worker по параметру age и вывести содержимое коллекции в консоль
Отсортировать пользователей с другими должностями по параметру name и вывести содержимое коллекции в консоль
*/

public class Main {
    public static void main(String[] args) throws IOException {
        Map<User, String> map = new HashMap();
        AddingMap addingMap = new AddingMap();

        for(int i = 0; i < 5; ++i) {
            System.out.println("Input User " + (i + 1));
            addingMap.adding(map);
        }

        Comparator<User> userAgeComparator = new UserAgeComparator();
        Comparator<User> userSalaryComparator = new UserSalaryComparator();
        Map<User, String> treemap1 = new TreeMap(userSalaryComparator);
        Map<User, String> treemap2 = new TreeMap(userAgeComparator);
        Map<User, String> treemap3 = new TreeMap();

        for (Entry<User, String> entry : map.entrySet()) {
            User u = entry.getKey();
            String s = entry.getValue();
            if (s.equals("boss")) {
                treemap1.put(u, s);
            } else if (s.equals("worker")) {
                treemap2.put(u, s);
            } else {
                treemap3.put(u, s);
            }
        }
        System.out.println("Bosses");
        for (Entry<User, String> entryBoss : treemap1.entrySet()) {
            System.out.println(entryBoss);
        }
        System.out.println("Workers");
        for (Entry<User, String> entryWorker : treemap2.entrySet()) {
            System.out.println(entryWorker);
        }
        System.out.println("Other");
        for (Entry<User, String> entryOther : treemap3.entrySet()) {
            System.out.println(entryOther);
        }
    }
}
