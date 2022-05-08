package com.lelik.array.forEach.ListOfCats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class MAndN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Input m");
        int m = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList();

        for(int i = 0; i < n; ++i) {
            System.out.println("Input string");
            list.add(reader.readLine());
        }

        for(int i = 0; i < m; ++i) {
            list.add(list.get(i));
        }

        List<String> list1 = new ArrayList();

        for(int i = m; i < m + n; ++i) {
            list1.add(list.get(i));
        }

        for (String s : list1) {
            System.out.println(s);
        }
    }
}
