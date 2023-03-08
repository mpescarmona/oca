package com.mpescarmona.oca.chapter5;

class Marsupial {
    public static boolean isBipedHidden() {
        return false;
    }

    public boolean isBipedOverride() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs (Hidden method): " + isBipedHidden());
        System.out.println("Marsupial walks on two legs (Override method): " + isBipedOverride());
    }
}

public class Kangaroo extends Marsupial {
    public static boolean isBipedHidden() {
        return true;
    }

    public boolean isBipedOverride() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs (Hidden method): " + isBipedHidden());
        System.out.println("Kangaroo hops on two legs (Override method): " + isBipedOverride());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}