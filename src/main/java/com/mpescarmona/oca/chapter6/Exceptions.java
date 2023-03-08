package com.mpescarmona.oca.chapter6;

public class Exceptions {
    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "Before";
                v.length();
                result += "After";
            } catch (NullPointerException e) {
                result += "Catch";
                throw new RuntimeException();
            } finally {
                result += "Finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "Done";
        }
        return result;
    }

    public static void main(String[] args) {
        String exceptions = exceptions();
        System.out.println("exceptions = " + exceptions);
    }
}
