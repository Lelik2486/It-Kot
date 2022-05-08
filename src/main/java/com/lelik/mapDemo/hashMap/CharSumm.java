package com.lelik.mapDemo.hashMap;

/*
Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Используй метод класса String - toCharArray();

Пример ввода:
String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
String text2 = "абв";
String text3 = "ддд";
String text4 = "яяа";
String text5 = "вввв";
Пример вывода:
а 3
б 2
в 6
г 1
д 4
…
я 3
*/

/* алфавит был использован русский. строки вводить на русском*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharSumm {

    public static void main(String[] args) throws IOException {
        CharSumm charSumm = new CharSumm();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap();
        System.out.println("Input String");
        map.put("String text1", reader.readLine());
        System.out.println("Input String");
        map.put("String text2", reader.readLine());
        System.out.println("Input String");
        map.put("String text3", reader.readLine());
        System.out.println("Input String");
        map.put("String text4", reader.readLine());
        System.out.println("Input String");
        map.put("String text5", reader.readLine());
        char[] abc = new char[32];
        abc[0] = 1072;

        for(int i = 1; i < 32; ++i) {
            abc[i] = (char)(abc[i - 1] + 1);
        }

        for(int i = 0; i < abc.length; ++i) {
            System.out.println(abc[i] + " " + charSumm.count(map, abc[i]));
        }

    }

    public Integer count(Map<String, String> map, char c) {
        int counter = 0;
        Iterator a = map.values().iterator();

        while(a.hasNext()) {
            String value = (String)a.next();
            char[] ch = value.toCharArray();

            for(int i = 0; i < ch.length; ++i) {
                char c1 = ch[i];
                if (c1 == c) {
                    ++counter;
                }
            }
        }

        return counter;
    }
}
