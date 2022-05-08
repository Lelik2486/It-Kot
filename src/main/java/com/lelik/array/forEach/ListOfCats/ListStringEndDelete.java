package com.lelik.array.forEach.ListOfCats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
/*программа работает для любого количества введенных строк*/

public class ListStringEndDelete {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList();
        addList(list);
        forEach(list);
    }

    public static void addList(List<String> list) throws IOException {
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

    public static void forEach(List<String> list) {
        for(int i = 0; i < list.size(); ++i) {
            endDelete(list);
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static List endDelete(List<String> list) {
        String s = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        list.add(0, s);
        return list;
    }
}
