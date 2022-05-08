package com.lelik.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxAndMinFromFive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] five = new int[5];

        int i;
        for(i = 0; i < five.length; ++i) {
            System.out.println("Input number");
            five[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(five);

        for(i = 0; i < five.length; ++i) {
            System.out.println(five[i]);
        }

        System.out.println("min = " + five[0]);
        System.out.println("max = " + five[five.length - 1]);
    }
}
