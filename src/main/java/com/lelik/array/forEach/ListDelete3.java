package com.lelik.array.forEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class ListDelete3 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList();
        addList(list);
        remove3Element(list);
        outputList(list);
    }

    public static void addList(List list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("Введите строку");
            String s = reader.readLine();
            if (s.equals("")) {
                return;
            }
            list.add(s);
        }

    }

    public static List remove3Element(List<String> list) {
        list.remove(2);
        return list;
    }

    public static void outputList(List<String> list) {
        for (int i = list.size()-1; i >-1 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
