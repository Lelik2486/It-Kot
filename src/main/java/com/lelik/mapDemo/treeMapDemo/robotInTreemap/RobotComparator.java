package com.lelik.mapDemo.treeMapDemo.robotInTreemap;

import java.util.Comparator;

public class RobotComparator implements Comparator<Robot> {
    public int compare(Robot o1, Robot o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
