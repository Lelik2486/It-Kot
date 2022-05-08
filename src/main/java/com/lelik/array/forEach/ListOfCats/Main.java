package com.lelik.array.forEach.ListOfCats;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметры с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Main {
    public static void main(String[] args) throws IOException {
        List<Cat> list = new ArrayList();
        Cat cat = new Cat();

        do {
            list.add(new Cat().setCat());
        } while(!cat.getName().equals(""));

        for (Cat c : list) {
            System.out.println(c);
        }

    }
}
