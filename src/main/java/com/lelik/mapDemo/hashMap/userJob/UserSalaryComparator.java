package com.lelik.mapDemo.hashMap.userJob;

import java.util.Comparator;

public class UserSalaryComparator implements Comparator<User> {
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
