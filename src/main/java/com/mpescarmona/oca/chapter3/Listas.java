package com.mpescarmona.oca.chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2,1);

        ArrayList<String> whizlArray = new ArrayList<>();
        whizlArray.add("coke");
        whizlArray.add("pepsi");
        whizlArray.add("miranda");

        System.out.println("Total Array List :: " + whizlArray);
        String[] ws1 = new String[whizlArray.size()];
        String[] ws2 = whizlArray.toArray(ws1);
        System.out.println("ws1 == ws2:" + (ws1 == ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));

        ws1 = new String[1];
        ws1[0] = "Test Data";
        ws2 = whizlArray.toArray(ws1);

        System.out.println("ws1 == ws2:" + (ws1 == ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));
    }
}
