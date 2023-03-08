package com;

public class Abc {
    public static void main(String[] args) {

        System.out.println((true | true) + " TRUE");
        System.out.println((false | false) + " FALSE");
        System.out.println((true | false) + " TRUE");
        System.out.println((false | true) + " TRUE");
        System.out.println((true ^ true) + " FALSE");
        System.out.println((false ^ false) + " FALSE");
        System.out.println((true ^ false) + " TRUE");
        System.out.println((false ^ true) + " TRUE");
        System.out.println((true & true) + " TRUE");
        System.out.println((false & false) + " FALSE");
        System.out.println((true & false) + " FALSE");
        System.out.println((false & true) + " FALSE");

    }
}
