package com.mpescarmona.oca.chapter5;

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    /*
    // DOES NOT COMPILE: sneeze() is marked as static in the parent class but not in the child class
    public void sneeze() {
        System.out.println("Panda bear sneezes quietly");
    }

    // DOES NOT COMPILE: hibernate() is an instance member in the parent class but a static method in the child class
    public static void hibernate() {
        System.out.println("Panda bear is going to sleep");
    }
    */

    public static void main(String[] args) {
        Panda.eat();
    }
}