package com.mpescarmona.oca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Whizlabs {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int[] myIntArray = new int[3];
        int[] myIntArray1 = {1, 2, 3};
        int[] myIntArray2 = new int[]{1, 2, 3};

        Arrays.sort(array, 1, 4);

        int[] copia = Arrays.copyOf(array, 5);
        for (int i : copia) {
            System.out.print(i + " ");
        }

        int[] enteros = {2, -1, 4, 5, 3};
        Arrays.sort(enteros);
        System.out.println(Arrays.binarySearch(enteros, -1));

//        Base base = new SubClass();
//        base.display();
//        base.print();
    }
}

class Base {
    public static void display() {
        System.out.println("static: Base");
    }

    public void print() {
        System.out.println("Print: Base");
    }
}

class SubClass extends Base {
    public static void display() {
        System.out.println("static: SubClass");
    }

    public void print() {
        System.out.println("Print: SubClass");
    }
}

public class JavaProgram {
    public static void main(String[] args) {
        oca1();
        oca2();
        oca3();
        oca4();
        oca5();
        oca6();
        oca7();
        oca8();
        oca9();
        for (String s : args) {
            System.out.println("s = " + s);
        }
    }

    private static void oca1() {
        System.out.println("JavaProgram.oca1");
        System.out.println(9 / 3); // Outputs 3 System.out.print(9 % 3); // Outputs 0
        System.out.println(10 / 3); // Outputs 3 System.out.print(10 % 3); // Outputs 1
        System.out.println(11 / 3); // Outputs 3 System.out.print(11 % 3); // Outputs 2
        System.out.println(12 / 3); // Outputs 4 System.out.print(12 % 3); // Outputs 0
    }

    private static void oca2() {
        System.out.println("JavaProgram.oca2");
        int x = 1;
        long y = 33;
        System.out.println(x * y);
    }

    private static void oca3() {
        System.out.println("JavaProgram.oca3");
        double x = 39.21;
        float y = 2.2f;
        System.out.println(x * y);
    }

    private static void oca4() {
        System.out.println("JavaProgram.oca4");
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    private static void oca5() {
        System.out.println("JavaProgram.oca5");
        int x = (int) 1.0;
        short y = (short) 1921222; // Stored as 20678
        int z = (int) 9l;
        long t = 192301398193810323L;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
    }

    private static void oca6() {
        System.out.println("JavaProgram.oca6");
        short x = 10;
        short y = 3;
        short z = (short) (x * y);
    }

    private static void oca7() {
        System.out.println("JavaProgram.oca7");

        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if (i == 8) keepGoing = false;
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
    }

    private static void oca8() {
        System.out.println("JavaProgram.oca8");

        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list 22: System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array)
            System.out.print(b + " "); // new test
        list.remove(1); // throws UnsupportedOperation Exception
    }

    private static void oca9() {
        List<String> list = new ArrayList<>();
        list.add(0, "Cero");
        list.add(1, "Uno");
        list.add("Dos");
        list.add("Uno");
        list.set(3, "Tres");
        System.out.println("list = " + list);


        System.out.println("list.removeAll(Collections.singleton(\"Uno\")): " + list.removeAll(Collections.singleton("Uno")));
        System.out.println("list.removeIf(\"Uno\"::equals): " + list.removeIf("Uno"::equals));
        System.out.println("list = " + list);

        System.out.println("list.remove(\"Uno\"): " + list.remove("Uno"));
        System.out.println("list = " + list);

        System.out.println("list.remove(0): " + list.remove(0));
        System.out.println("list = " + list);

//        int[] vars4[] = {}, space[][] = {{{1, 2, 3}}, {{4, 5, 6}}, {{7, 8, 9}}}; // a 2D AND a 3D array
//        for (int i = 0; i < space.length; i++) {
//            for (int j = 0; j < space[i].length; j++) {
//                for (int k = 0; k < space[i][j].length; k++) {
//                    System.out.println("space[" + i + "][" + j + "][" + k + "] = " + space[i][j][k]);
//                }
//            }
//        }
    }
}