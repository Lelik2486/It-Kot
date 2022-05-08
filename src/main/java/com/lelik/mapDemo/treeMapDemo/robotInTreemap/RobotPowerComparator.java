package com.lelik.mapDemo.treeMapDemo.robotInTreemap;

import java.util.Comparator;

public class RobotPowerComparator implements Comparator<Robot> {
    public int compare(Robot o1, Robot o2) {
            return Integer.compare(o1.getPower() , o2.getPower());
    }
}