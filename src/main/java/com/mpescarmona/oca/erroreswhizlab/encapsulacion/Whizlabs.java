package com.mpescarmona.oca.erroreswhizlab.encapsulacion;

import java.time.Clock;
import java.time.LocalDate;

public class Whizlabs {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCDED");
        sb.delete(4,6);
        sb.ensureCapacity(22);
        System.out.print(sb.capacity());
        sb.ensureCapacity(23);
        System.out.print(sb.capacity());
    }
}
