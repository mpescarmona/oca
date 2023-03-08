package com.mpescarmona.oca.whizlab.inheritance;

public class Override {
    class Base {
        void print() {
            System.out.println("default");
        }
    }

    class Extended extends Base {
        protected final void print() {
            System.out.println("extended");
        }
    }
}
