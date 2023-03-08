package com.mpescarmona.oca.chapter2;

public class Prueba {
     void Prueba() {
    }
    Prueba(){}

    public static void main(String[] args) {
        int ar[][] = {{0, 1}, {-4}, {3, 1}};
        f1:
        for (int[] a : ar) {
            for (int x = 0; x < a.length; x++) {
                if (a[x] < 0) break f1;
                System.out.println(a[x]);
            }
        }
    }

    public static void main1(String[] args) {

//        String sss = "abcdef";
//        System.out.println();
//
//        Double d = 10.0 / 0.0;

        int x = 0;
        do {
            System.out.println("x = " + x);

        } while (x++ > 0);

//        int kk = 0;
//        while ((kk = 0) < 1) {
//            System.out.println("kk = " + kk);
//            kk++;
//        }

//        int[] a = {1,2,3};
//        a = new int[6];
//        System.out.println("a = " + a[2]);
//
//        d.isInfinite();
//
//        sss.substring(4);
//
//        int[] a1 = {1, 2, 3};
//        int[] a2 = {1, 2, 3};
//        Arrays.equals(a1, a2);
//
//        for (int j = 0, k = 5; j < k; k--) ;
//        for (int j = 0, k = 5; j++ < 3; ) ;
//        for (int i = 0; i < 5; i++, System.out.print(i + ".Hi ")) ;

    }
}
