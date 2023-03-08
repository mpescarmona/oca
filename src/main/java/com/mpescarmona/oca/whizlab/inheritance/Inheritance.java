package com.mpescarmona.oca.whizlab.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {

    static int x = 0;
    static int i;

    public static void main(String[] args) {
        int x = 1;
        System.out.print(Interface2.print());

        try {
            Object o = Integer.valueOf(12);
            String s = new String("");
            List list = new ArrayList(1);
            list.add(1);
            list.add("A");
            list.add(new Integer(5));

            StringBuilder sb = new StringBuilder("Whizlab");
            sb.trimToSize();

            String ss = "111";
            ss.concat("2");
            ss += "3";

        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    public void print() throws NullPointerException, ArithmeticException {

    }


    interface Interface1 {
        public static void print() {
            System.out.println("Interface1");
        }
    }

    interface Interface2 extends Interface1 {
        static String print() {
            return "Interface2";
        }
    }

}
