package com.lelik.array.forEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NNambersMax {
    public static void main(String[] args) throws IOException {
        System.out.println("Input N");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList();
        getIntegerList(list, n);
        for (Integer i : list) {
            System.out.println(i);
        }
        NNambersMax max = new NNambersMax();
        System.out.println(max.getMax(list));
    }
    static void getIntegerList(List<Integer> list, int n) throws IOException {
        for(int i = 0; i < n; ++i) {
            System.out.println("Input number");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(reader.readLine()));
        }
    }
    int getMax(List<Integer> list) {
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        return max;
    }
}
