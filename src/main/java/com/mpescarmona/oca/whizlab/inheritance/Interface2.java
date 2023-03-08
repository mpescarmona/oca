package com.mpescarmona.oca.whizlab.inheritance;

public class Interface2 {
    interface Runnable {
        public void run();
    }

    public static void main(String[] args) {
//        Runnable run1 = () -> {System.out.println("Run");}
        Runnable run2 = () -> System.out.println("Run");
    }
}
