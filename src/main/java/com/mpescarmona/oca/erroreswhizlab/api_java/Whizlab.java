package com.mpescarmona.oca.erroreswhizlab.api_java;

import java.util.ArrayList;
import java.util.List;

public class Whizlab {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Whizlab");
        char[] ch = new char[4];
        sb.getChars(1, 5, ch, 1);
        for (char c : ch)
            System.out.println(c);


        Api_Array.arrayChico();
        Api_Array.arrayGrande();
        Api_Array.arrayDeObject();
        Api_Array.integerMaxConObject();
    }
}

class Api_Array {
    public static void arrayChico() {
        System.out.println("\nWhizlab.arrayChico");
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        String[] arrayChico = new String[2];
        arrayChico = strings.toArray(arrayChico);

        for (String s : arrayChico) {
            System.out.print(s + " ");
        }
    }

    public static void arrayGrande() {
        System.out.println("\nWhizlab.arrayGrande");
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        String[] arrayGrande = new String[5];
        arrayGrande = strings.toArray(arrayGrande);

        for (String s : arrayGrande) {
            System.out.print(s + " ");
        }
    }

    public static void arrayDeObject() {
        System.out.println("\nWhizlab.arrayDeObject");
        List list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add("A");
        for (Object o :
                list) {
            System.out.println(o + " -> " + o.getClass());
        }
    }

    public static void integerMaxConObject() {
        System.out.println("\nWhizlab.integerMaxConObject");
        List list = new ArrayList<>();
        list.add(1);
        list.add(4);
        // La linea siguiente no compila, porque se le pasa a Integer.max un Object en lugar de in int
//        System.out.println(Integer.max(list.get(0),1));
    }
}

class Api_StringBuilder {

}
