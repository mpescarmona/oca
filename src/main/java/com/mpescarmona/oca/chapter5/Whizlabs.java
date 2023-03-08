package com.mpescarmona.oca.chapter5;
interface I1 {
    public static void print(){
        System.out.println("print");
    };
}
interface Interfaz extends I1{
    void method();
    public static void print(){
        System.out.println("print");
    };
}

class Clase implements Interfaz {
    public void  method() {
        System.out.println("Clase");
    }
}

class SubClase extends Clase implements Interfaz {
    public void method() {
        System.out.println("SubClase");
    }
}

public class Whizlabs {
    public static void main(String[] args) {
        Interfaz.print();
        Clase clase = new Clase();
        // Esta linea da ClassCastException en tiempo de ejecucion porque se intenta Castear un objeto de una superclase clase una subclase
        SubClase subClase = (SubClase) clase;
        subClase.method();
    }
}
