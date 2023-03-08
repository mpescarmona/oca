/**
 *
 */
package com.mpescarmona.oca.chapter6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {
    public void bad() {
//        try {
//            eatCarrot();
//        } catch (NoMoreCarrotsException e) {// DOES NOT COMPILE
//            System.out.print("sad rabbit");
//        }
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    private static void eatCarrot() {
    }
}

class NoMoreCarrotsException extends Exception {}
