package com.lelik.mapDemo.hashMap.userJob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class AddingMap {
    public void adding(Map<User, String> map) {
        map.put(User.addingUser(new User()), addingJob());
    }

    public static String addingJob() {
        String s = null;

        try {
            System.out.println("Input Job");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s = reader.readLine();
        } catch (Exception ex) {
            addingJob();
        }
        return s;
    }
}
