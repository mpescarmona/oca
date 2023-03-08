package com.mpescarmona.oca.whizlab;

public class ControlStructures {
    public static void main(String[] args) {
        ex_02();
//        ex_03();
        ex_12();
        ex_15();
        ex_17();
    }

    public static void ex_02() {
        System.out.println("ControlStructures.ex_02");

        int ar[][] = {{1, 0}, {-4}, {3, 1}};
        f1:
        for (int[] a : ar) {
            for (int x = 0; x < a.length; x++) {
                if (a[x] < 0) break f1;
                System.out.print(a[x]);
            }
        }
    }

    public static void ex_03() {
        System.out.println("ControlStructures.ex_03");

        for (int x = 10; x > 5; x++) {
            if (x == 16) x -= 11;
            System.out.print(x + " ");
        }
    }

    public static void ex_12() {
        System.out.println("ControlStructures.ex_12");

        int ar[][] = {{1, 11}, {1}, {1, 11}};
        for (int x = 0; x < ar.length; x++) {
            for (int y : ar[x])
                System.out.print(y + " ");
        }
    }

    public static void ex_15() {
        System.out.println("ControlStructures.ex_15");

        int x = 0;
        do {
            System.out.print(x);
        } while (x++ < 2);

        for (x = 0; x++ < 2; )
            System.out.print(x);
    }

    public static void ex_17() {
        System.out.println("ControlStructures.ex_17");

        for (int x = 0; x < 10; x++) {
            if (x % 2 == 1) continue;
            System.out.print(x);
        }
    }

    public int calc(int a, int b) {
        return a + b;
    }
}
