package com.lelik.mapDemo.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода:
ключ - значение
ключ - значение
ключ - значение
ключ - значение
*/
/*
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/
/*
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printValues:
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class MapStringString {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Ivan", "Son");
        map.put("Gena", "Son");
        map.put("Lera", "Dauпhter");
        Iterator i = map.entrySet().iterator();

        while(i.hasNext()) {
            Entry<String, String> entry = (Entry)i.next();
            System.out.println(entry);
        }

        printKeys(map);
        printValues(map);
    }

    public static void printKeys(Map<String, String> map) {
        Iterator i = map.keySet().iterator();

        while(i.hasNext()) {
            String s = (String)i.next();
            System.out.println(s);
        }

    }

    public static void printValues(Map<String, String> map) {
        Iterator i = map.values().iterator();

        while(i.hasNext()) {
            String value = (String)i.next();
            System.out.println(value);
        }

    }
}
