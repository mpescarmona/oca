package com.mpescarmona.oca.chapter2;

public class InstanceOfClass {
    interface Animal {
        String getEspecie();
    }

    static class Gato implements Animal {
        @Override
        public String getEspecie() {
            return "gato";
        }
    }

    static class GatoSiames extends Gato {
        @Override
        public String getEspecie() {
            return "Siames";
        }
    }

    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.print("gato instanceof Animal: ");
        System.out.println(gato instanceof Animal);

        System.out.print("gato instanceof Gato: ");
        System.out.println(gato instanceof Gato);

        System.out.print("gato instanceof GatoSiames: ");
        System.out.println(gato instanceof GatoSiames);

        System.out.print("gato.getEspecie(): ");
        System.out.println(gato.getEspecie());

        System.out.println();
        GatoSiames gatoSiames = new GatoSiames();
        System.out.print("gatoSiames instanceof Animal: ");
        System.out.println(gatoSiames instanceof Animal);
        System.out.print("gatoSiames instanceof Gato: ");
        System.out.println(gatoSiames instanceof Gato);
        System.out.print("gatoSiames instanceof GatoSiames: ");
        System.out.println(gatoSiames instanceof GatoSiames);
        System.out.print("gatoSiames.getEspecie(): ");
        System.out.println(gatoSiames.getEspecie());
    }
}
