package com.lelik.array.forEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
лира
лоза
роза

Выходные данные:
лира
лоза
лоза
*/

public class LetterPAndL {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList();
        addList(list);
        list = fix(list);
        printList(list);
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

    public static List fix(List<String> list) {
        List list1 = new ArrayList();
        for (String s : list) {
            if (s.contains("р") && s.contains("л")) {
                list1.add(s);
            } else if (s.contains("л")) {
                list1.add(s);
                list1.add(s);
            } else if (!s.contains("р")) {
                list1.add(s);
            }
        }
        return list1;
    }

    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
