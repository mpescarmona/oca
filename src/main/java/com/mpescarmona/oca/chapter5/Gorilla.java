package com.mpescarmona.oca.chapter5;

import java.util.function.Predicate;

 interface Terricola {
    static String a = "11";
    public default void method() {
        System.out.println("Terricola");
    }
    public String reino = "";
    public Integer patas = 0;

    static void printReino() {
        System.out.println("reino = " + reino);
    }

    default void printPatas() {
        System.out.println("patas = " + patas);
    }
}

abstract class SerVivo implements Terricola {
    protected abstract void print();
}

class Animal extends SerVivo {
    private int age;
    private String name;

    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
        method();
    }

    public Animal(int age) {
        this.age = age;
        this.name = null;
    }

    public void print() {
        System.out.print("age = " + age);
        System.out.println(", name = " + name);
    }

    @Override
    public void method() {
        System.out.println("Animal");
    }

    private void imprimirClase() {
        System.out.println("Animal.imprimirClase");
    }

}

public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void imprimirClase() {
        System.out.println("Gorilla.imprimirClase");
    }

    public static void main(String[] args) {
        Gorilla gorilla1 = new Gorilla();
        gorilla1.print();

        Animal animal = new Gorilla(3);
//        Esta linea da error porque se intenta acceder a un metodo privado desde afurea de la clase donde está definido
//        animal.imprimirClase();

        System.out.println(gorilla1 instanceof Gorilla);
        System.out.println(gorilla1 instanceof Animal);
        System.out.println(gorilla1 instanceof Terricola);
    }
}
