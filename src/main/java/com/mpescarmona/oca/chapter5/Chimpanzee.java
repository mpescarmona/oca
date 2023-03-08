package com.mpescarmona.oca.chapter5;

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
    public void print(){
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
    public void print(String s){
        System.out.println(s);
    }
}

public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();

        Primate p = new Ape();
        p.print();
        // Falla al compilar
//        p.print("a");
    }
}