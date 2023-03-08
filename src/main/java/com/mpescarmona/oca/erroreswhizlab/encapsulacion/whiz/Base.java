package com.mpescarmona.oca.erroreswhizlab.encapsulacion.whiz;

public class Base {
    public int x_public = 5;
    protected int x_protected = 10;
    int x_default = 15;
    private int x_private = 20;

    public void metodoPublic() {
        System.out.println("Base.metodoPublic");
    }

    protected void metodoProtected() {
        System.out.println("Base.metodoProtected");
    }

    void metodoDefault() {
        System.out.println("Base.metodoDefault");
    }

    private void metodoPrivate() {
        System.out.println("Base.metodoPrivate");
    }
}
