package com.lelik.mapDemo.hashMap.userJob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User implements Comparable<User> {
    String name;
    int age;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

    public User() {
    }
        public static User addingUser(User user) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input name");
            user.setName(reader.readLine());
            System.out.println("Input age");
            user.setAge(Integer.parseInt(reader.readLine()));
            System.out.println("Input salary");
            user.setSalary(Integer.parseInt(reader.readLine()));
        } catch (Exception var2) {
            addingUser(new User());
        }
        return user;
    }
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }
    public String toString() {
        return this.name + " " + this.age + " " + this.salary;
    }
}
