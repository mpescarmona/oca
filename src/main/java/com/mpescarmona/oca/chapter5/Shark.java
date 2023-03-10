package com.mpescarmona.oca.chapter5;

class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
        System.out.println();
    }

    public void displaySharkDetailsThis() {
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
        System.out.println();
    }

    public void displaySharkDetailsSuper() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
        System.out.println();
    }

    public static void main(String[] args) {
        Shark s = new Shark(10);
        s.displaySharkDetails();
        s.displaySharkDetailsThis();
        s.displaySharkDetailsSuper();
    }
}