package com.lelik.mapDemo.treeMapDemo.robotInTreemap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
 - метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые,
то сравнение должно проходить по полю power
Вывести в консоль содержимое коллекции TreeMap
*/

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Zeus", 99);
        Robot robot3 = new Robot("Zeus", 98);
        Robot robot2 = new Robot("Lopuh", 108);
        Comparator<Robot> robotComparator = new RobotComparator();
        Comparator<Robot> robotPowerComparator = new RobotPowerComparator();
        Map<Robot, Integer> map = new TreeMap(robotComparator.thenComparing(robotPowerComparator));
        map.put(robot1, 1);
        map.put(robot2, 2);
        map.put(robot3, 3);
        for (Map.Entry<Robot, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
